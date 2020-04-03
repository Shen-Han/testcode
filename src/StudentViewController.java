import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.net.URL;
import java.util.ResourceBundle;

    public class StudentViewController implements Initializable {

        @FXML private ImageView studentImageView;
        @FXML private ListView favAct1;
        @FXML private Label studentDisplay;
        //private String stringNum;

        @Override
        public void initialize(URL location, ResourceBundle resources) {
                //Collect student info
            //@FXML private StackPane favouriteActivities1;
            Student student = new Student("Shen","Han","Gaming",100088024);
            String firstName = student.setFirstName("Shen");
            String lastName = student.setLastName("Han");
            int studentNum = student.getvalidstudentNumber();
            String favAct = student.setFavAct("Gaming");
                //stringNum = Integer.toString(studentNum);


                //Add picture
                Image catPic = new Image("images/catPic.png");
                studentImageView.setImage(catPic);

                //Output student info into GUI, didn't work formatting wise, don't want to add 4 different textflows.
                /*Text l1 = new Text("First name:  ");
                student1.getChildren().add(l1);
                Text line1 = new Text(firstName);
                student1.getChildren().add(line1);

                Text Line2 = new Text(lastName);
                student1.getChildren().add(Line2);

                Text Line3 = new Text(stringNum);
                student1.getChildren().add(Line3);

                Text Line4 = new Text(favAct);
                student1.getChildren().add(Line4);

                 */

                studentDisplay.setText(String.format("First name:  %s%n%nLast name:  %s%n%nStudent Number:  %d", firstName, lastName, studentNum));
                favAct1.getItems().addAll(favAct);



        }


    }



