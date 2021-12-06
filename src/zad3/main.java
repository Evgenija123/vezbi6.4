package zad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class main {
    public main() {
    }

    public static void main(String[] args) {
        List<SportskiKlub> list = new ArrayList();
        list.add(new SportskiKlub("Manchester C", "Fudbal", 16));
        list.add(new SportskiKlub("Real M", "Fudbal", 16));
        list.add(new SportskiKlub("Manchester U", "Fudbal", 16));
        Collections.sort(list);
        Iterator var3 = list.iterator();

        while(var3.hasNext()) {
            SportskiKlub a = (SportskiKlub)var3.next();
            System.out.println(a.getIme());
            System.out.println(a.getSport());
            System.out.println(a.getBrojClenovi());
            System.out.println();
        }

    }
}

