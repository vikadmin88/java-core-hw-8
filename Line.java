package org.goit.m8;

public class Line extends Shape implements ILine {
    private final String name = "Line";
    private double x;
    private double y;
    private double x2;
    private double y2;

    public Line() {
        this.x = 0;
        this.y = 0;
        this.x2 = 0;
        this.y2 = 0;
    }
    public Line(double x, double y, double x2, double y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public Line setX(double x) {
        this.x = x;
        return this;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public Line setY(double y) {
        this.y = y;
        return this;
    }

    @Override
    public double getX2() {
        return this.x2;
    }

    @Override
    public Line setX2(double x) {
        this.x2 = x;
        return this;
    }

    @Override
    public double getY2() {
        return this.y2;
    }

    @Override
    public Line setY2(double y) {
        this.y2 = y;
        return this;
    }
    public double getLength() {
        double retLen = getX2() - getX();
        return retLen < 0 ? retLen * -1 : retLen;
    }
}