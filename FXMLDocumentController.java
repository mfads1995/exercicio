/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author IFNMG
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private Label dobro;
    @FXML
    private Label triplo;
    @FXML
    private Label quadrado;
    @FXML
    private Label cubo;
    @FXML
    private TextField tfNumero;
    @FXML
    private TextField tfdobro;
    @FXML
    private TextField tftriplo;
    @FXML
    private TextField tfquad;
    @FXML
    private TextField tfcubo;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Calcular(ActionEvent event) {
      String b=  tfNumero.getText();
        
      double t=Double.parseDouble(b);
      double n= t*2;
      tfdobro.setText(Double.toString(n));
      
      double p=t*3;
      tftriplo.setText(Double.toString(p));
      
      double a=Math.pow(t, 2);
     tfquad.setText(Double.toString(a));
     
      double x=Math.pow(t, 3);
     tfcubo.setText(Double.toString(x));
     
     
    }
    
    
       }

