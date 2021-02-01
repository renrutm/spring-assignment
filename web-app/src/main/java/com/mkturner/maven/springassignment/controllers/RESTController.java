package com.mkturner.maven.springassignment.controllers;

import com.mkturner.maven.springassignment.models.ShippingAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RESTController {

    @RequestMapping("/")
    public Map<String, Object> getShippingAddress() {
        Map<String,Object> returnVal = new HashMap<>();
        ShippingAddress shippingAddress = new ShippingAddress();
        shippingAddress.setLine1("line1");
        shippingAddress.setLine2("line2");
        shippingAddress.setCity("city");
        shippingAddress.setState("state");
        shippingAddress.setZip("zip");
        shippingAddress.setCountry("country");

        returnVal.put("ShippingAddress", shippingAddress);

        return returnVal;
    }
}
