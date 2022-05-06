package com.example.networking;

import android.net.Uri;

public class Auxdata {
    private String wiki;
    private Uri imageUri;

    public Auxdata(String wiki, Uri imageUri) {
        this.wiki = wiki;
        this.imageUri = imageUri;
    }

    public String getWiki() {
        return wiki;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }

    public Uri getImageUri() {
        return imageUri;
    }

    public void setImageUri(Uri imageUri) {
        this.imageUri = imageUri;
    }
}
