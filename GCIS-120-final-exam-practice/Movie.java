import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Movie implements Iterable<Actor>{

    private String name;
    Set<Actor> actors;

    public Movie (String name) {
        this.name = name;
        this.actors = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void addActor (Actor actor) {
        actors.add(actor);
    }

    public boolean hasActor (Actor actor) {
        if (actors.contains(actor)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Iterator<Actor> iterator() {
        return actors.iterator();
    }
}
