package landryshopmanagementsystem;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

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
    public void loginAccount() {
        if (username.getText().isEmpty() || password.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR MESSAGE");
            alert.setHeaderText(null);
            alert.setContentText("Username or Password is empty!");
            alert.showAndWait();
        } else {
            String sql = "SELECT * FROM employee WHERE username = ? AND password = ?";
            connect = (Connection) database.connectDb();


            try {
                prepare = connect.prepareStatement(sql);
                prepare.setString(1, username.getText());
                prepare.setString(2, password.getText());

                result = prepare.executeQuery();

                if (result.next()) {
                    alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("INFORMATION");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Logged In!");
                    alert.showAndWait();

                    // You can add dashboard load code here

                } else {
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR MESSAGE");
                    alert.setHeaderText(null);
                    alert.setContentText("Incorrect username or password!");
                    alert.showAndWait();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Optional: initialize logic
    }
}
