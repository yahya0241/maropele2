public class Ladder {
	private int eLadder, fLadder;

	public int getEladder() {
		return eLadder;
	}

	public int getFladder() {
		return fLadder;
	}

	public void setEladder(int eladder) {
		this.eLadder = eladder;
	}

	public void setFladder(int fladder) {
		this.fLadder = fladder;
	}

	public Ladder(int fl, int el) {
		setFladder(fl);
		setEladder(el);
	}

	public boolean checkFladder(int x, int y) {
		int fl = change(x, y);

		if (fl == fLadder) {
			return true;
		} else {
			return false;
		}
	}

	static void checkLadder(Ladder[] lad, int c) {
		for (int i = 0; i < lad.length; i++) {
			if (lad[i].checkFladder(getInput.pic[c].getXposition(),
					getInput.pic[c].getYposition())) {
				Piece.array[getInput.pic[c].getXposition()][getInput.pic[c]
						.getYposition()] = 0;
				System.out.println("lad :)");

				getInput.pic[c].pMove(lad[i].getEladder(), c);
			}
		}

	}

	private int change(int x, int y) {

		return (((9 - x) * 10) + (y + 1));
	}

}
