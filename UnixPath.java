package goit.task3_1;


import java.nio.file.Path;
import java.nio.file.Paths;

public class UnixPath {
    public String simplify(String input) {
        Path fullPath = Paths.get(input);
        Path simlePath = fullPath.normalize();
        return simlePath.toString();
    }
}
