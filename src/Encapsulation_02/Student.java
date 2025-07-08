package Encapsulation_02;

public class Student {
    private String name ;
    private  int TotalMarks ;

    //Setter
    public void  setName(String name){
        this.name = name;
    }
    public void setTotalMarks(int TotalMarks){
        if(TotalMarks >= 0 && TotalMarks <= 100 ) {
            this.TotalMarks = TotalMarks;

        }else System.out.println("Invalid Entry");
    }
    public String getName(){
        return name;
    }

    public  int getTotalMarks(){
        return TotalMarks;
    }

    public boolean isPassed(){
        return TotalMarks >= 35;
    }


}
