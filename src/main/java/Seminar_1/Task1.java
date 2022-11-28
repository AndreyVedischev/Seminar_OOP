package Seminar_1;

public class Task1 {
    public static void main(String[] args) {
        People people2 = new People("Алёна", "жен");
        People people3 = new People("Евгений","муж");
        People people1 = new People("Костя", people2, people3, "муж");
        Research1 a = new Research1();

        System.out.println(a.getMother(people1));
    }
}

class People {
    private String name;
    private String sex;
    private People mother;
    private People father;
    public People (String name, People mother, People father, String sex) {
        this.name = name;
        this.mother = mother;
        this.father = father;
        this.sex = sex;
    }
    public People (String name, String sex) {
        this(name, null, null, sex);
    }
    public String getName() {
        return this.name;
    }
    public String getParents() {
        return String.format("Ребенок - %s, Мама - %s, Папа - %s", this.name, this.mother.name, this.father.name);
    }
}
class Research1 {
    public String getMother(People obj) {
        return obj.getParents();
    }
}