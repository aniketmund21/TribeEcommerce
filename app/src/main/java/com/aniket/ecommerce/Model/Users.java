package com.aniket.ecommerce.Model;

public class Users {
    private String Name, Password, Phone;
    public Users(){

    }

    public Users(String name, String password, String phone) {
        this.Name = name;
        this.Password = password;
        this.Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }
}
