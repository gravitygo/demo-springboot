package com.example.common;

public class Address {
  private String street;
  private String city;
  private String state;
  private String country;

  public Address(
      String street,
      String city,
      String state,
      String country) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.country = country;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getStreet() {
    return street;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCity() {
    return city;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCountry() {
    return country;
  }
}
