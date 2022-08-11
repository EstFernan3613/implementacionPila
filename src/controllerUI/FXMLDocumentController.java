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
import modelo.tools;
import static modelo.tools.convertirPilaAHtml;

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
    private Label idlabel2;
    private Label idlabel3;
    
    @FXML
    private TextField idtext;
    private TextField idtext2;
    private TextField idtext3;
  
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void AddProduct(ActionEvent event) {
        
        String nombreProducto= idtext.getText();
        int cantidadProducto = Integer.parseInt(idtext2.getText());
        double valorProducto= Double.parseDouble(idtext3.getText());
        
        
        Productos objp=new  Productos(nombreProducto, 0, 0);
        pilap.apilar(objp);
        
        String mostrarPila = tools.convertirPilaAHtml(pilap);
        
        webEngine.loadContent(mostrarPila);
               
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        webEngine = idview.getEngine();
        pilap= new Pila<>();
        //webEngine.loadContent();
    }        
}
