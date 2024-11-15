package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 5;
        rectangle.height = 12;

        System.out.println("넓이 : " + rectangle.calculateArea());
        System.out.println("둘레 : " + rectangle.calculatePerimeter());
        System.out.println("정사각형 여부 : " + rectangle.isSquare());

    }
}
