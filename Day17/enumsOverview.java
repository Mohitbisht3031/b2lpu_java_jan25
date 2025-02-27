package Day17;

public class enumsOverview {
    enum Days{
        Monday("mohit"),Tuesday;
        private String v;
        private Days(String v){
            this.v = v;
        }
        private Days(){}
        public String getVal(){
            return this.v;
        }
    }
    public static void main(String args[]){
        Days e = Days.Monday;
        Integer i = 10; // auto boxing
        int i2 = i;
        String s = "Mohit";
        String s2 = new String("Mohit");
        if(s.equalIgnoreCase(s2))System.out.println("same");
        else System.out.println("not same");
    }
}
