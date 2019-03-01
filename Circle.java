class Circle{
    // INSTANCE VARIABLES
    private Point center;
    private double radius;

    // CONSTRUCTORS
    Circle(){
        center = new Point(0,0);
        radius = 5.0;
    }

    Circle(Point c, double r){
        center=c;
        radius=r;
    }

    // CLASS METHODS
    public String toString(){
        return "A circle with center at "+center+", and a radius of "+radius+"."
                + "\nArea is "+getArea()+", and permieter is "+getPerimeter()+".";
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 2.0*Math.PI*radius;
    }

    // MAIN METHOD
    public static void main(String[]args){
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(new Point(5,0),10.0);
        System.out.println(circle1);
        System.out.println(circle2);
    }
}