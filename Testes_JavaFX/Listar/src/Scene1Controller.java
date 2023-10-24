import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene1Controller {

    @FXML
    TextField nameTextField;
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private void login(ActionEvent event) throws IOException {
        String username = nameTextField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/tela/scene3.fxml"));
        root = loader.load();

        Scene3Controller scene3Controller = loader.getController();
        scene3Controller.setUsername(username);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
