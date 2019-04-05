import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.IndexWordSet;

import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.data.Synset;
import net.sf.extjwnl.dictionary.Dictionary;

import java.util.Collection;
import java.util.List;

public class Algos {
    public static String Lesk(String word, String sentence) throws JWNLException {
        Dictionary dictionary = Dictionary.getDefaultResourceInstance();
        IndexWordSet indexWordSet = dictionary.lookupAllIndexWords(word);
        IndexWord[] a = indexWordSet.getIndexWordArray();
        a[0].sortSenses();
        List<Synset> senses = a[0].getSenses();
        for(Synset e :senses){
            System.out.println(e);
        }
        return "";
    }
}
