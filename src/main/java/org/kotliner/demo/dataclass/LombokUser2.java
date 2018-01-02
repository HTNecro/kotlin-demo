package org.kotliner.demo.dataclass;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
@Getter
@ToString
@Builder
public class LombokUser2 {

    private String name;
    private Integer age;

    public static void main(String[] args) {
        LombokUser2 user = LombokUser2.builder().name("Haitao").age(18).build();
        System.out.println(user);
        System.out.println("Current User age is " + user.getAge());
    }
}
