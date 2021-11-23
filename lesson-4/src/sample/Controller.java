
package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea mainTextArea;
    @FXML
    TextField mainTextField;
    public void btnOneClickAction(ActionEvent actionEvent) {
        if(!mainTextField.getText().trim().isEmpty()) {
            mainTextArea.appendText(mainTextField.getText() + "\n");
            mainTextField.clear();
        }
    }

   }
