package haileyArnold.myZoo.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalNames {
    private static Map<String, List<String>> speciesNames = new HashMap<>();
    private static Map<String, Integer> nameIndex = new HashMap<>();

    static {
        // Initialize Hyena names
        List<String> hyenaNames = new ArrayList<>();
        hyenaNames.add("Shenzi");
        hyenaNames.add("Banzai");
        hyenaNames.add("Ed");
        hyenaNames.add("Zig");
        hyenaNames.add("Bud");
        hyenaNames.add("Lou");
        hyenaNames.add("Kamari");
        hyenaNames.add("Wema");
        hyenaNames.add("Nne");
        hyenaNames.add("Madoa");
        hyenaNames.add("Prince Nevarah");
        speciesNames.put("Hyena", hyenaNames);

        // Initialize Lion names
        List<String> lionNames = new ArrayList<>();
        lionNames.add("Scar");
        lionNames.add("Mufasa");
        lionNames.add("Simba");
        lionNames.add("Kiara");
        lionNames.add("King");
        lionNames.add("Drooper");
        lionNames.add("Kimba");
        lionNames.add("Nala");
        lionNames.add("Leo");
        lionNames.add("Samson");
        lionNames.add("Elsa");
        lionNames.add("Cecil");
        speciesNames.put("Lion", lionNames);

        // Initialize Bear names
        List<String> bearNames = new ArrayList<>();
        bearNames.add("Yogi");
        bearNames.add("Smokey");
        bearNames.add("Paddington");
        bearNames.add("Lippy");
        bearNames.add("Bungle");
        bearNames.add("Baloo");
        bearNames.add("Rupert");
        bearNames.add("Winnie the Pooh");
        bearNames.add("Snuggles");
        bearNames.add("Bert");
        speciesNames.put("Bear", bearNames);

        // Initialize Tiger names
        List<String> tigerNames = new ArrayList<>();
        tigerNames.add("Tony");
        tigerNames.add("Tigger");
        tigerNames.add("Amber");
        tigerNames.add("Cosimia");
        tigerNames.add("Cuddles");
        tigerNames.add("Dave");
        tigerNames.add("Jiba");
        tigerNames.add("Rajah");
        tigerNames.add("Rayas");
        tigerNames.add("Ryker");
        speciesNames.put("Tiger", tigerNames);

        // Initialize name indices
        nameIndex.put("Hyena", 0);
        nameIndex.put("Lion", 0);
        nameIndex.put("Tiger", 0);
        nameIndex.put("Bear", 0);
    }

    public static String getNextName(String species) {
        List<String> names = speciesNames.get(species);
        if (names == null || names.isEmpty()) {
            return "Unknown";
        }

        int index = nameIndex.get(species);
        String name = names.get(index % names.size());
        nameIndex.put(species, index + 1);
        return name;
    }

    public static String generateId(String species, int count) {
        String prefix = species.substring(0, 2).toUpperCase();
        return String.format("%s%02d", prefix, count);
    }
}
