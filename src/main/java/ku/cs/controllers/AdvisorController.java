package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Advisor;

public class AdvisorController {
    @FXML
    private Label emailLabel;

    @FXML
    public void initialize() {
        Advisor advisor = new Advisor("rattaphon");
        showAdvisor(advisor);
    }

    private void showAdvisor(Advisor advisor) {
        emailLabel.setText(advisor.getEmail());
    }
}
