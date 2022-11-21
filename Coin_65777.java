public class Coin_65777 {

}

class Coin {
    double radius;
    String colorHead;
    String colorTail;

    Coin() {
        radius = 1.0;
        colorHead = "red";
        colorTail = "red";

    }

    Coin(double radius) {
        this.radius = radius;
    }

    String getColor() {
        return colorHead;
    }

    void flip() {
        String temp;
        temp = colorHead;
        colorHead = colorTail;
        colorTail = temp;

    }

    void setColor(String color) {
        colorHead = color;
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
        return "Coin[radius=" + radius + "]";
    }

}
