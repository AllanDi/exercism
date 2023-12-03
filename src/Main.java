import exercisms.nullability.Badge;

public class Main {
    public static void main(String[] args) {

        Badge badge = new Badge();

        System.out.println(badge.print(1,"joao", "faturamento"));
        System.out.println(badge.print(null,"joao", "faturamento"));
        System.out.println(badge.print(1,null, "faturamento"));
        System.out.println(badge.print(1,"joao", null));
        System.out.println(badge.print(null,"joao", null));


    }
}