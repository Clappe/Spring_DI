package com.DepedenceInject;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection_JavaCollection {
    private List addressList;
    private Set addressSet;
    private Map addressMap;
    private Properties addressProperties;
    private String address;
    private String email;

    public List getAddressList() {
        System.out.println("List Elements: " + addressList);
        return addressList;
    }

    public Set getAddressSet() {
        System.out.println("Set Elements: " + addressSet);
        return addressSet;
    }

    public Map getAddressMap() {
        System.out.println("Map Elements: " + addressMap);
        return addressMap;
    }

    public Properties getAddressProperties() {
        System.out.println("Properties Elements: " + addressProperties);
        return addressProperties;

    }

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public void setAddressProperties(Properties addressProperties) {
        this.addressProperties = addressProperties;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        System.out.println("Address: " + address);
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        System.out.println("Email: " + email);
        return email;
    }
}
