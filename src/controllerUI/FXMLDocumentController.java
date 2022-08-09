/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerUI;

import datos.Productos;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import modelo.Pila;

/**
 *
 * @author juan_est.fernandez
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private WebView idview;
    WebEngine webEngine;
    Pila<Productos> pilap;
    
    @FXML
    private Button idbutton;

    @FXML
    private Label idlabel; 
    
    @FXML
    private TextField idtext;     
  
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void AñadirProducto(ActionEvent event) {
        
        String nombreProducto= idtext.getText();
        
        Pila<Productos> pilaP = new Pila<>();
        
        pilaP.apilar(Pila);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        webEngine = idview.getEngine();
        pilap= new Pila<>();
        webEngine.loadContent();
    }        
}
