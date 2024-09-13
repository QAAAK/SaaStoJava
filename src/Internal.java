import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.ArrayList;
import java.util.HashSet;

class Internal {

    private static HashSet<String> pathDirectoryFiles = new HashSet<>();

    protected static String createDir(String nameDirectory) throws FileSystemException {
        /**
        Create a directory
        @param nameDirectory 
        @return The result of the execution
        @author santalovdv@mts.ru
        */

        try {

            File newDir = new File(nameDirectory); // надо будет решить, где будет лежать,
            // скорее всего, /data/SaaS

            if (newDir.exists()) {

                deleteDir(newDir);
            }

            newDir.mkdir();

        } catch (FileSystemException e) {
            throw new FileSystemException("No such file or directory");
        }

        return "Completed method";
    }

    protected static String deleteDir(File dir) throws FileSystemException {
        /**
        Delete a directory
        @param dir 
        @return The result of the execution
        @author santalovdv@mts.ru
        */

        dir.delete();

        return "Deleted";

    }

    private static boolean isPathDirectory(String path) {
        /**
        Сhecking the existence of a directory
        @param path to directory 
        @return boolean 
        @author santalovdv@mts.ru
        */

        return pathDirectoryFiles.equals(path);

    }

    protected static String mappingFiles(ArrayList<String> fileNames) throws FileSystemException, ArrayStoreException {
        /**
       The main method that checks and creates directories based on files
        @param fileNames 
        @return The result of the execution
        @author santalovdv@mts.ru
        */

        String rootDirectory = "C:/Users/santalovdv/Desktop/hello/";
        String targetDirectory = "C:/Users/santalovdv/Desktop/";

        String root;
        String target;

        for (String file: fileNames) {

            root = rootDirectory + file;
            target = targetDirectory + removeTheExtension(file);

            if (isActiveModify(root) == false) {

                continue;
            }

            try {

                if (isPathDirectory(target) == false) {

                    createDir(target);

                    pathDirectoryFiles.add(target);

                }

            } catch (ArrayStoreException e) {
                throw new ArrayStoreException("Error compile hash from Array");
            }
        }

        return "Mapping completed";
    }

    public static void getSuchDirectory() throws ArrayStoreException {
        /**
        Getter this.HashSet
        @param  
        @return The result of the execution
        @author santalovdv@mts.ru
        */

        try {

            if (pathDirectoryFiles.isEmpty()) {
                for (int i = 0; i < pathDirectoryFiles.size(); i++) {
                    System.out.println(pathDirectoryFiles.toString());
                }
            }

        } catch (ArrayStoreException e) {

            throw new ArrayStoreException("Error compile hash from Array");

        }

    }

    private static long lastModify(String pathFile) {
        /**
        The last modification of the file
        @param path to directory 
        @return long
        @author santalovdv@mts.ru
        */

        File file = new File(pathFile);

        long longToDate = file.lastModified();

        return longToDate;

    }

    protected static boolean isActiveModify(String pathFile) {
        /**
        Has the file been updated recently
        @param path to directory 
        @return boolean
        @author santalovdv@mts.ru
        */

        long currentTime = System.currentTimeMillis();
        boolean isModify = false;

        if (currentTime - lastModify(pathFile) <= 129600000 || lastModify(pathFile) == 0) { // 36 hour
            isModify = true;

            return isModify;

        }

        return isModify;

    }

    private static String removeTheExtension(String file) {
        /**
        Replace file name
        @param path to directory 
        @return String
        @author santalovdv@mts.ru
        */

        return file.substring(0, file.indexOf('.'));

    }

    protected static ArrayList<String> filesList(String path) {
        /**
        Get the file name
        @param path to directory 
        @return ArrayList
        @author santalovdv@mts.ru
        */

        File filePath = new File(path);
        String[] fileLists = filePath.list();

        ArrayList<String> array = new ArrayList<String>();

        for (String file: fileLists) {

            array.add(removeTheExtension(file));
        }

        return array;
    }

}

    //    class Main {
//
//    public static void main(String[] args) throws IOException {
////
//////        ArrayList<String> test = new ArrayList<String>();
//////        ExcelMethods.CreateFile("C:/Users/santalovdv/Desktop/CVM_all.xlsx", "C:/Users/santalovdv/Desktop/testFile.csv");
//////        test.add("test1.xlsx");
//////        test.add("test2.xlsx");
//////        test.add("cvm_itog_dashboard.sql");
//
////    }
////}
////
