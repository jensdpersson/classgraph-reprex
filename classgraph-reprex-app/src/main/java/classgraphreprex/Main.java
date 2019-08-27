package classgraphreprex;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;

public class Main {
    public static void main(String[] argv) {
        try (ScanResult scanResult = new ClassGraph().whitelistPackages("classgraphreprex").verbose().scan()) {
            scanResult.getSubclasses(Superclass.class.getCanonicalName())
                .forEach(ci -> {
                    System.out.println("Found class" + ci.getSimpleName());
                    });
        }       
    }
}