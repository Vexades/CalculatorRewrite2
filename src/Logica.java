import java.util.List;

public class Logica {
    public double calculate(List<String> lista) {
        double result = 0;
        Calculable calul;

        while (lista.size() > 0) {
            for (int i = 0; i < lista.size(); i++) {
                int numaraParanteza = 0;
                if (lista.get(i) == "(") {
                    numaraParanteza++;
                } else if (lista.get(i) == ")") {
                    numaraParanteza--;
                }
                if (numaraParanteza != 0) {
                    try {
                        throw new ExceptiiParanteze("Numar de paranteze invalid!");
                    } catch (ExceptiiParanteze exceptiiParanteze) {
                        exceptiiParanteze.printStackTrace();
                    }
                }
            }
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).equals("(") && lista.get(i+1)){
            }

        }
    }
}
