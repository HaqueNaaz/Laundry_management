/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package landryshopmanagementsystem;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    
        @FXML
    private Button login_btn;

    @FXML
    private AnchorPane main_form;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;
    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    
    private Alert alert;
    
    
        @FXML
    public void loginAccount(){
    
    
        if(username.getText().isEmpty() || password.getText().isEmpty()){
            
            
          alert = new Alert(AlertType.ERROR);
          alert.setTitle("ERROR MESSAGE");
          alert.setContentText("INCORRECT Username/password");
            
        }else{
            
            String sql = "SELECT * FROM employee WHERE username = '"+username.getText()+"'AND password='"+password.getText()+"'";
            
            connect = database.connectionDB();
            
            try{
                prepare=connect.prepareStatement(sql);
                result = prepare.executeQuery();
                
                if(result.next()){
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("INFORMATION MANAGER");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully login");
                    alert.showAndWait();
                }else{
                    
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("ERROR MESSAGE");
                    alert.setHeaderText(null);
                    alert.setContentText("Incorrect username / password");
                    alert.showAndWait();
                
            }
            }
            catch(Exception e) {e.printStackTrace();}
            }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
