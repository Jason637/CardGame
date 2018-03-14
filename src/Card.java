/**
 * Discribes a single card in a norm 52 card deck
 * @author Jason Cheng
 * @version 1.0
 */
public class Card
{
    private String suit;
    private String rank;
    private int value;

    /**
     *Constructs a card with a given suit rank and value
     * @param suit
     * @param rank
     * @param value
     */
    public Card(String suit,String rank, int value)
    {
        this.rank=rank;
        this.suit=suit;
        this.value=value;
    }

    /**
     * gets suit
     * @return suit as string
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Gets rank
     * @return rank as string
     */
    public String getRank() {
        return rank;
    }

    /**
     * gets value
     * @return value as a int
     */
    public int getValue() {
        return value;
    }
}
