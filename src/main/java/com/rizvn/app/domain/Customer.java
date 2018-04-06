package com.rizvn.app.domain;

/**
 * Created by Riz
 */
public class Customer
{
  String ref;
  String name;
  String addressLine1;
  String town;
  String county;
  String postcode;
  Boolean active;

  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  @Override
  public String toString() {
    return "Customer{" +
    "ref='" + ref + '\'' +
    ", name='" + name + '\'' +
    ", addressLine1='" + addressLine1 + '\'' +
    ", town='" + town + '\'' +
    ", county='" + county + '\'' +
    ", postcode='" + postcode + '\'' +
    ", active=" + active +
    '}';
  }
}
