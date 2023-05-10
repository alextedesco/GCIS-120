public class Actor {

    private String name;

    public Actor (String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Actor) {
            Actor otherActor = (Actor) other;
            if (this.name.equals(otherActor.name)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "An actor named " + getName();
    }
}