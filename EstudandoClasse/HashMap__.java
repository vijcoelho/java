package EstudandoClasse;

import java.util.*;

public class HashMap__ {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<String, String>();
        capitais.put("England", "London");
        capitais.put("Germany", "Berlin");
        System.out.println(capitais);

        for(String i:capitais.values()) {
            System.out.println(i);
        }
    }
}
