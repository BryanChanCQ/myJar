package cn.bryanchan;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

import com.google.common.collect.Lists;

public class Main {
    public static void main(String[] args) throws IOException {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return args[0];
            }
        };
        List<String> list = Lists.newArrayList();
        String s = supplier.get();
        System.out.println("------------------:" + s);
    }
}
