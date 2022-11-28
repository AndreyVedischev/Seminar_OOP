package Seminar_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {

        var irina = new Person("Ирина");

        var vasya = new Person("Вася");
        var masha = new Person("Женя");
        var jane = new Person("Маша");
        var ivan = new Person("Ваня");

        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);

        System.out.println(
                new Research(gt).spend(irina, Relationship.parent));

    }
}

// #region
// class Relationship {
// public static int parent = 1;
// public static int children = 2;
// }
// #endregion

enum Relationship {
    parent,
    children
}

interface Human {
    String getFullName();
}

class Person implements Human {

    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return getFullName();
    }
}

class Node {

    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    Person p1;
    Relationship re;
    Person p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }
}

interface Tree {
    void append(Person parent, Person children);

    ArrayList<Node> getData();
}

class GeoTree implements Tree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getData() {
        return tree;
    }

    public void append(Person parent, Person children) {

        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }
}

class Research {
    ArrayList<Node> tree;

    public Research(Tree pd) {
        tree = pd.getData();
    }

    public ArrayList<Person> spend(Human p, Relationship re) {

        var result = new ArrayList<Person>();

        // tree.forEach((t) -> {
        // if (t.p1.fullName == p.fullName
        // && t.re == re) {
        // result.add(t.p2);
        // }
        // });

        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName()
                    && t.re == re) {
                result.add(t.p2);
            }
        }

        return result;
    }
}

class Printer {
    //
}