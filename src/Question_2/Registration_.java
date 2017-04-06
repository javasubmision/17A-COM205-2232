/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jeffe
 */
public class Registration_ {
    
    static String imagepath, name, gender, dateofbirth, faculty, department, university;

    public static String getImagepath() {
        return imagepath;
    }

    public static void setImagepath(String imagepath) {
        Registration_.imagepath = imagepath;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Registration_.name = name;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        Registration_.gender = gender;
    }

    public static String getDateofbirth() {
        return dateofbirth;
    }

    public static void setDateofbirth(String dateofbirth) {
        Registration_.dateofbirth = dateofbirth;
    }

    public static String getFaculty() {
        return faculty;
    }

    public static void setFaculty(String faculty) {
        Registration_.faculty = faculty;
    }

    public static String getDepartment() {
        return department;
    }

    public static void setDepartment(String department) {
        Registration_.department = department;
    }

    public static String getUniversity() {
        return university;
    }

    public static void setUniversity(String university) {
        Registration_.university = university;
    }
    
    
     public static void regWrite() throws IOException
    {
        try(BufferedWriter myWriter = new BufferedWriter(new FileWriter("staff.txt",true)))
        {
        myWriter.write(getImagepath() +" "+ getName()+" "+ getGender()+" "+getDateofbirth()+" "+ getFaculty()+" "+getDepartment()+" "+getUniversity());
        myWriter.newLine();
        }
    }
}
