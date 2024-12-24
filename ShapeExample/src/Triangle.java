
/**
 * @author Ozgun Yilmaz
 * 14.Mar.2024 12:31:34
 */
public class Triangle extends Shape{

    private double base,height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }
    
    public Triangle() {
        super();
        this.base = 1;
        this.height = 1;
    }
    
    @Override
    public double calculateArea(){
        return base*height/2;
    } 

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
}
