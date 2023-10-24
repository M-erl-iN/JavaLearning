import java.util.Scanner;


public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Для начала игры введите команду 0 1");
        System.out.println("Для перезапуска игры введите команду 0 2");
        System.out.println("Для закрытия игры введите 0 3");
        System.out.println("Для того чтобы сделать ход введите строку(1-3) и столбец(1-3) на разных строках");
        int x = input.nextInt();
        int y = input.nextInt();
        if (x == 0 && y < 3) {
            boolean temp = true;
            while (temp != false) {
                temp = game(input);
            }
        }
    }


    public static boolean game(Scanner input) {
        int[][] matrix = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        print_matrix(matrix);
        int main_step = 1;
        int x, y;

        x = input.nextInt() - 1;
        y = input.nextInt() - 1;
        if (x == -1) {
            if (y == 1) {
                return true;
            }
            if (y == 2) {
                return false;
            }
        }
        matrix[x][y] = main_step;
        print_matrix(matrix);
        main_step = 1 - main_step;

        while (x != -1) {
            x = input.nextInt() - 1;
            y = input.nextInt() - 1;
            if (matrix[x][y] == -1) { 
                matrix[x][y] = main_step;

                if (finish(matrix)) {
                    if (main_step == 0) {
                        System.out.println("Победили Нолики");
                    } 
                    if (main_step == 1) {
                        System.out.println("Победили Крестики");
                    }
                    print_matrix(matrix);
                    System.out.println("Введите команду");
                    x = input.nextInt();
                    y = input.nextInt();
                    return (x == 0 & y == 1);
                }

                main_step = 1 - main_step;
                print_matrix(matrix);
            } else {
                System.out.println("Эта ячейка занята");
            }
        }
        if (x == -1) {
            if (y == 1) {
                return true;
            }
            if (y == 2) {
                return false;
            }
        }
        return true;
    }


    public static boolean finish(int[][] matrix) {
        if (matrix[0][0] == matrix[0][1] & matrix[0][1] == matrix[0][2] & matrix[0][1] != -1 | 
            matrix[1][0] == matrix[1][1] & matrix[1][1] == matrix[1][2] & matrix[1][1] != -1 |
            matrix[2][0] == matrix[2][1] & matrix[2][1] == matrix[2][2] & matrix[2][1] != -1 |
            matrix[0][0] == matrix[1][0] & matrix[1][0] == matrix[2][0] & matrix[1][0] != -1 | 
            matrix[0][1] == matrix[1][1] & matrix[1][1] == matrix[2][1] & matrix[1][1] != -1 | 
            matrix[0][2] == matrix[1][2] & matrix[1][2] == matrix[2][2] & matrix[1][2] != -1 | 
            matrix[0][0] == matrix[1][1] & matrix[1][1] == matrix[2][2] & matrix[1][1] != -1 | 
            matrix[2][0] == matrix[1][1] & matrix[1][1] == matrix[0][2] & matrix[1][1] != -1 ) {
                System.out.println("1");
                return true;
            }
            System.out.println("0");
            return false;
    }


    public static String[] get_symbols(int n) {
        if (n == -1) {
            String[] symbols = {"  ", "__"};
            return symbols;
        }
        if (n == 0) {
            String[] symbols = {"/\\", "\\/"};
            return symbols;
        }
        String[] symbols = {"\\/", "/\\"};
        return symbols;
    }


    public static void print_matrix(int[][] matrix) {
        String[][] beautiful_matrix = {
            {"    | 1  | 2  | 3  |    "},
            {"____|____|____|____|____"},
            {" 1  | ", "", " | ", "", " | ", "", " |    "},
            {"____|_", "", "_|_", "", "_|_", "", "_|____"},
            {" 2  | ", "", " | ", "", " | ", "", " |    "},
            {"____|_", "", "_|_", "", "_|_", "", "_|____"},
            {" 3  | ", "", " | ", "", " | ", "", " |    "},
            {"____|_", "", "_|_", "", "_|_", "", "_|____"},
            {"    |    |    |    |    "},
            {"    |    |    |    |    "}
        };

        for (int i = 2; i < 8; i += 2) {
            for (int j = 1; j < 6; j += 2) {
                String[] temp = get_symbols(matrix[(i - 2) / 2][(j - 1) / 2]);
                beautiful_matrix[i][j] = temp[0];
                beautiful_matrix[i+1][j] = temp[1];
            }
        }

        print_beautiful_matrix(beautiful_matrix);
    }


    public static void print_beautiful_matrix(String[][] beautiful_matrix) {
        System.out.println(beautiful_matrix[0][0]);
        System.out.println(beautiful_matrix[1][0]);
        for (int i = 2; i < 8; i++) {
            String temp = "";
            for (int j = 0; j < 7; j++) {
                temp += beautiful_matrix[i][j];
            }
            System.out.println(temp);
        }
        System.out.println(beautiful_matrix[8][0]);
        System.out.println(beautiful_matrix[9][0]);
    }
}