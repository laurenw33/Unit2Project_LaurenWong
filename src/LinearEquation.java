public class LinearEquation {

    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double slope;
    private double yIntercept;
    private double distancePoints;

    //public new coordinate(int x1, int y1)
    {

    }

    public int slope (int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

        slope = (y2 - y1)/(x2 - x1);


    }
        public int yIntercept (double slope, int x1, int y1)
    {
       yIntercept = (y1) - ((slope)(x1));
    }


    public LinearEquation(double slope, double yIntercept)
    {
        this.slope = slope;
        this.yIntercept = yIntercept;

    }

    public String toString()
    {
        String equation = ("y =" + slope + "x " + yIntercept);
        return equation + "\n" + slope;
    }
}
