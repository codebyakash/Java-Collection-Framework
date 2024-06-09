package collectionFramework;

import java.util.Vector;

public class vectorObj {
    public static void main(String[] args) {
        Vector<Integer> vc = new Vector<>();
        vc.add(50);
        vc.add(17);
        vc.add(9);
        vc.add(26);
        vc.add(31);
        vc.add(65);
        vc.add(39);
        vc.add(45);
        vc.add(49);
        vc.add(55);
        
        System.out.println("Original Vector: " + vc);
        
        // Implementing bubble sort to sort in descending order
        for (int i = 0; i < vc.size() - 1; i++) {
            for (int j = 0; j < vc.size() - 1 - i; j++) {
                if (vc.get(j) > vc.get(j + 1)) {
                    int temp = vc.get(j);
                    vc.set(j, vc.get(j + 1));
                    vc.set(j + 1, temp);
                }
            }
        }
        System.out.println("Minimum Values: "+vc.get(0));
        System.out.println("Maximum Values: "+vc.get(vc.size()-1));
    }
}
