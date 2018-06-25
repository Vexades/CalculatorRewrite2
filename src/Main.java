import javax.swing.*;
import javax.swing.plaf.ButtonUI;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UI uiFrame = new UI(300, 500);
        uiFrame.setListOfButtons();
        for (Buttons button : uiFrame.getAllButtons()) {
            uiFrame.add(button);
        }

        ActionListener listener = e -> {
            if (e.getSource() instanceof Buttons) {
                Buttons button = (Buttons) e.getSource();
                String punct = "";
                if(button.getValue().equals("*") || button.getValue().equals("-") || button.getValue().equals("+") || button.getValue().equals("/")){
                    if(!VariableKeep.getInstance().getCurrentState().isEmpty()){
                        if(!(VariableKeep.getInstance().getLastState() == VariableKeep.getInstance().getCurrentState()) && !VariableKeep.getInstance().getCurrentState().equals(".")) {
                            VariableKeep.getInstance().elements.add(VariableKeep.getInstance().getCurrentState());
                            VariableKeep.getInstance().elements.add(button.getValue());
                            VariableKeep.getInstance().setCurrentState("");
                            punct = "";
                        }
                    }else if(VariableKeep.getInstance().getElements().size() == 0 &&  button.getValue().equals("+") || button.getValue().equals("-")){
                        VariableKeep.getInstance().setCurrentState(button.getValue());
                    }else {
                        return;
                    }
                }else if(button.getValue().equals(".") ) {
                    punct = ".";
                    if(!VariableKeep.getInstance().getCurrentState().contains(".")) {
                        VariableKeep.getInstance().setCurrentState(VariableKeep.getInstance().getCurrentState()  + punct);
                    }
                }else {
                    VariableKeep.getInstance().setCurrentState(VariableKeep.getInstance().getCurrentState() + button.getValue() );
                }
                if(button.getValue().equals("*")|| button.getValue().equals("-")||button.getValue().equals("+")||button.getValue().equals("/") || button.getValue().equals(".")) {
                    VariableKeep.getInstance().setLastState(button.getValue());
                }
                System.out.println(VariableKeep.getInstance().getElements());
            }
        };
        for (Buttons btn : uiFrame.getAllButtons()) {
            btn.setListener(listener);
        }
    }
}
