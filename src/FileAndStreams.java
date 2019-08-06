import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileAndStreams {
    public static String readFileContents(Path path) throws IOException {
        return Files.readString(path, StandardCharsets.US_ASCII);
    }
    public static void usingBufferedWritter(String toAppend, String path) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        writer.newLine();
        writer.write(toAppend);
        writer.close();
    }
    public static String inputStreamToString(InputStream inputStream, Charset charset) throws IOException {
        try (Scanner scanner = new Scanner(inputStream, charset.name())) {
            return scanner.useDelimiter("\\A").next();
        }
    }
    public static String outPutStreamToString(ByteArrayOutputStream stream){
        return new String(stream.toByteArray());
    }
    public static void byteArrayToFile(byte[] bytesArray, String path) {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(bytesArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static byte[] fileToByteArray(String path) throws IOException {
        File file = new File(path);
        byte[] bytesArray = new byte[(int) file.length()];
        FileInputStream fis = new FileInputStream(file);
        fis.read(bytesArray);
        fis.close();
        return bytesArray;
    }
}
