package cc.openhome;

import java.io.Serializable;

/**
 * Created by zhujie on 16/2/15.
 */
public class Message implements Serializable {
    private String name;
    private String text;

    public Message() {
    }

    public Message(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}