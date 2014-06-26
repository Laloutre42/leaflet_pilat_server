package org.zed.coding.model.village;

import org.springframework.data.annotation.Id;

public class Village {

    @Id
    private String id;

    private String latLong;
    private String name;

    public Village() {
    }

    public Village(String latLong, String name) {
        this.latLong = latLong;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%s, latLong='%s', name='%s']", id, latLong, name);
    }

}