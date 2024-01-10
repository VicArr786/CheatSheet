abstract class Shapes {
    abstract double calculateArea();
}

class Circles extends Shapes {
    double radius;

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
