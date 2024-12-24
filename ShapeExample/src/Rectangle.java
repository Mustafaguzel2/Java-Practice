
/**
 * @author Ozgun Yilmaz
 * 14.Mar.2024 12:31:22
 */
public class Rectangle extends Shape{

    private double width,height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        super();
        this.width = 1;
        this.height = 1;
    }
    
    @Override
    public double calculateArea(){
        return width*height;
    } 

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
}
