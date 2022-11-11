package tic_tac_toe;

public class Bord {
	
	//ゲーム実行中フラグ
	static boolean game = true;
	
	//三目並べに対応した多次元配列
	static String[][] board = new String[3][3];
	
	static final String EMPTY = " ";
	static final String circle = "○";
	static final String X_mark = "×";
	
	static String sign;
	static String rev_sign;
	
	static public void initialize() {
		
		//盤面初期化
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++){
				board[i][j] = EMPTY;
			}
		}
		
		//次打つサインを決める
		sign = circle;
		rev_sign = X_mark;
		
		//ゲーム実行中フラグ
		game = true;
	}
	
	static public void showBoard(){
		
		//まだ空いている座標があるか
		boolean existempty = false;
		
		//ボードを描画する
		int i = 0;
		System.out.println(" |0|1|2|");
		
		System.out.println(" ----");
		for (String[] sarr : board) {
			System.out.println(i + " |");
			for (String s : sarr) {
				
				System.out.println(s);
				System.out.println(" |");
				
				//空いている座標があるか
				if (s.equals(EMPTY)) {
					existempty = true;
				}
				System.out.println();
				System.out.println(" ----");
				
				i++;
			}
			System.out.println(" ----");
			
			if (existempty) {
				System.out.println(circle + "のターンです");
			}else {
				System.out.println("ゲーム終了！");
				game = false;
			}
		}
	}
	

}
