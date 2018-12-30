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
public class Author {
    private long author_ID;
    private String author_Name;

    public Author() {
    }

    public Author(long author_ID, String author_Name) {
        this.author_ID = author_ID;
        this.author_Name = author_Name;
    }

    public long getAuthor_ID() {
        return author_ID;
    }

    public void setAuthor_ID(long author_ID) {
        this.author_ID = author_ID;
    }

    public String getAuthor_Name() {
        return author_Name;
    }

    public void setAuthor_Name(String author_Name) {
        this.author_Name = author_Name;
    }
    
}
