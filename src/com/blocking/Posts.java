package com.blocking;



public class Posts implements Comparable<Posts> {
  
    private String message;
    
    public Posts(String newMessage) {
            message = newMessage;
    }
    
    public Posts() {
          // TODO Auto-generated constructor stub
    }
    
    public int compareTo(Posts f) {
        String ourMessage = getMessage(); // box it up!
        String otherMessage = f.getMessage();
        
        // flip the costs around so if ours is higher, it is 
        // put at a lower ranking.
        return otherMessage.compareTo(ourMessage);
    }
      
    public String getMessage() {
      return message;
    }

}
