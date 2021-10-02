import java.text.ParseException;
import java.text.SimpleDateFormat;

import Classes.Comment;
import Classes.Post;

public class Main{
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("WOOOOOOOOOOOOOW, that's so cool.");
        Post p1 = new Post(stf.parse("21/06/2018 13:05:44"), "Traveling to Rio de Janeiro", "I'm going to Brazil!", 1200);
        Comment c3 = new Comment("Oopsie, good luck champ.");
        Comment c4 = new Comment("OOOOOOOOOOOOOOOOOOOOh, that's hot.");

        p1.addComment(c1);
        p1.addComment(c2);
        p1.addComment(c3);
        p1.addComment(c4);

        System.out.println(p1);
    }
}