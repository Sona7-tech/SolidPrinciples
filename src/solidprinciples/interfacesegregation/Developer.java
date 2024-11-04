package solidprinciples.interfacesegregation;

public class Developer implements Eatable, Workable{
    @Override
    public void eat() {
        System.out.println("Eating...");
    }
    @Override
    public void work() {
       System.out.println("Working...");
    }
}
