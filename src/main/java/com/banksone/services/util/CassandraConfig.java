package com.banksone.services.util;


import com.datastax.oss.driver.api.core.CqlSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

//@Configuration
//@EnableCassandraRepositories
//@Configuration
public class CassandraConfig {
//    public @Bean
//    CqlSession session() {
//        return CqlSession.builder().withKeyspace("vod").build();
//    }
}

//public class CassandraConfig { //extends AbstractCassandraConfiguration {
//
//    @Value("${cassandra.contactpoints}")
//    private String contactPoints;
//
//    @Value("${cassandra.port}")
//    private int port;
//
//    @Value("${cassandra.keyspace}")
//    private String keySpace;
//
//    @Value("${cassandra.basePackages}")
//    private String basePackages;
//
//    @Override
//    protected String getKeyspaceName() {
//        return keySpace;
//    }
//
//    @Override
//    protected String getContactPoints() {
//        return contactPoints;
//    }
//
//    @Override
//    protected int getPort() {
//        return port;
//    }
//
//    @Override
//    public SchemaAction getSchemaAction() {
//        return SchemaAction.CREATE_IF_NOT_EXISTS;
//    }
//
//    @Override
//    public String[] getEntityBasePackages() {
//        return new String[] {basePackages};
//    }
//}
