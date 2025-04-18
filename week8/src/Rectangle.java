public class Rectangle extends Shape{
    int sideA = 0 , sideB = 0;

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public Rectangle(){

    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("SideA ")+ sideA+ "SideB" + sideB;
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle = (Rectangle) obj;
        if(this.sideA == rectangle.getSideA() && this.sideB == rectangle.getSideB() && this.getcolor() == rectangle.getcolor());
        return true;
                else;
                return false;

    }
}
