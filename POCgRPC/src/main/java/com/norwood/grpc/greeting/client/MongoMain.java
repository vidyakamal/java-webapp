package com.norwood;


import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoMain {
    public static void main(String args[]){
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB database = mongoClient.getDB("myMongoDb");
        database.createCollection("customers", null);
        DBCollection collection = database.getCollection("customers");
        BasicDBObject document = new BasicDBObject();
        document.put("name", "Shubham");
        document.put("company", "Baeldung");
        collection.insert(document);
        database.getCollectionNames().forEach(System.out::println);


    }
}
