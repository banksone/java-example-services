package com.banksone.services.domain;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("movies")
public class Movie {

    @PrimaryKey private final String id;
    @Column("title") private final String title;


    public Movie(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    private String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("{ @type = %1$s, id = %2$s, title = %3$s }", getClass().getName(), getId(),
                getTitle());
    }

//    @CassandraType(type = Name.UDT, userTypeName = "tags")
//    UDTValue alternative;
}

