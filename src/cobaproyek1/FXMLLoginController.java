/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaproyek1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author alvin
 */
public class FXMLLoginController implements Initializable {

    @FXML
    private Label lJudul;
    @FXML
    private Label lUser;
    @FXML
    private Label iPass;
    @FXML
    private TextField edituser;
    @FXML
    private TextField editpass;
    @FXML
    private Button btnOke;
    @FXML
    private Button btnCancel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
