import java.util.Random;

public class Game {
	int c = 0;

	public void runGame() {

		String inp = Main.sc.nextLine();

		while (true) {
			while (whatIsNext(inp)) {
				if (round(c, inp)) {
					int x = 1 + new Random().nextInt(6);
					System.out.println(x);
					int place = Snake.change(getInput.pic[c].getXposition(),
							getInput.pic[c].getYposition());

					getInput.pic[c].pMove(x + place, c);
					if (Piece.array[0][9] == 0) {
						checkMovePice();
					}

					c = 1 - c;
				}
				inp = Main.sc.nextLine();

			}
			inp = Main.sc.nextLine();
		}
	}

	private void checkMovePice() {
		for (int i = 0; i < getInput.d; i++) {
			Ladder.checkLadder(getInput.lad, c);
			Snake.checkSnake(getInput.snk, c);
			Piece.pieceShoot(c);
		}

	}

	public boolean round(int c, String s) {

		boolean a = true;
		if (s.equalsIgnoreCase("r1") || s.equalsIgnoreCase("r2")) {
			if (Character.getNumericValue(s.charAt(1)) == (c + 1)) {

				a = true;
			} else {
				System.out.println("player  r" + (c + 1) + "   please!");
				a = false;
			}
		} else {
			System.out.println("invalid input!");
			a = false;
		}
		return a;
	}

	public boolean whatIsNext(String inp) {
		boolean a = true;
		if (inp.equalsIgnoreCase("print")) {
			getInput.out();
			a = false;

		} else if (inp.equalsIgnoreCase("exit") || Piece.array[0][9] != 0) {
			System.out.println("end Game!");
			a = false;
		}
		return a;
	}
	
}
