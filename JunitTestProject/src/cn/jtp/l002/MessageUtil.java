package cn.jtp.l002;

public class MessageUtil {

    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(this.message);
        return "print" + this.message;
    }
}
