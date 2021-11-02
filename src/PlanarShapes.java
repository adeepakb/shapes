public abstract class  PlanarShapes {
    private int noOfSides;
    private double volume;

    public  abstract double getVolume(double [] sides);


    public PlanarShapes(int noOfSides) {
        this.noOfSides = noOfSides;
    }

    public int getNoOfSides() {
        return noOfSides;
    }

    public void setNoOfSides(int noOfSides) {
        this.noOfSides = noOfSides;
    }

    @Override
    public String toString() {
        return "PlanarShapes{" +
                "noOfSides=" + noOfSides +
                ", volume=" + volume +
                '}';
    }
}
