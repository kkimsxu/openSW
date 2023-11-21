package _03.Helloworld;

public class Controller {
    public void control(Model m, View v) {
        v.show(m.createGreetings());
        v.showSwing(m.createGreetings());
    }
}
