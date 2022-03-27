package com.banksone.services.domain;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Table("movies_stats")
public class Stat {

    @PrimaryKey private final long budget;

    public Stat(long budget) {
        this.budget = budget;
    }

    public long getBudget() {
        return this.budget;
    }

    @Override
    public String toString() {
        return String.format("{ @type = %1$s, budget = %2$s }", getClass().getName(), getBudget());
    }
}

