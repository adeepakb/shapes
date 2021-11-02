public class Rectangle extends PlanarShapes{

    public Rectangle(int noOfSides) {
        super(noOfSides);
    }

    @Override
    public double getVolume(double [] sides) {
        double result=1;
        for(double side:sides){
            result*=side;
        }
        return result;
    }


}
