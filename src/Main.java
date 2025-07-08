
class Movie{

    String m_name;
    String m_DirectorName;

    Movie(){
        this("Unknown","Unknown");
    }

    Movie(String m_name,String m_DirectorName){
        this.m_name = m_name;
        this.m_DirectorName = m_DirectorName;
    }

    void display(){
        System.out.println("Movie Name - "+m_name+",  Movie Director - "+m_DirectorName);
    }

}

public class Main{
    public static void main(String[] args) {
        Movie m1 = new Movie();
        Movie m2 = new Movie("V_Vedant-The Real Racer ","the great Yatesh");
        m1.display();
        m2.display();
    }
}
