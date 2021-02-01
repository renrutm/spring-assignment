package com.mkturner.maven.springassignment.models;

import lombok.*;

public abstract class BaseAddress {
    protected String line1;
    protected String line2;
    protected String city;
    protected String state;
    protected String zip;
    protected String country;

    @Setter(AccessLevel.NONE)
    private String type = "Residential";

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public String getType() {
        return type;
    }

    public abstract void setLine1(String line1);

    public abstract void setLine2(String line2);

    public abstract void setCity(String city);

    public abstract void setState(String state);

    public abstract void setZip(String zip);

    public abstract void setCountry(String country);

    protected void setType(String type) {
        this.type = type;
    }
}