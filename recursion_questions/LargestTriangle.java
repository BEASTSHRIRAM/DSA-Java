public class LargestTriangle {
    public static void main(String[] args) {
        int[][] points = new int[][]{{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println(largestTriangleArea2(points));
    }
    static double largestTriangleArea(int[][] points) {
        int maxX =Integer.MIN_VALUE;
        int maxY=Integer.MIN_VALUE;
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            if(x>maxX)maxX=x;
            if(y>maxY)maxY=y;
        }
        return (0.5*(maxX)*(maxY));
        
    }
    static double largestTriangleArea2(int[][] points) {
        double maxArea = 0.0;
        int n = points.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    long x1 = points[i][0], y1 = points[i][1];
                    long x2 = points[j][0], y2 = points[j][1];
                    long x3 = points[k][0], y3 = points[k][1];
                    double area = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
                    if (area > maxArea) maxArea = area;
                }
            }
        }
        return maxArea;
    }
}
    

