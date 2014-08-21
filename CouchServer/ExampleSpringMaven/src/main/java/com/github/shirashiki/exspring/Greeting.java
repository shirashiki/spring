package com.github.shirashiki.exspring;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Object which represents a greeting. It’s annotated with {@literal @}JsonIgnoreProperties 
 * from the Jackson JSON processing library to indicate that any properties not 
 * bound in this type should be ignored.
 * @author silvio hirashiki
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Greeting {
    private long id;
    private String content;

    /**
     * Empty constructor added to support JSON to object conversion using jackson
     */
    public Greeting(){
    }
    
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

