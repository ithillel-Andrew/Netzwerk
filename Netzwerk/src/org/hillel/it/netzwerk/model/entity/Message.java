package org.hillel.it.netzwerk.model.entity;

import org.hillel.it.netzwerk.model.entity.User;

public class Message {

	private String content;
	 private String timeStamp;

	  public Message(String content, String timeStamp) {
	      this.content = content;
	      this.timeStamp  = timeStamp;
	  }
	 public boolean directMessage(String content, String timeStamp, User recipient){
	     return true;

	 }
	 public String toString()
	  {
	     return "\n '"+this.content+"' \nsent on "+this.timeStamp;
	  }
	}
  