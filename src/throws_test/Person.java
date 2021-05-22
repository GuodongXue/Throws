package throws_test;
//子类异常类型《=父类异常类型
public class Person {
    public void eat() throws Exception{
        System.out.println("111111");
    }
}
class Student extends Person{
    @Override
    public void eat() throws RuntimeException {
        System.out.println("111111");
    }
}