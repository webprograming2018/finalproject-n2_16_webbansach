/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HOANG
 */
public class Publisher {
    private long publisher_ID;
    private String publisher_Name;

    public Publisher() {
    }

    public Publisher(long publisher_ID, String publisher_Name) {
        this.publisher_ID = publisher_ID;
        this.publisher_Name = publisher_Name;
    }

    public long getPublisher_ID() {
        return publisher_ID;
    }

    public void setPublisher_ID(long publisher_ID) {
        this.publisher_ID = publisher_ID;
    }

    public String getPublisher_Name() {
        return publisher_Name;
    }

    public void setPublisher_Name(String publisher_Name) {
        this.publisher_Name = publisher_Name;
    }
    
}
