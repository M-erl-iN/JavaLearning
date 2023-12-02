import java.lang.Math;


public class Gauss {
    public double abs(double x) {
        if (x < 0) {
            return -x;
        } return x;
    }


    public int getRank(double[][] matrix, double[] y, int rows, int cols) {
        double EPS = 0.000000001;
        //m -> rows, n -> cols
        int rank = Math.max(rows, cols);
        boolean[] line_used = new boolean[cols];
        for (int i=0; i<rows; i++) {
            line_used[i] = false;
        }

        for (int i=0; i<rows; i++) {
            int point = 0;
        	for (int j=0; j<cols; j++) {
        		if (!line_used[j] && abs(matrix[j][i]) > EPS) {
                    point = j;
                    break;
                }
            }
            if (point == cols) {
                rank--;
            } else {
                line_used[point] = true;
        	    for (int p=i+1; p<rows; ++p) {
                    matrix[point][p] /= matrix[point][i];
                }
        	    for (int k=0; k<cols; ++k) {
        	    	if (k != point && abs(matrix[k][i]) > EPS) {
        	    		for (int p=i+1; p<rows; ++p) {
                            matrix[k][p] -= matrix[point][p] * matrix[k][i];
                        }
                    }
                }
        	}
        }
        return rank;
    }
}
