package com.company;

public class Main {

    public static void main(String[] args) {
        Money money=new Money();
        Money anotherMoney=money;

        money.setOrigin("America");
        money.setValue(4);
        money.setCurrency("leu");
        money.setValid(true);
        money.setPersonName("Bianca");

        changeOrigin(anotherMoney,"UK");
        changeValue(anotherMoney,5);
        changeCurrency(anotherMoney,"lire");
        changeValid(anotherMoney,false);
        changeName(anotherMoney,"Andreea");

        System.out.println(anotherMoney.getCurrency());
        System.out.println(anotherMoney.getOrigin());
        System.out.println(anotherMoney.getValue());
        System.out.println(anotherMoney.getPersonName());
        System.out.println(anotherMoney.isValid());
        
    }

    static void changeOrigin(Money m, String origin){
        m.setOrigin(origin);
    }

    static void changeValue(Money m,int val){
        m.setValue(val);
    }

    static void changeCurrency(Money m,String currency){
        m.setCurrency(currency);
    }

    static void changeValid(Money m, boolean isValid){
        m.setValid(isValid);
    }

    static void changeName(Money m, String name){
        m.setPersonName(name);
    }
}
