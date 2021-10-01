public class Main{
    public static void main(String[] args) {
        String[] string = new String[] {"Cris", "Carlos", "Tina"};

        for(int i =0; i<string.length; i++){
            System.out.println(string[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        for(String obj : string){
            System.out.println(obj);
        }
    }
}