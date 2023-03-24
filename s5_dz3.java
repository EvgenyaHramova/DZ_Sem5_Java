
// На шахматной доске расставить 8 ферзей так, 
// чтобы они не били друг друга. И вывести Доску. 
// Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

// не решена!

public class s5_dz3 {

    static void queen(int[][] chess_board, int gor, int vert) {
        int count = 8;
        int g = gor - 1;
        int v = vert - 1;
        chess_board[g][v] = 1;
        for (int i = 0; i < chess_board.length; i++) {
            for (int j = 0; j < chess_board.length; j++) {
                // if (chess_board[g][i] ==1 || chess_board[i][v]==1){
                // g++;
                // }
                    System.out.printf("%d  ", chess_board[i][j]);

                }
                System.out.println();
                
        // / count--;
            }
        // return;
    }

    public static void main(String[] args) {
        int[][] chess_board = new int[8][8];
        int gor = 1;
        int vert = 1;

        queen(chess_board, gor, vert);

    }
}