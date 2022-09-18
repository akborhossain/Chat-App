package com.friends.chatapp.Model;

public class Chat {

    private String sender;
    private String receiver;
    private String message;
    private boolean isseen;
    private long datetimeint;



    public Chat(String sender, String receiver, String message, boolean isseen, long datetimeint) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.isseen = isseen;
        this.datetimeint=datetimeint;
    }

    public Chat() {
    }

    public long getDatetimeint() {
        return datetimeint;
    }

    public void setDatetimeint(long datetimeint) {
        this.datetimeint = datetimeint;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isIsseen() {
        return isseen;
    }

    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }
}
