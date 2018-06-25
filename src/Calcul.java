import java.util.List;

public class Calcul {
    Calculable calculable;
    public String calcul(List<String> lista){
        double numar = 0;

        while (lista.size() > 0){
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).contains("*")){
                    calculable = new Mul();
                   numar = calculOSinguraOperatie(lista,i,calculable);
                    i = 0;
                }
            }for (int i = 0; i <lista.size();i++){
                if(lista.get(i).contains("/")){
                    calculable = new Div();
                    numar = calculOSinguraOperatie(lista,i,calculable);
                    i = 0;
                }
            }
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).contains("+")){
                    if(lista.size()>3 && lista.contains("-")){
                        if(lista.get(i-2).contains("-")){
                            break;
                        }
                    }
                    calculable = new Add();
                   numar = calculOSinguraOperatie(lista,i,calculable);
                    i = 0;
                }
            }
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).contains("-")){
                    calculable = new Sub();
                  numar =  calculOSinguraOperatie(lista, i, calculable);
                    i = 0;
                }
            }
        }
        String parse = String.valueOf(numar);
        return parse;
    }
    public double calculOSinguraOperatie(List<String> lista, int pozitie, Calculable calcul){
        double numar = 0;
        numar = calcul.calcul(Double.parseDouble(lista.get(pozitie-1)), Double.parseDouble(lista.get(pozitie+1)));
        lista.remove(lista.get(pozitie-1));
        lista.remove(lista.get(pozitie-1));
        lista.remove(lista.get(pozitie-1));
        lista.add(pozitie-1, String.valueOf(numar));
        return numar;
    }
}
