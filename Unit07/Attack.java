import java.util.Arrays;

public class Attack {
    private String name;
    private int[] hits;
    private DamageType type;

    public Attack (String name, DamageType type, int[] hits) {
        this.name = name;
        this.hits = hits;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int[] getHits() {
        return hits;
    }

    public DamageType getType() {
        return type;
    }    

    @Override
    public String toString() {
        return name + "(" + type + "," + Arrays.toString(hits) + ")";
    }
}
