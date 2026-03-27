

import java.util.HashMap;
import java.util.Map;

public class AppLab4 {
    public static void main(String[] args) {
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);

        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj","Simina", "Alba-Iulia","Marius", "Medias", "Mihai", "Cisnadie","Daniela", "Sibiu");
        System.out.println("Conținut inițial 'varste': " + varste);
        varste.put("Vlad", 19);
        varste.put("Iulia", 19);
        System.out.println("Conținut 'varste' după adăugare: " + varste);

        HashMap<String, Tanar> tineri = new HashMap<>();

        for (String nume : varste.keySet()) {
            int varsta = varste.get(nume);
            String adresa = adrese.getOrDefault(nume, "Adresa necunoscuta");

            tineri.put(nume, new Tanar(nume, varsta, adresa));
        }

        for (Map.Entry<String, Tanar> entry : tineri.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        for (Map.Entry<String, Tanar> entry : tineri.entrySet()) {
            System.out.println("Cheie: " + entry.getKey() + " | Valoare: " + entry.getValue());
        }
    }

}


