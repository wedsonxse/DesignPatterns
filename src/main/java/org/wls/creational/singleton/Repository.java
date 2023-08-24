package org.wls.creational.singleton;

import javax.xml.crypto.Data;

public class Repository {
    private DatabaseDriver database; // meu singleton
    private static Repository instance;
    private Repository(){
        this.database = new DatabaseDriver();
    }

    public static Repository getInstance(){
        if(Repository.instance == null){
            Repository.instance = new Repository();
        }
        return Repository.instance;
    }

    public DatabaseDriver getDriver(){
        return this.database;
    }
}
