public class Snake {
	private int sFront, sEnd;
	
	public int getSfront() {
		return sFront;
	}

	public int getSend() {
		return sEnd;
	}

	public void setSfront(int sfront) {
		this.sFront = sfront;
	}

	public void setSend(int send) {
		this.sEnd = send;
	}

	public Snake(int sf, int se) {
		setSfront(sf);
		setSend(se);
	}
	
	public boolean checkSfront(int x ,int y)
	{
		int m = change(x, y);
		if(m==sFront)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	static void checkSnake(Snake[] snk,int c) {
		for (int i = 0; i < snk.length; i++) {
			if (snk[i].checkSfront(getInput.pic[c].getXposition(),
					getInput.pic[c].getYposition())) {
				Piece.array[getInput.pic[c].getXposition()][getInput.pic[c]
						.getYposition()] = 0;
				System.out.println("snak :(");
				
				getInput.pic[c].pMove(snk[i].getSend(),c);
			
			}
	}
	}

	public static int change(int x,int y)
	{
		
		
		return (((9 - x) * 10) + (y+1));
	}

	
	
}
