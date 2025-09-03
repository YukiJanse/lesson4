package se.jensen.yuki.oop.exercise5;

public class Email {
    private String to;
    private String from;
    private String subject;
    private String message;
    private String cc;


    public void setTo(String to) {
        this.to = to;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void send() {
        if (to != null && from != null && subject != null && message != null) {
            System.out.println("Sending email....");
            System.out.println("********************************");
            System.out.println("To: " + to);
            // If cc is not null, show cc as well
            System.out.print((cc != null ? "CC: " + cc + "\n" : ""));
            System.out.println("From: " + from);
            System.out.println("Subject: " + subject);
            System.out.println("Message: \n" + message);
            System.out.println("********************************");
            System.out.println("Mejlet har skickats.");
        } else {
            System.out.println("Mejlet kan inte skickas.");
        }
    }


}
