package org.hillel.it.netzwerk.model.entity;

import java.util.ArrayList;
import java.util.List;
public class User
{
    private String userName;
    private String password;
    private Profile userProfile;
    private List<Contact> contactList = new ArrayList();
    private List<Message> timeLine = new ArrayList();
    private List<Message> inbox = new ArrayList();

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Profile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(Profile userProfile) {
        this.userProfile = userProfile;
    }

    public void addChat(Message m){
        timeLine.add(m);
    }

public boolean equals(Object o)
    {

        User c2 = (User)o;
        if (this.userName.equals(c2.userName))
            return true;
        else
            return false;


    }
    
public String toString(){
    
     return "\n"+this.timeLine.toString();
   
}
}
