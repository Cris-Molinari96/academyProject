public class Studente {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void checkAge(Studente x) throws MyThirdException{
        if(x.getAge() < 18){
            throw new MyThirdException("Non hai ancora fatto i tuoi fottutissimi 18 anni");
        }
    }
}
