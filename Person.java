import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Person {
    protected String name;
    protected String Address;
    
    Person(String name, String Address){
        this.name = name;
        this.Address = Address;
    }
    Person(){
    }
    String getname(){
        return name;
    }
    String getAddress(){
        return Address;
    }
    void setAddress(String address){
        address = Address;
    }
    public String toString() {
    return ("Nama = " + name +
            "Address = " + super.toString());
    }
}
