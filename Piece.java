public class Piece {
	private int xposition, yposition, np;
	public static int[][] array = new int[10][10];

	public void setNp(int np) {
		this.np = np;
	}

	public int getNp() {
		return np;
	}

	public void setArray(int[][] array) {
		Piece.array = array;
	}

	public int getXposition() {
		return xposition;
	}

	public int getYposition() {
		return yposition;
	}

	public void setXposition(int position) {
		this.xposition = position;
	}

	public void setYposition(int yposition) {
		this.yposition = yposition;
	}

	public Piece(int m) {
		setXposition(9);
		setYposition(-1);
		setNp(m);

	}

	public void pMove(int m, int c) {
		if (xposition == 0 && (m) >= 100) {

			if (m == 100) {
				System.out.println("the  player" + "\t" + getNp() + "\twin!!!");
				array[xposition][yposition] = 0;
				array[0][9] = getNp();
			} else {
				System.out.println("keep on!!!!!!!");
			}

		} else {
			if (getInput.pic[c].getYposition() != -1) {
				Piece.array[getInput.pic[c].getXposition()][getInput.pic[c]
						.getYposition()] = 0;
			}
			setXposition(9 - (m / 10));
			if ((m % 10) == 0) {
				setYposition(9);
				setXposition(getXposition() + 1);
			} else {
				setYposition((m % 10) - 1);
			}

			array[xposition][yposition] = getNp();

		}

	}

	static void pieceShoot(int c) {
		if (getInput.pic[c].getXposition() == getInput.pic[1 - c]
				.getXposition()
				&& getInput.pic[c].getYposition() == getInput.pic[1 - c]
						.getYposition()) {
			System.out.println("player  " + (c + 1) + "  shoot player" + (c));
			getInput.pic[1 - c].pLose();
		}

	}

	public void pLose() {

		this.setXposition(9);
		this.setYposition(-1);
	}

}
