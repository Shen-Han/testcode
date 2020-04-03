import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Main extends Application {
    public static void main(String[] args) throws IllegalArgumentException {
	    //Student name = new Student();
        //System.out.println(name);
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Student Card");

        /*
        button = new Button ();
        button.setText("Click Here");
        button. setOnAction(e -> System.out.println("Hi there!"));

        AnchorPane layout = new AnchorPane();
        layout.getChildren().add(button);
         */

        Parent root = FXMLLoader.load(getClass().getResource("NewStudentView.fxml"));
        Scene scene = new Scene (root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
