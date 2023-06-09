package selfwork.task3;

public abstract class Shape {

   protected String color;
   protected boolean isFilled;

    public Shape (){
        color = "unknown";
        isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return  String.format("Shape with color of %s and %s",
                color, isFilled ? "filled" : "NotFilled" );
    }
}
