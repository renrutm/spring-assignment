package com.mkturner.maven.springassignment.models;

import lombok.Builder;

public class ShippingAddress extends BaseAddress implements Address{

    public ShippingAddress() {
        super.setType("Shipping");
    }

    @Override
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @Override
    public void setLine2(String line2) {
        this.line2 = line2;

    }

    @Override
    public void setCity(String city) {
        this.city = city;

    }

    @Override
    public void setState(String state) {
        this.state = state;

    }

    @Override
    public void setZip(String zip) {
        this.zip = zip;

    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }
}
