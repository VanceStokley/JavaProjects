/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bl;

import java.util.Date;

/**
 *
 * @author roust
 */
public class Birth {
   private Date birthday;

    private String birthplace;

    Gender gender;

    public Birth(Date birthday, String birthplace, Gender gender) {
        this.birthday = birthday;
        this.birthplace = birthplace;
        this.gender = gender;
    }



    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }  
}
