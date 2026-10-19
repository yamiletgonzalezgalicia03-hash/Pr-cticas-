package com.yamigg.practicadinero;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML TextField txtDinero;
    @FXML TextField txt500, txt200, txt100, txt50,txt20,txt10,txt5,txt2,txt1;
    
    @FXML
    private void btnDesglosar(){
       int Dinero = Integer.parseInt(txtDinero.getText());
       int res= Dinero;
       
       int b500 = res / 500;
       res= res % 500;
       int b200 = res / 200;
       res= res % 200;
       int b100 = res /100;
       res= res % 100;
       int b50 = res / 50;
       res= res % 50;
       int b20= res/20;
       res= res%20;
       int m10=res/10;
       res= res % 10;
       int m5= res/5;
       res= res % 5;
       int m2 = res/2;
       res= res % 2;
       int m1= res;
       
       txt500.setText(b500 + " ");
       txt200.setText(b200 + " ");
       txt100.setText(b100 + " ");
       txt50.setText(b50 + " ");
       txt20.setText(b20 + " ");
       txt10.setText(m10 + " ");
       txt5.setText(m5 + " ");
       txt2.setText(m2 + " ");
       txt1.setText(m1 + " ");
       
    }
    @FXML
    private void btnLimpiar(){
        txtDinero.setText(" ");
        txt500.setText(" ");
        txt200.setText(" ");
        txt100.setText(" ");
        txt50.setText(" ");
        txt20.setText(" ");
        txt10.setText(" ");
        txt5.setText(" ");
        txt2.setText(" ");
        txt1.setText(" ");
    }
}


