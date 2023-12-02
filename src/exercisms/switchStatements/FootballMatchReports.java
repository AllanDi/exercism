package exercisms.switchStatements;

public class FootballMatchReports {

    public static void main(String[] args) {

        FootballMatchReports footballMatchReports = new FootballMatchReports();
        System.out.println(FootballMatchReports.onField(1));
        System.out.println(FootballMatchReports.onField(13));
    }

    public static String onField(int shirtNum) {
        String result;

        switch (shirtNum) {
            case 1:
                result ="goalie";
                break;
            case 2:
                result ="left back";
                break;
            case 3:
            case 4:
                result ="center back";
                break;
            case 5:
                result ="right back";
                break;
            case 6:
            case 7:
            case 8:
                result ="midfielder";
                break;
            case 9:
                result ="left wing";
                break;
            case 10:
                result ="striker";
                break;
            case 11:
                result ="right wing";
                break;
            default:
                throw new IllegalArgumentException("Invalid number");
        }
        return result;
    }

    /*

    public class FootballMatchReports {
    public static String onField(int shirtNum) {
        switch (shirtNum) {
            case 1:
                return "goalie";
            case 2:
                return "left back";
            case 3: case 4:
                return "center back";
            case 5:
                return "right back";
            case 6: case 7: case 8:
                return "midfielder";
            case 9:
                return "left wing";
            case 10:
                return "striker";
            case 11:
                return "right wing";
            default:
                throw new IllegalArgumentException();
        }
    }
}

     */
}
