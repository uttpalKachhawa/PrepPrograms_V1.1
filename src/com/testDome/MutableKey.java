package com.testDome;

import java.util.Objects;

/**
 * @author uttpal on Sep, 2020
 */
public class MutableKey {
    private String name;

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableKey that = (MutableKey) o;
        return name.equals(that.name);
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }


}
