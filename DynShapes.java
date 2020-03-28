class TwoDShape{
    private double width;
    private double height;
    private String name;

    TwoDShape(){
        width = height = 0.0;
        name = "none";

    }
    TwoDShape(double w, double h, String n){
        width = w;
        height = h;
        name = n;
        
    }

    TwoDShape(double x, String n){
        width = x;
        height = x;
        name = n;
        
    }
    TwoDShape(TwoDShape ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
        
    }
    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width = w};
    void setHeight(double h){height = h};
    void showDim(){
        System.out.println(width + height);
    }
    double area(){
        System.out.println("O");

        return 0.0;
    }

}

class Triangle extends TwoDShape{
    private String style;

    Triangle(String s, double w, double h){
        super(w, h, "triangle");
        style = s;

    }

    Triangle(double x ){
        super(x, "triangle");
        style = "filled";
    }
    double area(){
        return getWidth() * getHeight() /2;
    }
    void showStyle(){
        System.out.println(style);
    }
}
class DynShapes{
     public static void main(String[] args){
         TwoDShape[] shapes = new TwoDShape[5];
         shapes[0] = new Triangle("outlined", 8, 12);
        // Triangle t1 = new Triangle();
        // Triangle t2 = new Triangle();
     
        // t1.width = 4;
        // t1.style = "filled";
        // t1.height = 4;
        // t2.width = 8;
        // t2.style = "outlined";
        // t2.height = 8;
        // System.out.println(t1.area());
        // t2.showDim();
        System.out.println(shapes[0].area());
    }
}