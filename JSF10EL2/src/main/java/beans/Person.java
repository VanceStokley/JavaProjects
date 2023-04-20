/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import Bl.Birth;
import Bl.Gender;
import Bl.Twin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "person")
@RequestScoped
public class Person {
  enum Education {
        HIGH_SCHOOL, COLLEGE, GRADUATE
    };

    enum Hobbies {
        FOOTBALL, BASKETBALL, BASEBALL, SWIMMING, RUNNING, TENNIS
    };

    private Hobbies hobbies;

    private Education education;

    private String firstName;

    private String lastName;

    private Birth birth;

    private Twin twin;

    private String[] siblingsNames = {"Paul", "Mary", "Alexander", "Anna"};
    private Map<String, String> siblingsFacts = new HashMap();

    private List<String> siblingsList = Arrays.asList(siblingsNames);


    private List<String> siblingsNamesList = Arrays.asList(siblingsNames);
    
    private List<Hobbies> hobbiesList = new ArrayList<>();


    

    /**
     * Creates a new instance of Person
     */
    public Person() {
        this.firstName = "joe";
        this.lastName = "black";
        education = Education.COLLEGE;

        siblingsFacts.put(siblingsNames[0], "Brown hair, height 5.11");
        siblingsFacts.put(siblingsNames[1], "Black hair, height 5.4");
        siblingsFacts.put(siblingsNames[2], "Blond hair, height 6.2");
        siblingsFacts.put(siblingsNames[3], "Brown hair, height 5.8");

        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(1988, Calendar.AUGUST, 28);
        birth = new Birth(calendar.getTime(), "Lafayette, LA", new Gender(true));

        twin = new Twin(true);
        
        hobbiesList.add(Hobbies.FOOTBALL);
        hobbiesList.add(Hobbies.SWIMMING);
    }
    
    public List<Hobbies> getHobbiesList() {
        return hobbiesList;
    }
    
    public Hobbies getHobbies() {
        return hobbies;
    }

    public void setHobbies(Hobbies hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getSiblingsList() {
        return siblingsList;
    }    

    public String[] getSiblings() {
        return this.siblingsNames;
    }

    public Map<String, String> getSiblingsFacts() {
        return this.siblingsFacts;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Twin getTwin() {
        return twin;
    }

    public void setTwin(Twin twin) {
        this.twin = twin;
    }

    public Birth getBirth() {
        return birth;
    }

    public void setBirth(Birth birth) {
        this.birth = birth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }   
}
