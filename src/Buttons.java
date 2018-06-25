import javax.swing.*;
import java.awt.event.ActionListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class Buttons extends JButton {
    private String value;
    private String name;
    private int width;
    private int heigt;
    private int x;
    private int y;

    public Buttons( String name,int x,int y, int width, int heigt,String value){
        this.name = name;
        this.value = value;
        this.width = width;
        this.heigt = heigt;
        this.x = x;
        this.y = y;
        setBounds(this.x,this.y,this.width,this.heigt);
        setText(this.name);
    }
    public Buttons( String name,int x,int y, int width, int heigt){
        this.name = name;
        this.width = width;
        this.heigt = heigt;
        this.x = x;
        this.y = y;
        setBounds(x,y,width,heigt);
        setText(this.name);
    }
    public void setListener(ActionListener listener){
        addActionListener(listener);
    }
    public void test(){
        System.out.println(value);
    }
    public String getValue(){
        return value;
    }

}

