package DZ_1.tree;


public class Program {
    public static void main(String[] args) {
        var irina = new Person("Ирина");
        var vasya = new Person("Вася");
        var masha = new Person("Маша");
        var jane = new Person("Женя");
        var ivan = new Person("Ваня");

        FamilyTree ft = new FamilyTree();
        ft.addNode(irina, FamilyTree.Type.wife, vasya);
        ft.addNode(masha, FamilyTree.Type.daughter, vasya);
        ft.addNode(jane, FamilyTree.Type.daughter, vasya);
        ft.addNode(ivan, FamilyTree.Type.son, vasya);

        Research children = new Research(ft);
        System.out.println(Printer.people(children.findAll(vasya, FamilyTree.Type.son)));
        System.out.println(Printer.people(children.findAll(vasya, FamilyTree.Type.daughter)));
    }
}
