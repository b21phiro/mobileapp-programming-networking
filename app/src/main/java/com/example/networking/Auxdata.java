package com.example.networking;

public class Auxdata {
    private String wiki, image;

    public Auxdata(String wiki, String image) {
        this.wiki = wiki;
        this.image = image;
    }

    public String getWiki() {
        return wiki;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
