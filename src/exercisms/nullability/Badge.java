package exercisms.nullability;

public class Badge {

    public static void main(String[] args) {

        Badge badge = new Badge();

        System.out.println(badge.print(1,"joao", "faturamento"));
        System.out.println(badge.print(null,"joao", "faturamento"));
        System.out.println(badge.print(1,null, "faturamento"));
        System.out.println(badge.print(1,"joao", null));
        System.out.println(badge.print(null,"joao", null));

    }


    public String print(Integer id, String name, String department) {

        if (department != null && id == null) {
            return name + " - " + department.toUpperCase();
        } else if ( name == null){
            return "[" + id + "] - " + department.toUpperCase();
        } else if (department == null && id != null ){
            return "[" + id + "] - " + name + " - OWNER";
        } else if (department == null && id == null ){
            return name + " - OWNER";
        } else {
            return "[" + id + "] - " + name + " - " + department.toUpperCase();
        }
    }
    /*

    class Badge {
    public String print(Integer id, String name, String department) {
        return String.format("%s%s - %s",
                id != null ? String.format("[%d] - ", id) : "",
                name,
                department != null ? department.toUpperCase() : "OWNER");
    }
}
     */

 }
