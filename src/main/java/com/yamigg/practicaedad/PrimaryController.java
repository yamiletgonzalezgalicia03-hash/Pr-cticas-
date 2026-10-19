package com.yamigg.practicaedad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML TextField txtFecha;
    @FXML Label lblResultado;
    @FXML Button btnLimpiar;
    @FXML Button btnCalcularedad;
    
    @FXML
    private void btnCalcularEdad (){
        String texto = txtFecha.getText().replace(" ","/").trim();
      DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate nacimiento =LocalDate.parse(txtFecha.getText(), fmt);
      LocalDate hoy= LocalDate.now();
      
      int anios = hoy.getYear() - nacimiento.getYear();
      int meses = hoy.getMonthValue()- nacimiento.getMonthValue();
      if (hoy.getDayOfMonth()< nacimiento.getDayOfMonth()){
          meses--;
      }
      if (meses < 0){
          anios--;
          meses += 12;
    }
      lblResultado.setText("Tiene "+ anios + " años con " + meses + " meses");
      
}
    @FXML 
    private void btnLimpiar(){
      txtFecha.clear();
      lblResultado.setText(" ");
 }
}
