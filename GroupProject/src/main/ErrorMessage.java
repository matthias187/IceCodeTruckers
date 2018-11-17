package main;

import java.util.Date;

public class ErrorMessage {

    private String message;
    private Date dateSubmitted;
    private User userSubmittedBy;

    public ErrorMessage(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public User getUserSubmittedBy() {
        return userSubmittedBy;
    }

    public void setUserSubmittedBy(User userSubmittedBy) {
        this.userSubmittedBy = userSubmittedBy;
    }
}
