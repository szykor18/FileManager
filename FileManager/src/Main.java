public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        fileManager.listFilesInDirectory("C:\\Users\\Szymon\\Documents\\FileManager examples");
        System.out.println();
        System.out.println("------------------------------------------------------------------");
        System.out.println();
        fileManager.listFoldersInDirectory("C:\\Users\\Szymon\\Documents\\FileManager examples");
        System.out.println();
        System.out.println("------------------------------------------------------------------");
        System.out.println();
        fileManager.listSortedFiles("C:\\Users\\Szymon\\Documents\\FileManager examples");
        System.out.println();
        System.out.println("------------------------------------------------------------------");
        System.out.println();
        fileManager.listSortedFolders("C:\\Users\\Szymon\\Documents\\FileManager examples");
    }
}