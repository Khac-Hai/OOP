package com.cuoiky.control;

public class Author {
    private int authorID;
    private String name;

    public Author(int authorID, String name){
        this.authorID = authorID;
        this.name = name;
    }

    public int getAuthorId() {
        return authorID;
    }

    public void setAuthorId(int authorId) {
        this.authorID = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
