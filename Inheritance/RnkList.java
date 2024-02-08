import java.io.*;
import java.util.*;
class Student{
    double SGPA;
    String name;
    Student(String name,double SGPA){
        this.name = name;
        this.SGPA = SGPA;
    }
}
class RankList{
    public static void main(String args[]){
        if(args.length!=1){
            System.out.println("Invalid ppd kaanikkalle !!!");
            return ;
        }
        ArrayList<Student> Students = new ArrayList<>();
        try{
            String output = args[0];
            System.out.println("Enter the sgpa of students : ");
            BufferedReader reader = new BufferedReader(new FileReader(output));
            String line;
            while((line=reader.readLine())!=null){
                String [] parts = line.split(",");
                String name = parts[0].trim();
                double SGPA = Double.parseDouble(parts[1].trim());
                Students.add(new Student(name,SGPA));
            }
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        Student BestStudent = findBestStudent(Students);
        System.out.println("The BestStudent is : "+BestStudent.name+"with SGPA "+BestStudent.SGPA);
        System.gc();
        SaveRankList(Students);
    }
    static Student findBestStudent(ArrayList<Student> Students){
        Student BestStudent = null;
        Double MaxCGPA = Double.MIN_VALUE;
        for(Student student:Students){
            if(student.SGPA>MaxCGPA){
                BestStudent = student;
                MaxCGPA = student.SGPA;
            }
        }
        return BestStudent ;
    }
    static void SaveRankList(ArrayList<Student> Students){
        try{
            String output = "ranklist.txt";
            FileWriter writer = new FileWriter(output);
            for(Student student : Students){
                writer.write(student.name+","+student.SGPA+"\n");
            }
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
