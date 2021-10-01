import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Cris");
        list.add("Carlos");
        list.add("Tina");
        list.add("Luis");
        list.add("Kattya");
        list.add(4,"Bolota");

        list.removeIf( x -> x.charAt(0) == 'C');
        list.add(0,"Cozzolindo");
        list.add("Cristina");

        System.out.println(list.size());
        for(String name : list){
            System.out.println(name);
        }

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
        
        for(String name : result){
            System.out.println(name);
        }
    }
}