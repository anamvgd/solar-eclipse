package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class EclipseController {

    @FXML
    private Circle moonCircle;

    @FXML
    private Circle sunCircle;

    @FXML
    private Circle crat1;

    @FXML
    private Circle crat2;

    @FXML
    private Circle crat3;

    @FXML
    void moveButtonPressed(ActionEvent event) {
    	
    	moonCircle.setLayoutX(moonCircle.getLayoutX()+5);
    	crat1.setLayoutX(crat1.getLayoutX()+5);
    	crat2.setLayoutX(crat2.getLayoutX()+5);
    	crat3.setLayoutX(crat3.getLayoutX()+5);

    }

}