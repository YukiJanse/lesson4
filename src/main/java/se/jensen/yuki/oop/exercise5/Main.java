package se.jensen.yuki.oop.exercise5;

public class Main {
    public static void main(String[] args) {
        Email email = new Email();
        email.setTo("hakan@email.co.jp");
        // email.setCc("emma@email.co.jp");
        email.setFrom("yuki@email.co.jp");
        email.setSubject("Angående projekt");
        email.setMessage("""
                Hej, Håkan!
                
                Jag ser att projekten har blivit klumpigt. Jag behöver lite hjälp när du har tid.
                """);

        email.send();
        email.setCc("emma@email.co.jp");
        email.send();
    }
}
