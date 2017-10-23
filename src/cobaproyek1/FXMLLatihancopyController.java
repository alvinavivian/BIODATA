/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaproyek1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author alvin
 */
public class FXMLLatihancopyController implements Initializable {

    @FXML
    private TextField id_nama;
    @FXML
    private TextField id_alamat;
    @FXML
    private TextField id_absen;
    @FXML
    private TextField id_telpon;
    @FXML
    private TextArea hasil;
    @FXML
    private Button hapus;
    @FXML
    private Button proses;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void hapuss(ActionEvent event) {
        id_nama.setText("");
        id_alamat.setText("");
        id_absen.setText("");
        id_telpon.setText("");
        hasil.setText("");
    
    }
    

    @FXML
    private void proses(ActionEvent event) {
    String nama=id_nama.getText();
        String alamat=id_alamat.getText();
        String absen=id_absen.getText();
        String telpon=id_telpon.getText();
        
        hasil.setText("\n Nama = "+nama+"\n alamat = "+alamat+"\n absen = "+absen+"\n telpon = "+telpon);
    
    }
    
}
