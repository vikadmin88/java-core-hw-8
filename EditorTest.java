package org.goit.m8;

public class EditorTest {
    public static void main(String[] args) {

        System.out.println("Canvas with limit of default(3) shapes:");
        Canvas canvas = new Canvas();

        canvas.addShape(new Circle(10, 20, 30));
        canvas.addShape(new Line(5, 2, 7, 3));
        canvas.addShape(new Circle(11, 22, 33));
        // will ignore
        canvas.addShape(new Triangle());
        canvas.addShape(new Poligon());
        canvas.addShape(new Quad());

        // Draw the canvas
        canvas.drawCanvas();

        System.out.print("\nCanvas with limit of 6 shapes:\n");
        Canvas canvas2 = new Canvas(6);
        canvas2.addShape(new Circle(10, 20, 30));
        // Custom line coordinates
        Line line = new Line();
        line.setX(51).setY(21).setX2(71).setY2(31);
        canvas2.addShape(line);
        canvas2.addShape(new Line(5, 2, -10, 3));

        canvas2.addShape(new Triangle());
        canvas2.addShape(new Circle(40, 50, 60));
        // will ignore
        canvas2.addShape(new Poligon());
        canvas2.addShape(new Quad());

        // Draw the canvas
        canvas2.drawCanvas();


    }
}
