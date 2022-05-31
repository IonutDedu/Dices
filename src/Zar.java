import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zar implements Comparable<String>{

   private List<String> faces = Arrays.asList("1", "2", "3","4", "5", "6");

    public List<String> getFaces() {
        return faces;
    }

    public List<String> rollDice(List<String> faces){
        Collections.shuffle(faces);
        return faces;
    }

    public String get(int i){
        return faces.get(i);
    }

    @Override
    public String toString() {
        return "Zar{" +
                "faces=" + faces +
                '}';
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
