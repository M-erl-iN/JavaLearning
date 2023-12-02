import java.util.Scanner;
import java.lang.Math;


public class Matrix {
    Scanner scan = new Scanner(System.in);
    int rowsCount, colsCount;
    double[][] array;
    double determinant;
    int rank;


    public void input() {
        System.out.println("------Input Matrix------");
        System.out.print("Введите кол-во строк матрицы: ");
        int m = this.scan.nextInt();
        System.out.print("Введите кол-во столбцов матрицы: ");
        int n = this.scan.nextInt();
        this.rowsCount = n;
        this.colsCount = m;
        this.array = new double[n][m];
        
        System.out.println("Введите тип ввода матрицы");
        System.out.print("(1 - поэлементарно, иначе - построчно): ");
        String input_type = scan.next();
        if (input_type.charAt(0) == '1') {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("Matrix[" + (i + 1) + "][" + (j + 1) + "] = ");
                    double elem = Double.parseDouble(scan.next());
                    this.array[i][j] = elem;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("Matrix[" + (i + 1) + "][1-" + m + "]: ");
                for (int j = 0; j < m; j++) {
                    double elem = Double.parseDouble(scan.next());
                    this.array[i][j] = elem;
                }
            }
        }
        System.out.println("------------------------");
    }


    public void print() {
        System.out.println("------Print Matrix------");
        System.out.println("Matrix (" + this.rowsCount + " * " + this.colsCount + ")");
        String temp_line = "{";
        for (int i = 0; i < this.rowsCount - 1; i++){
            temp_line += "{";
            for (int j = 0; j < this.colsCount - 1; j++){
                temp_line += this.array[i][j] + ", ";
            } temp_line += this.array[i][this.colsCount - 1] + "},\n ";
        } temp_line += "{";
        for (int j = 0; j < this.colsCount - 1; j++){
            temp_line += this.array[this.rowsCount - 1][j] + ", ";
        } temp_line += this.array[this.rowsCount - 1][this.colsCount - 1] + "}}\n";

        System.out.print(temp_line);
        System.out.println("------------------------");
    }


    public Matrix sum(Matrix B) {
        if (this.rowsCount == B.rowsCount && this.colsCount == B.colsCount) {
            Matrix C = new Matrix();
            C.rowsCount = this.rowsCount;
            C.colsCount = this.colsCount;
            C.array = new double[C.rowsCount][C.colsCount];
            for (int i = 0; i < C.rowsCount; i++) {
                for (int j = 0; j < C.colsCount; j++) {
                    C.array[i][j] = this.array[i][j] + B.array[i][j];
                }
            } return C;
        } 
        System.out.println("Сложение матриц невозможно");
        return null;
    }


    public Matrix multiply(Matrix B) {
        if (this.colsCount == B.rowsCount) {
            Matrix C = new Matrix();
            C.rowsCount = this.rowsCount;
            C.colsCount = B.colsCount;
            C.array = new double[C.rowsCount][C.colsCount];
            for (int i = 0; i < C.rowsCount; i++) {
                for (int j = 0; j < C.colsCount; j++) {
                    C.array[i][j] = 0;
                    for (int k = 0; k < this.colsCount; k++) {
                        C.array[i][j] += this.array[i][k] * B.array[k][j];
                    }
                }
            } return C;
        } else {
            System.out.println("Перемножение матрицы в таком порядке невозможно");
            if (B.colsCount == this.rowsCount) {
                System.out.print("Хотите ли вы перемножить матрицы в обратном порядке?\n(y/n): ");
                String flag = scan.next();
                if (flag == "да" || flag == "yes" || flag == "д" || flag == "y") {
                    Matrix C = new Matrix();
                    C.rowsCount = B.rowsCount;
                    C.colsCount = this.colsCount;
                    for (int i = 0; i < C.rowsCount; i++) {
                        for (int j = 0; j < C.colsCount; j++) {
                            C.array[i][j] = 0;
                            for (int k = 0; k < B.colsCount; k++) {
                                C.array[i][j] += B.array[i][k] * this.array[k][i];
                            }
                        }
                    }
                    return C;
                }
            }
        } return null;
    }


    public double getDeterminant() {
        if (this.rowsCount == this.colsCount) {
            this.determinant = 1;
            double[][] matrix = gaussMethod(this.array);
            for (int i = 0; i < this.rowsCount; i++) {
                this.determinant = this.determinant * matrix[i][i];
            }
            return this.determinant;
        }
        System.out.println("Для нахождения определителя матрица должна быть квадратной");
        return (Double) null;
    }


    public int getRank() {
        double epselone = 0.000000001;
        double[][] matrix = gaussMethod(this.array);
        int used_rows = 0;
        for (int i = 0; i < this.rowsCount; i++) {
            for (int j = 0; j < this.colsCount; j++) {
                if (Math.abs(matrix[i][j]) > epselone) {
                    used_rows += 1;
                    break;
                }
            }
        }
        return used_rows;
    }


    public double[][] transpose(double[][] matrix) {
        double[][] new_matrix = new double[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                new_matrix[j][i] = matrix[i][j];
            }
        }
        return new_matrix;
    }


    public double[][] gaussMethod(double[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (matrix[i][i] == 0) {
                    continue;
                }
                double coef = matrix[j][i] / matrix[i][i];
                for (int k = 0; k < n; k++) {
                    matrix[j][k] = matrix[j][k] - matrix[i][k] * coef;
                }
            }
        }
        return matrix;
    }
}