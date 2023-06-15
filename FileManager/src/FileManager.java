import java.io.File;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class FileManager {
    public void listFilesInDirectory(String directory) {
        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
                .filter(File::isFile)
                .map(File::getName)
                .forEach(System.out::println);
    }
    public void listFoldersInDirectory(String directory) {
        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
                .filter(File::isDirectory)
                .map(File::getName)
                .forEach(System.out::println);
    }
    public void listEverythingInDirectory(String directory) {
        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
                .map(File::getName)
                .forEach(System.out::println);
    }
    public void listSortedFiles(String directory) {
        // you can sort files in many ways, I sort based on file's weight
        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
                .filter(File::isFile)

                .sorted((x1, x2) -> Long.compare(x2.length(), x1.length()))
                .forEach(file -> {
                    System.out.println(file.getName());
                    System.out.println(file.length());
                    System.out.println();
                });    }
    public void listSortedFolders(String directory) {
        // you can sort files in many ways, I sort based on file's weight
        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
                .filter(File::isDirectory)
                .sorted((x1,x2) -> Long.compare(x2.length(),x1.length()))
                .forEach(file -> {
                    System.out.println(file.getName());
                    System.out.println(file.length());
                    System.out.println();
                });
    }
    public void listSortedEverything(String directory) {
        // you can sort files in many ways, I sort based on file's weight
        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))

                .sorted((x1, x2) -> Long.compare(x2.length(), x1.length()))
                .forEach(file -> {
                    System.out.println(file.getName());
                    System.out.println(file.length());
                    System.out.println();
                });
    }
}
