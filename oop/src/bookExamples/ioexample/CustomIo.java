package bookExamples.ioexample;

import java.io.*;

public class CustomIo  {
    private static FileReader fileReader;
    private static FileWriter fileWriter = null;
    public static void main (String [] arg) throws IOException {

       // long [] fibonacciNumbers = fibonacciNumbers();
       // printSequence(fibonacciNumbers);

        File inputFile = new File("InputFile.txt");
        File outputFile = new File("OutputFile.txt");

        BufferedReader bufferedReader = new BufferedReader (new FileReader(inputFile));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));

//        String line = bufferedReader.readLine();
//        while (line != null) {
//            bufferedWriter.write(line);
//            bufferedWriter.newLine();
//            line = bufferedReader.readLine();
//        }

       while (bufferedReader.readLine()!=null){
           bufferedWriter.write(bufferedReader.readLine());
       }
        //bufferedWriter.write(bufferedReader.read());
        bufferedReader.close();
        bufferedWriter.close();

    }


    private static long [] fibonacciNumbers(){
        long [] fibNumbers = new long[50];
        fibNumbers [0] = 0;
        fibNumbers [1] = 1;

        for (int i = 2; i <fibNumbers.length ; i++) {
            fibNumbers[i] = fibNumbers[i-1] + fibNumbers[i-2];
        }
          return fibNumbers;
        }

    private static void printSequence(long [] fibonacciNumbers) throws IOException {
        fileWriter = new FileWriter("out.txt",false);
        for (long numbers:fibonacciNumbers) {

                fileWriter.write(String.valueOf(numbers)+"\r\n");
        }
                fileWriter.close();
    }
    }

