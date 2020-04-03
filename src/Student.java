import javafx.scene.image.Image;
import java.util.Arrays;
import java.util.List;

public class Student {
    public String firstName, lastName, favAct;
    private Integer sNumber;
    private Image catPic;

    public Student(String firstName, String lastName, String favAct, Integer sNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setSNumber(sNumber);
        setFavAct(favAct);
        catPic = new Image("./images/catPic.jpg");
    }

    //@param firstName Shen;

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String firstName) {
        List<String>validFirstName = getvalidFirstName();
        if (validFirstName.contains(firstName))
            this.firstName = firstName;
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        List<String>validLastName = getvalidLastName();
        if(validLastName.contains(lastName))
            this.lastName = lastName;
        return lastName;
    }

    public String getFavAct(){
        return favAct;
    }

    public String setFavAct(String favAct){
        List<String>validfavAct = getvalidAct();
        if(validfavAct.contains(favAct))
            this.favAct=favAct;
        return favAct;
    }

    public Integer getSNumber() {
        return sNumber;
    }

    public void setSNumber(Integer sNumber) {
        int validSNumber = getvalidstudentNumber();
        this.sNumber = sNumber;
    }

    public static List<String> getvalidFirstName(){
        return Arrays.asList();
    }

    public static List<String> getvalidLastName(){
        return Arrays.asList();
    }

    public static List<String> getvalidAct(){
        return Arrays.asList();
    }

    public Image getcatPic() {
        return catPic;
    }

    public void setcatPic(Image catPic) {
        this.catPic = catPic;
    }

    public static int getvalidstudentNumber(){
        int sNumber = 88024;
        return sNumber;
    }

    public String toString(){
        return String.format("%s %s student#: %d",firstName,lastName,sNumber);
    }


}
