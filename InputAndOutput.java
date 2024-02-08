import java.io.*;
public class InputAndOutput{
    static void CreateFile(String fileName)throws IOException{
        File newFile = new File(fileName);
	    if(newFile.createNewFile()){
		System.out.println("File Created");
            }else if(newFile.exists())
	        System.out.println("File already exists!!");
	    else
		System.out.println("Error in File Creation");
    }
    
    public static void main(String args[]){
    	try{
	    CreateFile("Output.txt");
	    BufferedWriter bw = new BufferedWriter(new FileWriter("Output.txt"));
	    for(int i = 0;i< args.length;i++){
                bw.write(args[i]+" ");
            }
            System.out.println("File written");
            bw.close();
    	}catch(IOException e){
    	    e.printStackTrace();
    	}
    }
}
