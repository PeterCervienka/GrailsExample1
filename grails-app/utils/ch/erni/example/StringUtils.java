package ch.erni.example;

import java.text.Normalizer;
import java.util.regex.Pattern;

/**
 * Created by cepe on 10.02.2015.
 */
public class StringUtils {
    public static String deAccent(String str) {
        if (str == null) return null;

        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("");
    }
}
