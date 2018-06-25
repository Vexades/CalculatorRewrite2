import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class UI extends JFrame {
    private int width;
    private int height;
    private ArrayList<Buttons> listOfButtons;

    UI(int width, int height){
        this.width = width;
        this.height = height;
        setSize(width,height);
        setLayout(null);
        setVisible(true);
    }

    public void setListOfButtons(){
        Buttons button0 = new Buttons("0", 10, 400, 50, 50, "0");
        Buttons bPunct = new Buttons(".", 70, 400, 50, 50,".");
        Buttons bEgal = new Buttons("=", 130, 400, 50, 50,"=");
        Buttons bParDreapta = new Buttons(")", 200, 400, 50, 50);
        Buttons button1 = new Buttons("1", 10, 330, 50, 50, "1");
        Buttons button2 = new Buttons("2", 70, 330, 50, 50, "2");
        Buttons button3 = new Buttons("3", 130, 330, 50, 50, "3");
        Buttons bParStanga = new Buttons("(", 200, 330, 50, 50);
        Buttons button4 = new Buttons("4", 10, 260, 50, 50, "4");
        Buttons button5 = new Buttons("5", 70, 260, 50, 50, "5");
        Buttons button6 = new Buttons("6", 130, 260, 50, 50, "6");
        Buttons bImp = new Buttons("/", 200, 260, 50, 50,"/");
        Buttons button7 = new Buttons("7", 10, 190, 50, 50, "7");
        Buttons button8 = new Buttons("8", 70, 190, 50, 50, "8");
        Buttons button9 = new Buttons("9", 130, 190, 50, 50, "9");
        Buttons bInm = new Buttons("*", 200, 190, 50, 50,"*");
        Buttons bMPlus = new Buttons("M+", 10, 120, 60, 60);
        Buttons bMMinus = new Buttons("M-", 80, 120, 60, 60);
        Buttons bMClear = new Buttons("MC", 150, 120, 60, 60);
        Buttons bAdd = new Buttons("+", 10, 60, 50, 50,"+");
        Buttons bSub = new Buttons("-", 70, 60, 50, 50,"-");
        Buttons back = new Buttons("<-", 130, 60, 50, 50,"-");

        listOfButtons = new ArrayList<>();
        listOfButtons.add(button0);
        listOfButtons.add(button1);
        listOfButtons.add(button2);
        listOfButtons.add(button3);
        listOfButtons.add(button4);
        listOfButtons.add(button5);
        listOfButtons.add(button6);
        listOfButtons.add(button7);
        listOfButtons.add(button8);
        listOfButtons.add(button9);
        listOfButtons.add(bInm);
        listOfButtons.add(bImp);
        listOfButtons.add(bMPlus);
        listOfButtons.add(bMMinus);
        listOfButtons.add(bMClear);
        listOfButtons.add(bAdd);
        listOfButtons.add(bSub);
        listOfButtons.add(back);
        listOfButtons.add(bParDreapta);
        listOfButtons.add(bParStanga);
        listOfButtons.add(bPunct);
        listOfButtons.add(bEgal);

    }

    public ArrayList<Buttons> getAllButtons(){
        return listOfButtons;
    }




}
