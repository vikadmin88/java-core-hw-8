package org.goit.m8;

import java.util.Arrays;

public class Canvas {
    private final Shape[] shapes;

    public Canvas() {
        // default
        this(3);
    }
    public Canvas(int length) {
        // adjustable
        this.shapes = new Shape[length];
    }

    public boolean addShape(Shape shape) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) {
                shapes[i] = shape;
                System.out.printf("Added shape %d {%s}\n", ++i, shape.getName());
                return true;
            }
        }
        System.out.printf("Ignored shape {%s} Out of memory! ;-)\n", shape.getName());
        return false;
    }

    private Shape[] getShapes() {
//        System.out.println("shapes = " + Arrays.toString(shapes));
        return shapes;
    }
    public void drawCanvas() {
        System.out.println("drawCanvas: ---------------------------------");
        int i = 1;
        for (Shape shape: getShapes()) {
            if (shape != null) {
                System.out.printf("%d %s", i, shape.getName());
                if (shape instanceof ICircle) {
                    Circle shapeExt = (Circle) shape;
                    System.out.printf(", Extended properties: [X/%f, Y/%f, R/%f]", shapeExt.getX(), shapeExt.getY(), shapeExt.getRadius());
                }
                if (shape instanceof ILine) {
                    Line shapeExt = (Line) shape;
                    System.out.printf(", Extended properties: [X1/%f, Y1/%f, X2/%f, Y2/%f, L/%f]", shapeExt.getX(), shapeExt.getY(), shapeExt.getX2(), shapeExt.getY2(), shapeExt.getLength());
                }
                System.out.println(" ");
            }
            i++;
        }
        System.out.println("drawCanvas: ---------------------------------");
    }

}
