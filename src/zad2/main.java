package zad2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public main() {
    }

    public static void main(String[] args) {
        MetodiZaListaNiza m = new MetodiZaListaNiza();
        List<String> lista = new ArrayList();
        lista.add("A");
        lista.add("B");
        lista.add("V");
        m.listToArray(lista);
        String[] niza = new String[]{"a", "b", "v"};
        m.arrayToList(niza);
    }
}