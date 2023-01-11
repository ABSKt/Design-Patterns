// package decoratorPattern;

public class Circle implements Shape{
    
    @Override public void draw()
    {
        // /Print statement to execute when
        // draw() method of this class is called
        // later on in the main() method
        System.out.println("Shape: Circle");
    }
}
