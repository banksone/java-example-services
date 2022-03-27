package com.banksone.services.controllers;

import com.banksone.services.domain.Stat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.query.Criteria;
import org.springframework.data.cassandra.core.query.Query;

import com.datastax.oss.driver.api.core.CqlSession;

@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    @GetMapping("/moviesapi/list")
    List<Stat> getMovies() {
        CqlSession cqlSession = CqlSession
                .builder()
                .addContactPoint(new InetSocketAddress("cass_seedprovider", 9042))
                .withLocalDatacenter("datacenter1")
                .withKeyspace("vod").build();

        CassandraOperations template = new CassandraTemplate(cqlSession);

        Stat resultStat = template.selectOne(Query.query(Criteria.where("budget").is(29932L)), Stat.class);
        LOGGER.info("result from db: ", resultStat);

        ArrayList<Stat> resultsList = new ArrayList();
        resultsList.add(resultStat);
        cqlSession.close();

        return resultsList;
    }

    @GetMapping("/moviesapi/recommendations")
    HashMap<String, String> getRecommendations() {
        HashMap jsonMap = new HashMap<String, String>();
        jsonMap.put("text", "yes Im alive");
        return jsonMap;
    }

    @GetMapping("/moviesapi/preferences")
    HashMap<String, String> getPreferences() {
        HashMap jsonMap = new HashMap<String, String>();
        jsonMap.put("text", "prefs");
        return jsonMap;
    }

//    @GetMapping("/moviesapi/details/{id}")
//    HashMap<String, String> getDetails(@PathVariable long id) {
//        Optional<User> user = userService.getById(id);
//        if (user.isPresent()) {
//            return new ResponseEntity<>(user.get(), HttpStatus.OK);
//        } else {
//            throw new RecordNotFoundException();
//        }
//    }
//
//    @PostMapping(path = "/moviesapi/like",
//            consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<User> giveLike(@RequestBody User newUser) {
//        User user = userService.save(newUser);
//        if (user == null) {
//            throw new ServerException();
//        } else {
//            return new ResponseEntity<>(user, HttpStatus.CREATED);
//        }
//    }
}
