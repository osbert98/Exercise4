package Exercise4;

abstract class mark{
	
    abstract void getPercentage();
    
}
class A extends mark{
	
    double percentage=0, mark1, mark2, mark3;
    
    A (double m1, double m2, double m3)
    {
        this.mark1=m1;
        this.mark2=m2;
        this.mark3=m3;
    }
    
    void getPercentage(){
        percentage = (mark1+mark2+mark3)/300*100;
        System.out.println("Percentage class A: "+percentage+"%");
    }
}
class B extends mark{
    double percentage=0, mark1, mark2, mark3, mark4;
    
    B (double m1, double m2, double m3, double m4) 
    {
        this.mark1=m1;
        this.mark2=m2;
        this.mark3=m3;
        this.mark4=m4;
    }
    
   
    void getPercentage()
    
    {
        percentage = (mark1+mark2+mark3+mark4)/400*100;
        System.out.println("Percentage class B: "+percentage+"%");
    }
}

public class Question3{
	
	
    public static void main(String[] args) {
        
        A a = new A(75,80,85);
        B b = new B(77,66,88,79);
        
        a.getPercentage();
        b.getPercentage();
        
        
    }
}
