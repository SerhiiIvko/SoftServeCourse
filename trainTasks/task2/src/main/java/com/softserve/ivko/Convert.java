package com.softserve.ivko;

import java.util.Objects;

public class Convert implements Comparable{
    private double width;
    private double height;

    public Convert() {
    }

    public Convert(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convert)) return false;
        Convert convert = (Convert) o;
        return Double.compare(convert.getWidth(), getWidth()) == 0 &&
                Double.compare(convert.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getHeight());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}