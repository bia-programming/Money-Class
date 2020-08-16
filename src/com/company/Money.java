package com.company;

public class Money {
    String origin;
    String personName;
    String currency;
    int value;
    boolean isValid;

    public Money(){

    }

    public Money(String origin,String personName,String currency,int value,boolean isValid){
        this.origin=origin;
        this.personName=personName;
        this.currency=currency;
        this.value=value;
        this.isValid=isValid;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
