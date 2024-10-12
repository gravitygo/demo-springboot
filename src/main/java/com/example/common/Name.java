package com.example.common;

public class Name {
  private String firstName;
  private String lastName;
  private String middleName;

  public Name(
      String firstName,
      String lastName,
      String middleName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getMiddleName() {
    return middleName;
  }
}
