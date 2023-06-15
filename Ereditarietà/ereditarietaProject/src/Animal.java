public abstract class Animal implements NoiseMaker {
    private String name;
    private int age;
    private String paeseOrigine;
    private String verso;


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

    public String getPaeseOrigine() {
        return paeseOrigine;
    }

    public void setPaeseOrigine(String paeseOrigine) {
        this.paeseOrigine = paeseOrigine;
    }

    public String getVerso() {
        return verso;
    }

    public void setVerso(String verso) {
        this.verso = verso;
    }
}
