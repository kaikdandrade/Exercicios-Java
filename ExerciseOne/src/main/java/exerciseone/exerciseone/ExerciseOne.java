package exerciseone.exerciseone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Kaik D' Andrade
 */
public class ExerciseOne {

    private String firstName = "";
    private String lastName = "";
    private String birthDate;
    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (!"".equals(firstName.trim())) {
            this.firstName = firstName.trim();
        } else {
            this.firstName = null;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (!"".equals(lastName.trim())) {
            this.lastName = lastName.trim();
        } else {
            this.lastName = null;
        }
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        if(isDateValid(birthDate.trim())) {
            this.birthDate = birthDate.trim();
        } else {
            this.birthDate = null;
        }
    }

    public String getFullName() {
        return (getFirstName() + " " + getLastName()).trim();
    }

    public int getAge() {
        if (getBirthDate() != null) {
            return Period.between(LocalDate.parse(getBirthDate(), DateTimeFormatter.ofPattern("dd/MM/yyyy")), LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }

    public boolean isDateValid(String birthDate) {
        if (birthDate != null) {
            String regex = "^\\d{2}/\\d{2}/\\d{4}$";
            return birthDate.matches(regex);
        } else {
            return false;
        }
    }

    // Apenas para o mavem não ficar dando tilti
    public static void main(String[] args) {
        System.out.println("Rodando");
    }
}