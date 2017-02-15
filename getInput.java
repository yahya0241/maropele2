public class getInput {

	static int[] word = new int[2];
	public static Piece[] pic = new Piece[2];
	static int d = 0;
	public static Snake[] snk;
	public static Ladder[] lad;

	static {
		setPiece();
		lad = new Ladder[Integer.parseInt(Main.sc.nextLine())];
		
		for (int i = 0; i < lad.length; i++) {
			splitInput(Main.sc.nextLine());
			lad[i] = new Ladder(word[0], word[1]);

		}
		
		snk = new Snake[Integer.parseInt(Main.sc.nextLine())];
		
		for (int i = 0; i < snk.length; i++) {
			splitInput(Main.sc.nextLine());
			if (word[0] >= 100) {
				System.out
						.println("snake head can not be in the end! and more than.");
				i--;
			} else {
				snk[i] = new Snake(word[0], word[1]);
			}
		}

		d = lad.length + snk.length;
	}

	private static void setPiece() {

		for (int i = 0; i < pic.length; i++) {

			pic[i] = new Piece(i + 1);

		}

	}

	public static void splitInput(String s) {
		word[0] = Integer.parseInt(s.split(" ")[0]);
		word[1] = Integer.parseInt(s.split(" ")[1]);
	}

	public static void out() {
		for (int i = 0; i < Piece.array.length; i++) {
			for (int j = 0; j < Piece.array[i].length; j++) {
				System.out.print(Piece.array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
