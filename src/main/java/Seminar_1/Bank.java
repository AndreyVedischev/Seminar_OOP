package Seminar_1;


public class Bank {
    static Integer value;
    Integer value1;

    public void setDeposit(Integer value) {
        Bank.value = value;
    }

    void foo() {
        System.out.println("void foo " + value.toString());
    }

    public static void main(String[] args) {
        Bank accVasya = new Bank();
        Bank accMasha = new Bank();

        accVasya.setDeposit(111);
        accVasya.foo();
        accMasha.foo();

        accMasha.setDeposit(333);

        accVasya.foo();
        accMasha.foo();

        // #region
        // ButtonAction foo = new ButtonAction(); //

        // Btn button = new Btn(foo);

        // View form1 = new View(button);
        // form1.click();

        // button.setAction(new NewAction());
        // form1.click();

        // button.setAction(new Hoo());
        // form1.click();

        // button.setAction(new MyAction());
        // form1.click();
        // #endregion

    }
}

// #region

class ButtonAction {
    public void method() {
        System.out.println("ButtonAction.method");
    }
}

class NewAction extends ButtonAction {
    @Override
    public void method() {
        System.out.println("NewAction.method");

    }
}

class Hoo extends ButtonAction {
    @Override
    public void method() {
        System.out.println("Hoo.method");

    }
}

class MyAction extends ButtonAction {
    @Override
    public void method() {
        System.out.println("MyAction.method");

    }
}

class View {
    private Btn btn;

    public void click() {
        btn.click();
    }

    public View(Btn current) {
        btn = current;
    }
}

class Btn {

    public ButtonAction action;

    public Btn(ButtonAction action) {
        this.action = action;
    }

    public void setAction(ButtonAction action) {
        this.action = action;
    }

    public void click() {
        action.method();
    }
}

// #endregion