package com.galvanize;
import java.util.*;
import java.util.List;



public class Address {
    // the Address class has
    // four fields
  private String street;
  private String city;
  private String state;
  private String zip;

  // the Address class has
  // one constructor
  public Address(String street, String city, String state, String zip) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
  };

  // the Address class has
  // no methods

  // the Address class has
  // four getters and setters
  public String getStreet() {
    return street;
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

  public void setStreet( String street) {
    this.street = street;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setState( String state) {
    this.state = state;
  }

  public void setZip( String zip) {
    this.zip = zip;
  }

  @Override public String toString() {
  StringBuilder result = new StringBuilder();
  result.append(street + ", " + city + ", " + state + " " + zip);
  return result.toString();
  }

}

  