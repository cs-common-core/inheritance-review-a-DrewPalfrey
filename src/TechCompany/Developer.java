package TechCompany;

public class Developer extends Employee{
    private String project;

    public Developer(String name, String title, String project){
        super(name, title);
        this.project = project;
    }

    public void work(){
        System.out.println(this.getName() + " is working as a " + this.getTitle() + " on " + project);
    }

    public String toString(){
        return this.getName() + "; " + this.getTitle() + "; " + project;
    }
}
