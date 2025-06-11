package com.pluralsight.data;

import org.apache.commons.dbcp2.BasicDataSource;

public class NorthwindDataManager {
    private BasicDataSource dataSource;

    public NorthwindDataManager(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }
}
