public class Card implements Comparable<Card> {
	private char symbol;
	private int number;
	
	public Card() {
		super();
	}
	
	public Card(char symbol, int number) {
		this();
		this.symbol = symbol;
		this.number = number;
	}

	@Override
	public String toString() {
		return this.symbol + " " + this.number;
	}

	@Override
	public int compareTo(Card o) {
		if (this.symbol < o.symbol) return -1;
		else return 1;
	}
	
	@Override
	public int hashCode() {
        return String.valueOf(symbol).hashCode();
	}
	
	@Override
    public boolean equals(Object obj){
        if (obj instanceof Card) {
        	Card card = (Card) obj;
            return (card.symbol == this.symbol);
        } else {
            return false;
        }
    }
}