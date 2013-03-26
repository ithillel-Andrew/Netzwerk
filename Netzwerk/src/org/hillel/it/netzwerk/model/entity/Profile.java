package org.hillel.it.netzwerk.model.entity;

public class Profile{
	
	private String nickname;
    private String userPicture;
    private String firstName;
    private String lastName;
    private String location;
    private String email;
    
   

    public Profile(String nickname, String userPicture, String firstName, String lastName, String location,  String email) {
    	
    	this.nickname = nickname;
    	this.userPicture = userPicture;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
         this.email = email;
       
       
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

   
    public boolean changeEmail(){
        return true;
    }
    public boolean changePassword(){
        return true;
    }
    public boolean updateProfile(){
        return true;
    }

}
