import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.net.URL;
import java.util.ResourceBundle;

public class NewStudentViewController {

    @FXML
    private TextField firstNameTextEntry;
    @FXML
    private TextField lastNameTextEntry;
    @FXML
    private TextField studentNumberTextEntry;
    @FXML
    private CheckBox gaming;
    @FXML
    private CheckBox music;
    @FXML
    private CheckBox coding;
    @FXML
    private CheckBox sports;
    @FXML
    private CheckBox driving;
    @FXML
    private CheckBox mazda;
    @FXML
    private CheckBox food;
    @FXML
    private CheckBox cooking;
    @FXML
    private Label errorMessage;



    public void buttonPushed() {
        int d = Integer.parseInt(studentNumberTextEntry.getText());
        //viewStudentButton.setVisible(true);

        if (fieldsAreFull()) {
            try {
                Student newStudent = new Student(firstNameTextEntry.getText(), lastNameTextEntry.getText(), interestEntry(), d);
                System.out.println("\nNew Student: " + newStudent);

            } catch (IllegalArgumentException e) {
                errorMessage.setText(e.getMessage());
            }

        }
    }

        /*System.out.println(firstNameTextEntry.getText());
        System.out.println(lastNameTextEntry.getText());
        double d = Double.parseDouble(studentNumberTextEntry.getText());
        System.out.println(d);
        */

        public String interestEntry(){
        String interests = "Interests are:";

        if(gaming.isSelected()){
            interests += "\nGaming";
        }
        if(music.isSelected()){
            interests += "\nMusic";
        }
        if(coding.isSelected()){
            interests += "\nCoding";
        }
        if(sports.isSelected()){
            interests += "\nSports";
        }
        if(driving.isSelected()){
            interests += "\nDriving";
        }
        if(mazda.isSelected()){
            interests += "\nMazda";
        }
        if(food.isSelected()){
            interests += "\nFood";
        }
        if(cooking.isSelected()){
            interests += "\nCooking";
        }
        else {

        }

        System.out.printf("%s",interests);
        return interests;
    }
    public String firstName(){
            String firstName = firstNameTextEntry.getText();
        System.out.printf("%s",firstName);

        return firstName;
    }



        public boolean fieldsAreFull() {
            String message = "";
            if (firstNameTextEntry.getText().isEmpty()) {
                message = "First name field is empty";
            }

            if (lastNameTextEntry.getText().isEmpty()) {
                message = "Last name field is Empty";
            }

            //May need to change this to integer
            if (studentNumberTextEntry.getText().isEmpty()) {
                message = "Student Number field is Empty";
            }

        /*if(interestSelection.getCheckMark().isEmpty()){
            message = "No interest selected";
        }

         */

            //Message for when all required fields are empty

            /*&&interestSelection.getCheckMark().isEmpty()*/

            if (firstNameTextEntry.getText().isEmpty() && lastNameTextEntry.getText().isEmpty() && studentNumberTextEntry.getText().isEmpty()) {
                message = "All required fields are empty";
            }

            return true;
        }

        public void addActivities(){


        }
    }

