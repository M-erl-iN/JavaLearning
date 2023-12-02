public class Test {
    public static void main(String[] args) {
        Matrix A = new Matrix();
        double[][] array = {
            {1, 2, 3, -1},
            {0, 1, -1, 1},
            {0, 4, 0, 2},
            {0, 2, 0, 1}
        };
        A.array = array;
        A.rowsCount = 4;
        A.colsCount = 4;
        A.print();
        System.out.println(A.getDeterminant());
        System.out.println(A.getRank());
    }
}


//перестановка, чтобы на главной диагонали небыло нулей
