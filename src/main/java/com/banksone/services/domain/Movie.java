package com.banksone.services.domain;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("movies")
public class Movie {

    @PrimaryKey private final String id;
    @Column(value = "title") private final String title;
    @Column(value = "overview") private final String overview;
    @Column(value = "homepage") private final String homepage;


    public String getOverview() {
        return this.overview;
    }

    public String getHomepage() {
        return this.homepage;
    }

    public Movie(String id, String title, String overview, String homepage) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.homepage = homepage;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return String.format("{ @type = %1$s, id = %2$s, title = %3$s }", getClass().getName(), getId(),
                getTitle(), getOverview(), getHomepage());
    }

//    @CassandraType(type = Name.UDT, userTypeName = "tags")
//    UDTValue alternative;
}

/**
 budget bigint,
 genres frozen<list<id_name>>,
 homepage text,
 id bigint PRIMARY KEY,
 keywords frozen<list<id_name>>,
 original_language text,
 original_title text,
 overview text,
 popularity double,
 production_companies frozen<list<id_name>>,
 production_countries frozen<list<iso_name>>,
 release_date date,
 revenue double,
 runtime int,
 spoken_languages frozen<list<iso_name>>,
 status text,
 tagline text,
 title text,
 vote_average double,
 vote_count bigint
 */