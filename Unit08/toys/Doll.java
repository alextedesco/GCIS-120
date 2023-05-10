public class Doll extends Toys {
    public int plays = 0;
    public HairColorType hairColor;
    public EyeColorType eyeColor;

    public Doll (HairColorType hairColor, EyeColorType eyeColor) {
        super ("Doll", 3.0);
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public void play () {
        if (plays ==  0) {
            System.out.println("Toy is broken!");
        } else {
            System.out.println(DollSayings.Hello);
            plays--;
        }
    }
    @Override
    public String toString() {
        return "A Doll that has " + this.hairColor + " hair and " + this.eyeColor + " eyes";
    }
}
