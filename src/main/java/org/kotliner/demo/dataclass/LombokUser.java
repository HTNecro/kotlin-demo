package org.kotliner.demo.dataclass;

import lombok.Data;

@Data
public class LombokUser {

    private String name;

    private Integer age;

    public static void main(String[] args) {
        LombokUser user = new LombokUser();
        user.setName("Haitao");
        user.setAge(18);
        System.out.println(user);
        System.out.println("Current User age is " + user.getAge());
    }
}
