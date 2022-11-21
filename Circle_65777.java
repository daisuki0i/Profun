class Circle {
    double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getCircumference() {
        return radius * 2 * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

}

// class Circle_65777 {
// public static void main(String[] args) {
// Circle circle1 = new Circle();
// circle1.setRadius(2);
// System.out.println(circle1.getArea());
// }
// }