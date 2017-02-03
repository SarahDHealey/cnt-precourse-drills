
package com.galvanize;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable {
  //the business class has fields
  private String name;
  private ArrayList<Address> addresses = new ArrayList<Address>();

  //the business class has a constructor
  public Business(String name) {
    this.name = name;
  }

  //the business class has a getter for name
  public String getName() {
    return name;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void addAddress(Address address) {
    addresses.add(address);
  }

}

  