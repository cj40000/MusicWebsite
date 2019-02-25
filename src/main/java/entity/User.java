package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;


/**
 * A class to represent a user.
 *
 * @author cjardine
 */
@Entity(name = "User")
/////This needs a database and a table, maybe change the name
@Table(name = "user")
public class User {

    // id # of the user
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    // The user's chosen name when creating an account
    @Column(name = "user_name")
    private String userName;

    // The user's chosen password when creating an account
    private String userPassword;

    // The Area Code that the user is from
    private int areaCode;


    //These may be used later
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private Date dateOfBirth;
    private LocalDate currentDate = LocalDate.now();


    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param userName  the user name
     * @param id        the id
     * @param dateOfBirth the dateOrBirth
     */
    public User(String firstName, String lastName, String userName, int id, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets areaCode.
     *
     * @return the areaCode
     */
    public int getAreaCode() {
        return areaCode;
    }

    /**
     * Sets areaCode.
     *
     * @param areaCode the areaCode
     */
    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * Gets userPassword.
     *
     * @return userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Sets id.
     *
     * @param userPassword the userPassword
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }



    /**
     * Gets dateOfBirth.
     *
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets dateOfBirth.
     *
     * @param dateOfBirth the dateOfBirth
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }










    /////// Below is older functions that may or not be used

    /**
     * Puts user information into one big string
     * This will need to be updated to display relevant information
     *
     */
    @Override
    public String toString() {
        return "User{" +
                "ID='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + getCalculateAge() + '\'' +
                '}';
    }


    /**
     * Calculates the users age. Return zero if there is an error
     *
     * @return an int  representing the users age
     */
    public int getCalculateAge() {

        LocalDate ld = new java.sql.Date(dateOfBirth.getTime()).toLocalDate();

        if ((dateOfBirth != null) && (currentDate != null)) {
            return Period.between(ld, currentDate).getYears();
        } else {
            return 0;
        }
    }


}
