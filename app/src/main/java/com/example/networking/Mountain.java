package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {
    @SerializedName("ID")
    private String id;
    private String name, type, company, location, category;
    private Integer cost, size;
    private Auxdata auxdata;

    public Mountain(String id, String name, String type, String company, String location, String category, Integer cost, Integer size, Auxdata auxdata) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.company = company;
        this.location = location;
        this.category = category;
        this.cost = cost;
        this.size = size;
        this.auxdata = auxdata;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Auxdata getAuxdata() {
        return auxdata;
    }

    public void setAuxdata(Auxdata auxdata) {
        this.auxdata = auxdata;
    }
}
