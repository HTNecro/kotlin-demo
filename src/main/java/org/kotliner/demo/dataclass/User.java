package org.kotliner.demo.dataclass;

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
public class User {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{name=" + name + ", age=" + age + "}";
    }

    public static void main(String[] args) {
        User user = new User();
        user.setName("Haitao");
        user.setAge(18);
        System.out.println("Current User is " + user);
        System.out.println("Current User age is " + user.getAge());
    }
}
