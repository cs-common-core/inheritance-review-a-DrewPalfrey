package TechCompany;

import java.util.ArrayList;

public class Manager extends Employee{
    private String[] projects;
    private int numEmployees;

    public Manager(String name, String title, String[] projects, int numEmployees){
        super(name, title);
        this.projects = projects;
        this.numEmployees = numEmployees;
    }

    public void work(){
        System.out.println(this.getName() + " is working as a " + this.getTitle() + " on " + makeString(projects) + "and supervises " + numEmployees + " employees ");
    }

    public String makeString(String[] projects){
        String projectString = "";
        for(String e : projects){
            projectString += e + ", ";
        }
        return projectString;
    }

    public String toString(){
        return this.getName() + "; " + this.getTitle() + "; " + makeString(projects) + "; " + numEmployees;
    }

}
