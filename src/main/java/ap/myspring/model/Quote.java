/**
 * Dana.id
 * Copyright (c) 2017‐2022 All Rights Reserved.
 */
package ap.myspring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Achmad Yogi Prakoso (achmad.prakoso@dana.id)
 * @version $Id: Quote.java, v 0.1 2022‐02‐10 14.16 Achmad Yogi Prakoso Exp $$
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private Long id;
    private String quote;

    public Long getId() {
        return this.id;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
               "id=" + id +
               ", quote='" + quote + '\'' +
               '}';
    }
}