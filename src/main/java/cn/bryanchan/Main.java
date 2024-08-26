package cn.bryanchan;

import java.io.IOException;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws IOException {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return args[0];
            }
        };
        String s = supplier.get();
        System.out.println("------------------:" + s);
    }
}
