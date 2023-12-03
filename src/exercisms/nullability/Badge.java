package exercisms.nullability;

public class Badge {
    public String print(Integer id, String name, String department) {

        if (id == null) {
            return name + " - " + department.toUpperCase();
        } else if ( name == null){
            return "[" + id + "] - " + department.toUpperCase();
        } else if (department == null){
            return "[" + id + "] - " + name;
        } else {
            return "[" + id + "] - " + name + " - " + department.toUpperCase();
        }
    }

 }
