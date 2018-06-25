import java.util.ArrayList;
import java.util.List;

public class VariableKeep {
    String currentState = "";
    String lastState = "";
    List<String> elements = new ArrayList<>();

    public static VariableKeep instance = null;

    private VariableKeep(){
    }

    public static VariableKeep getInstance() {
        if(instance == null){
            instance = new VariableKeep();
        }
        return instance;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public List<String> getElements() {
        return elements;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }

    public String getLastState() {
        return lastState;
    }

    public void setLastState(String lastState) {
        this.lastState = lastState;
    }
}
