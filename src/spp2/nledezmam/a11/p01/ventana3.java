/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.nledezmam.a11.p01;
import java.awt.*;
/**
 *
 * @author normaledezma
 */
public class ventana3 extends Frame  {
    //Atributos: 3 botones.
    private final Button bin1, bin2, bin3, bin4, bin5, bin6, bin7, bin8, bin9;
    
    //Constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana3 (){
        super("Grid");
        setLayout(new GridLayout());
        
        bin1 = new Button("Soy el botón #1");
        add (bin1);
        
        bin2 = new Button("Soy el botón #2");
        add (bin2);
        
        bin3 = new Button("Soy el botón #3");
        add (bin3);
        
        bin4 = new Button("Soy el botón #4");
        add (bin4);
        
        bin5 = new Button("Soy el botón #5");
        add (bin5);
        
        bin6 = new Button("Soy el botón #6");
        add (bin6);
        
        bin7 = new Button("Soy el botón #7");
        add (bin7);
        
        bin8 = new Button("Soy el botón #8");
        add (bin8);
      
         bin9 = new Button("Soy el botón #9");
        add (bin9);
        
        setSize(500,500);
        setVisible(true);
    
    }
}
