import java.util.function.Predicate;

public class mypredicate {
    public static void main(String[] args) {
        Predicate<String> p = x -> x.toLowerCase().charAt(0) == 's';
        Predicate<String> s = x -> x.toLowerCase().charAt(x.length()-1) == 'i';
        Predicate m = p.or(s);
        Predicate pr = Predicate.isEqual("Sans");
        System.out.println(pr.test("Sans"));
        }

    }
