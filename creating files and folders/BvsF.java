// differences between FileWriter and BUfferedWriter
//Both FileWriter and BufferedWriter are useful for character based file operations

/*FileWriter is a subclass of writer. However , it doesn't provide buffering by itself. which means
everytime we write a character or a string using 'FileWriter', it directly results in an I/O 
operation. this can be less efficient for large amounts of data.*/

try(FileWriter writer = new FileWriter("sampleText.txt")) {
    writer.write("Hello I am a guitarist!");   
} catch (IOException e){
    e.printStackTrace();
}

/*When we wrap a BufferedWriter around a 'Writer, it adds a buffer to the output
stream, this enables to accumulate data before writing in the underlying file. this can 
help improving perfomance and maintain atomicity.*/ 

try (BufferedWriter writer = new BufferedWriter(new FileWriter("sampleText.txt"))) {
    writer.write("Sample Text!");
} catch (IOException e) {
    e.printStackTrace();
}