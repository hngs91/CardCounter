public class Cards {

    private Integer number;
    private String face;
    private String suit;

    public Cards(Integer number, String face, String suit){
        this.number = number;
        this.face = face;
        this.suit = suit;
    }


    @Override
    public String toString(){
        return this.number + this.face + " of " + this.suit;
    }

    public int getNumber() {
        return number;
    }

    public String getFace() {
        return face;
    }
}
