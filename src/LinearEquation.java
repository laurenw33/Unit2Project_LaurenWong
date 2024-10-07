
public class LinearEquation {
        private int x1;
        private int y1;
        private int x2;
        private int y2;
        private double slope;
        private String coord1;
        private String coord2;


        public LinearEquation(String coord1, String coord2) {
            this.coord1 = coord1;
            this.coord2 = coord2;
            String [] splitcoord1 = coord1.split(",");
            String [] splitcoord2 = coord2.split(",");
            x1 = Integer.valueOf(splitcoord1[0].substring(1, splitcoord1[0].length()));
            y1 = Integer.valueOf(splitcoord1[1].substring(0, splitcoord1[1].length() - 1));
            x2 = Integer.valueOf(splitcoord2[0].substring(1, splitcoord2[0].length()));
            y2 = Integer.valueOf(splitcoord2[1].substring(0, splitcoord2[1].length() - 1));
        }


        public String getCoord1() {
            return coord1;
        }


        public String getCoord2() {
            return coord2;
        }


    public String getSlope() {
        int deltaY = y2 - y1;
        int deltaX = x2 - x1;


        if (deltaY % deltaX == 0)
        {
            return String.valueOf(deltaY / deltaX);
        }


        else
        {
            return deltaY + "/" + deltaX;
        }
    }

        public double getYIntercept() {
            double slope = (double)(y2 - y1) / (x2 - x1);
            double x = (double) y1 - (slope * (double) x1);
            slope = Math.round(x * 100.00) / 100.00;
            return slope;
        }


        public double getDistance() {
            double distance = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
            distance = Math.round(distance * 100.0) / 100.0;
            return distance;
        }


        public double solve(double x) {
            double slopeValue = (double)(y2 - y1) / (x2 - x1);
            slopeValue = slopeValue * x + getYIntercept();
            slopeValue = Math.round(slopeValue * 100.0 / 100.0);
            return slopeValue;
        }

        public String toString() {
            String first = ("First pair: " + coord1);
            String second = ("Second pair: " + coord2);
            String s = ("Slope of line: " + getSlope());
            String y = ("Y-intercept: " + getYIntercept());
            String e = ("Slope intercept form: y = " + getSlope() + "x + " + getYIntercept());
            String d = ("Distance between the points: " + getDistance());

            return first + "\n" + second + "\n" + s + "\n" + y + "\n" + e + "\n" + d;
        }
    }


