package task_32;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

/**
 * Имеется текст. Следует составить для него частотный словарь.
 */
public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Если человек живет, чтобы приносить людям добро, облегчать их страдания," +
                " давать людям радость, то он оценивает себя на уровне этой своей человечности. " +
                "Он ставит себе цель, достойную человека.";

        String[] arrayByWord = text.replaceAll("\\p{Punct}", "").toLowerCase().split("\s+");

        Map<String, Integer> dictionary = new TreeMap<>();
        double sum = 0;
        for (String i : arrayByWord) {
            dictionary.put(i, dictionary.containsKey(i) ? dictionary.get(i) + 1 : 1);
            sum += dictionary.get(i);
        }

        NumberFormat formatter = new DecimalFormat("#0.0000");
        for (String i : dictionary.keySet()) {
            System.out.println(i + " - " + formatter.format(dictionary.get(i) / sum));

        }


    }
}
