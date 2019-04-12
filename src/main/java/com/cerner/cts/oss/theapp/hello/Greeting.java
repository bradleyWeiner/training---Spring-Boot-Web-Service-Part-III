package com.cerner.cts.oss.theapp.hello;

import java.util.Objects;


public class Greeting {
    private String content;
    private String id;

    public Greeting(String id,
                    String content
                    ) {
        this.id = id;
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Greeting greeting = (Greeting) o;
        return id == greeting.id &&
                Objects.equals(content, greeting.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, id);
    }
}
