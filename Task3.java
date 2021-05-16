public class Task3 {
    public static void main(String[] args) {        
        int situation;
        for (int i=25; i<=250; i++) {            
            situation = (i%7==0) ? 1 : 0;
            situation = (i%5==0) ? situation += 2 : situation;                        
            switch (situation){
                case 1:  System.out.println("Tip");break;
                case 2:  System.out.println("Top");break;
                case 3:  System.out.println("TipTop");break;               
                default: System.out.println(i);
            }                        
        }
    }
}
