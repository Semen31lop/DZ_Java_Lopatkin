package HW5;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;


public class task2 {
    public static Map<String, List<String>> telephone = new HashMap<>();
    
        public static void main(String[] args) {
            addPerson();
            Scanner sc = new Scanner(System.in);
            System.out.print(" name :  ");
            String str = sc.nextLine();
            sc.close();
            findPerson(str);
        }
    
        public static void addPerson() {
            telephone.put("Tom", List.of("837", "283","22"));
            telephone.put("Sem", List.of("311", "145"));
            telephone.put("Dina",List.of("22","33","999"));
            telephone.put("Den",List.of("837", "713","44"));
            telephone.put("Alex",List.of("777", "77"));
            telephone.put("Son",List.of("666"));
            telephone.put("Bob",List.of("12", "55"));

    
        }
        public static void findPerson(String name) {
            System.out.printf("%s: %s", name, telephone.get(name));
        }
}
