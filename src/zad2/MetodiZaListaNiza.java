package zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MetodiZaListaNiza {
    public MetodiZaListaNiza() {
    }
    public void listToArray(List<String> lista) {
        String[] niza = new String[lista.size()];
        lista.toArray(niza);
        System.out.println("Lista pretvorena vo niza: ");
        String[] var6 = niza;
        int var5 = niza.length;

        for(int var4 = 0; var4 < var5; ++var4) {
            String s = var6[var4];
            System.out.println(s);
        }

    }

    public void arrayToList(String[] niza) {
        new ArrayList();
        List<String> lista = Arrays.asList(niza);
        System.out.println("Niza pretvorena vo lista: ");
        Iterator var4 = lista.iterator();

        while(var4.hasNext()) {
            String s = (String)var4.next();
            System.out.println(s);
        }

    }
}

