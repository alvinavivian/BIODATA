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
public class FXMLLatihanController implements Initializable {

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
    private Button proses;
    @FXML
    private Button hapus;
    
    @FXML
     void hapuss(ActionEvent event){

        hasil.setText("");
    }
     
    @FXML
  
 void prosess(ActionEvent event) {
        String nama=id_nama.getText();
        String alamat=id_alamat.getText();
        String absen=id_absen.getText();
        String telpon=id_telpon.getText();
        
        hasil.setText("\n Nama = "+nama+"\n alamat = "+alamat+"\n absen = "+absen+"\n telpon = "+telpon);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
