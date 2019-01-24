package com.softserve.ivko;

class TriangleValidator {

    static boolean isShapeTriangle(double a, double b, double c) {
        return !(a + b <= c) && !(a + c <= b) && !(b + c <= a);
    }
}