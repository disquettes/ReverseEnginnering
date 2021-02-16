package forma;

import forma.Figura;



public class Triangle implements Figura {
    private double side1 = 0.0;
    private double side2 = 0.0;
    private double side3 = 0.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        return (side1 + side2 + side3) / 2;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
    return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2
           + " Side 3 = " + side3;
    }
    
   public String getType(){
     double a=side1;
     double b=side2;
     double c=side3;
        
      String type="";  
    if (a <= 0 || b <= 0 || c <= 0) 
           type="Nu e triunghi"; 
    if (a == b && b == c) 
        type="Echilateral";
    if (a >= b+c || c >= b+a || b >= a+c)
        type="Nu e triunghi";
    if (b==c || a==b || c==a) 
       type="Isoscel";
    else type="Scalen";
    
    return type;    
    }
   
   
   
   public double getHeight (){
       
       double Aria=getArea();
       
       return 2*Aria/side1;
   }
}
