package symbolIOStream;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "task4/src/main/java/symbolIOStream/SampleText.txt";
        String outputFilePath = "task4/src/main/java/symbolIOStream/Outputfile.txt";

        Stream stream = new Stream(inputFilePath, outputFilePath);

        stream.write(outputFilePath);
    }
}