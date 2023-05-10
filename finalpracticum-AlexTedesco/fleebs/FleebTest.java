package fleebs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class FleebTest {
    @Test
    public void sortFleebsByEyeColor() {
        // setup
        Fleeb fleeb1 = new Fleeb(EyeColor.PURPLE, Month.FLEEBTOBER, 38);
        Fleeb fleeb2 = new Fleeb(EyeColor.PUCE, Month.JUNTH, 27);
        Fleeb fleeb3 = new Fleeb(EyeColor.YELLOW, Month.BRAUGUST, 6);
        Fleeb fleeb4 = new Fleeb(EyeColor.TIE_DYE, Month.NOVEMBRIL, 12);
        Fleeb fleeb5 = new Fleeb(EyeColor.CHARTREUSE, Month.FLEEBTOBER, 1);
        List<Fleeb> fleebs = new ArrayList<>();
        fleebs.add(fleeb1);
        fleebs.add(fleeb2);
        fleebs.add(fleeb3);
        fleebs.add(fleeb4);
        fleebs.add(fleeb5);

        // invoke
        Collections.sort(fleebs);

        // analyze
        assertEquals(fleeb4, fleebs.get(0));
        assertEquals(fleeb1, fleebs.get(1));
        assertEquals(fleeb2, fleebs.get(2));
        assertEquals(fleeb5, fleebs.get(3));
        assertEquals(fleeb3, fleebs.get(4));
    }

    @Test
    public void sortFleebsByBirthdate() {
        // setup
        Fleeb fleeb1 = new Fleeb(EyeColor.PURPLE, Month.FLEEBTOBER, 38);
        Fleeb fleeb2 = new Fleeb(EyeColor.PUCE, Month.JUNTH, 27);
        Fleeb fleeb3 = new Fleeb(EyeColor.YELLOW, Month.SMARCH, 6);
        Fleeb fleeb4 = new Fleeb(EyeColor.TIE_DYE, Month.NOVEMBRIL, 12);
        Fleeb fleeb5 = new Fleeb(EyeColor.CHARTREUSE, Month.FLEEBTOBER, 1);
        List<Fleeb> fleebs = new ArrayList<>();
        fleebs.add(fleeb1);
        fleebs.add(fleeb2);
        fleebs.add(fleeb3);
        fleebs.add(fleeb4);
        fleebs.add(fleeb5);

        // invoke
        Collections.sort(fleebs, new BirthdaySorter());

        // analyze
        assertEquals(fleeb3, fleebs.get(0));
        assertEquals(fleeb2, fleebs.get(1));
        assertEquals(fleeb4, fleebs.get(2));
        assertEquals(fleeb5, fleebs.get(3));
        assertEquals(fleeb1, fleebs.get(4));
    }
}
