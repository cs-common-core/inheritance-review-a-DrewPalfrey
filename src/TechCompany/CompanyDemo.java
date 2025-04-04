package TechCompany;

public class CompanyDemo {

    public static void main(String[] args) {
        Employee jake = new Developer("Jake", "Developer", "Flappy Bird");
        String[] johnProjects = {"Flappy Bird", "Geometry Dash", "Tetris"};
        Employee john = new Manager("John", "Manager", johnProjects, 180);

        jake.work();
        john.work();
        System.out.println(jake);
        System.out.println(john);
    }
}
