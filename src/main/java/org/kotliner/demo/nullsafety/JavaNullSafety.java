package org.kotliner.demo.nullsafety;

import java.util.Optional;

public class JavaNullSafety {

    public static String getNullableString() { return null; }

    public static String getNotNullString() { return "Hello, Kotlin"; }

    public static void main(String[] args) {
        String result = getNullableString();
        System.out.println(result.length());

        Optional<String> nullable = Optional.ofNullable(getNullableString());

        if (nullable.isPresent()) {
            result = nullable.get();
            System.out.println(result.length());
        }
        nullable.ifPresent(value -> System.out.println(value.length()));
        nullable.orElseGet(JavaNullSafety::getNotNullString);

        result = nullable.orElse("Hello, Kotlin");
        System.out.println(result.length());

        result = nullable.orElseThrow(IllegalStateException::new);
        System.out.println(result.length());
    }

}
