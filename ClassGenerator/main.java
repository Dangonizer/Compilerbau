import java.nio.file.Files;
import java.nio.file.Paths;

class Main {
    public static void main(String[] args) {
        JavaClassFileGenerator fg = new JavaClassFileGenerator("faculty", true, true, true);
        String code = "";
        try {
            code = Files.readString(Paths.get("bytecode.txt"));
        } catch (Exception e) {
            System.out.println("File not found");
        }
        fg.generateClassFile(new MethodObject("main", 0, code));

    }
}
