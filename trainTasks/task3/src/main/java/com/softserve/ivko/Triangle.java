package com.softserve.ivko;

import java.util.Objects;

public class Triangle implements Comparable{
    private String name;
    private double sideA;
    private double sideB;
    private double sideC;
    private double area;

    Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    String getName() {
        return name;
    }

    double getSideA() {
        return sideA;
    }

    double getSideB() {
        return sideB;
    }

    double getSideC() {
        return sideC;
    }

    double getArea() {
        double halfPerimeter = getHalfPerimeter();
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    private double getHalfPerimeter() {
        return (sideA + sideB + sideC) / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle that = (Triangle) o;
        return Double.compare(that.getSideA(), getSideA()) == 0 &&
                Double.compare(that.getSideB(), getSideB()) == 0 &&
                Double.compare(that.getSideC(), getSideC()) == 0 &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSideA(), getSideB(), getSideC());
    }

    @Override
    public String toString() {
        return "[" + name + "]: " + String.format("%.2f", getArea()) + " cm";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}