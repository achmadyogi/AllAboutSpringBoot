/**
 * Dana.id
 * Copyright (c) 2017‐2022 All Rights Reserved.
 */
package ap.myspring.model;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: Greeting.java, v 0.1 2022‐02‐10 12.39 Achmad Yogi Prakoso Exp $$
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}