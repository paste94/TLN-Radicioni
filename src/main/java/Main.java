import net.sf.extjwnl.JWNLException;

public class Main {
    public static void main(String[]args){
        String sentence = "An electric guitar and bass player stand off to one side";
        String word = "bass";

        try {
            Algos.Lesk(word, sentence);
        } catch (JWNLException e) {
            e.getMessage();
        }
    }
}
