public class ActionFigure extends Toys {
    public int plays = 10;
    public HairColorType hairColor;
    public EyeColorType eyeColor;

    public ActionFigure (HairColorType hairColor, EyeColorType eyeColor) {
        super ("Action Figure", 3.0);
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public void play () {
        if (plays ==  0) {
            System.out.println("Toy is broken!");
        } else {
            System.out.println(ActionFigureSayings.Pow);
            plays--;
        }
    }
    @Override
    public String toString() {
        return "An Action Figure that has " + this.hairColor + " hair and " + this.eyeColor + " eyes";
    }
}
