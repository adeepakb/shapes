public abstact class TdShapes{

    private int noOfSides;
    private double volume;

    public  abstract double getVolume(double [] sides);


    public TdShapes(int noOfSides) {
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
        return "TdShapes{" +
                "noOfSides=" + noOfSides +
                ", volume=" + volume +
                '}';
    }
}
