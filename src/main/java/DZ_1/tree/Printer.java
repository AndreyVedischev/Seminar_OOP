package DZ_1.tree;

import java.util.ArrayList;

public class Printer {
    public static String people(ArrayList<Person> Data) {
        StringBuilder res = new StringBuilder();
        for (Person person : Data) {
            res.append(person.getFullName() + '\t');
        }
        return res.toString();
    }
}
