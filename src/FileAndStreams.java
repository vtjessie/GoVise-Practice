/**
 * imports
 */

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @author vtjessie
 */
public class FileAndStreams {
    /**
     * read the contents of a file into a string variable
     * @param path the given path
     * @return the string of the contents
     * @throws IOException
     */
    public static String readFileContents(Path path) throws IOException {
        return Files.readString(path, StandardCharsets.US_ASCII);
    }

    /**
     * Appending a string to a file
     * @param toAppend the string to append
     * @param path the path of the file to append
     * @throws IOException
     */
    public static void writeIntoAFile(String toAppend, String path) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        writer.newLine();
        writer.write(toAppend);
        writer.close();
    }

    /**
     * convert an inputstream into a string
     * @param inputStream the given input stream
     * @param charset the charset decode
     * @return the string rep
     * @throws IOException
     */
    public static String inputStreamToString(InputStream inputStream, Charset charset) throws IOException {
        try (Scanner scanner = new Scanner(inputStream, charset.name())) {
            return scanner.useDelimiter("\\A").next();
        }
    }

    /**
     * convert outputstream to a string
     * @param stream the output stream
     * @return the string rep
     */
    public static String outPutStreamToString(ByteArrayOutputStream stream){
        return new String(stream.toByteArray());
    }

    /**
     * put the contents of a bytearray into a file
     * @param bytesArray the given bytearray
     * @param path the given path to file
     */
    public static void byteArrayToFile(byte[] bytesArray, String path) {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(bytesArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * convert file to bytearray
     * @param path the path of file
     * @return the bytearray
     * @throws IOException
     */
    public static byte[] fileToByteArray(String path) throws IOException {
        File file = new File(path);
        byte[] bytesArray = new byte[(int) file.length()];
        FileInputStream fis = new FileInputStream(file);
        fis.read(bytesArray);
        fis.close();
        return bytesArray;
    }
}
