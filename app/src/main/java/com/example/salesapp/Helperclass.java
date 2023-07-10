package com.example.salesapp;


    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Helperclass(String fullname, String email, String password, String phonenumber) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.phonenumber = phonenumber;
    }

    public Helperclass() {
    }
}
