package com.modul_advance_java.moduliGradivo.modul1.dizajnSabloni.decorator;

//decortor sablon
//verzija ponasanja
//polimorfizam
public class RectangleDecorator {
    //public je zbog organizacije paketa
    //da je sve u okvuru paketa decorator moglo bi protected
    public Rectangle rectangle;

    public RectangleDecorator(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    //racunanje obima
    public int perimeter() {
        return 2 * (this.rectangle.a + this.rectangle.b);
    }

}

