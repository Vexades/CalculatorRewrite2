import java.util.List;

public class Paranteze {
    public void LogicaParanteze(List<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            //Cand lista incepe cu )
            if (lista.get(0) == ")") {
                try {
                    throw new ExceptiiParanteze("Prima paranteza este gresita!");
                } catch (ExceptiiParanteze exceptiiParanteze) {
                    exceptiiParanteze.printStackTrace();
                    break;
                }
                //Cand lista incepe cu (*/
            }
            if (lista.get(0) == "(" && lista.get(1) == "*" || lista.get(1) == "/") {
                try {
                    throw new ExceptiiParanteze("Element invalid dupa paranteza de langa " + lista.get(i + 1).toString());
                } catch (ExceptiiParanteze exceptiiParanteze) {
                    exceptiiParanteze.printStackTrace();
                    break;
                }

            }else if(lista.get(0).equals("(") && lista.get(1) == ")"){
                lista.remove(lista.get(i));
                lista.remove(lista.get(i));
            }
            if ((!lista.isEmpty()) && lista.size() > 3) {

                //Cand avem de exemplu +- () -    +- (ori unul ori altul)
                if (lista.get(i) == "(") {
                    if (lista.get(i + 1) == ")" && lista.get(i - 1) == "-" || lista.get(i - 1) == "+" && lista.get(i + 2) == "-" ) {
                        lista.remove(lista.get(i - 1));
                        lista.remove(lista.get(i - 1));
                        lista.remove(lista.get(i-1));
                        return;
                        //Cand avem de exemplu -(+numar sau
                    }else if(lista.get(i + 1) == ")" && lista.get(i - 1) != "-" || lista.get(i - 1) == "+" && lista.get(i + 2) != "-" ) {
                        try {
                            throw new ExceptiiParanteze("Operatori invalizi in afara parantezelor paranteze /*()*/");
                        } catch (ExceptiiParanteze exceptiiParanteze) {
                            exceptiiParanteze.printStackTrace();
                            return;
                        }

                        //Cand avem +- () -
                    }else if (lista.get(i) == "(" && lista.get(i - 1) == "-" && lista.get(i + 1) == "+" || lista.get(i + 1) == "-") {
                        lista.remove(lista.get(i));
                        lista.remove(lista.get(i));
                        return;
                        //cand avem de exemplu +-(-numar
                    }else if(lista.get(i) == "(" && lista.get(i-1) == "+" && lista.get(i+1) == "-" ){
                        lista.remove(lista.get(i));
                        lista.remove(lista.get(i));
                        return;
                        //Cand avem */()/*
                    }if(lista.get(i+1) ==  ")" && lista.get(i-1) == "*" || lista.get(i-1) == "/" && lista.get(i+2) == "/" || lista.get(i+2) == "*"){
                        try {
                            throw new ExceptiiParanteze("Operatori invalizi intr-e paranteze ()");
                        } catch (ExceptiiParanteze exceptiiParanteze) {
                            exceptiiParanteze.printStackTrace();
                            return;
                        }
                    }

                    //Cand avem de exemplu */ () /*
                }
                if (lista.get(i) == ")") {
                    if (lista.get(i+1) == ")"  && lista.get(i - 1) != "-" || lista.get(i-1) != "+" && lista.get(i + 2) != "-" || lista.get(i + 2) == "+") {
                        try {
                            throw new ExceptiiParanteze("Carctere invalide intre paranteze ()");
                        } catch (ExceptiiParanteze exceptiiParanteze) {
                            exceptiiParanteze.printStackTrace();
                            return;
                        }

                    }

                    //Cand avem */(*/
                }if(lista.get(i) == "(") {
                    if (lista.get(i) == "(" && lista.get(i - 1) == "*" || lista.get(i - 1) == "/" && lista.get(i + 1) == "*" || lista.get(i + 1) == "/") {
                        try {
                            throw new ExceptiiParanteze("Elemente nevalide intre paranteza");
                        } catch (ExceptiiParanteze exceptiiParanteze) {
                            exceptiiParanteze.printStackTrace();
                            return;
                        }
                    }
                }
            }
        }
    }
}
