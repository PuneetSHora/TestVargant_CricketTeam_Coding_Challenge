import java.util.*;

public class CricketTeam_Challenge {
    String name;
    int pts;
    String[] results_of_team;
    String result_type;
    int consecutive;
    CricketTeam_Challenge(String name, int pts, String[] results_of_team, String result_type, int consecutive){
        this.name = name;
        this.pts = pts;
        this.results_of_team = results_of_team;
        this.result_type = result_type;
        this.consecutive = consecutive;
    }
    public int display(){
        String []results = {"loss", "win"};
        String noresult="";
        for(int i=0;i< results.length;i++)
        {
            if(!(results[i].equals(result_type)))
            {
                noresult = results[i];
            }
        }
        int count_consecutive=0;
        //System.out.println(name);
        //System.out.println(result);
        //System.out.println(pts);
        for(int i=0;i<results_of_team.length;i++) {
            if (results_of_team[i].equals(result_type)) {
                count_consecutive = count_consecutive + 1;
                //System.out.print(i+" ");
                //System.out.print(result+" ");
                //System.out.print(ct+" ");
                if(count_consecutive==consecutive)
                {
                    break;
                }
            }
            else if(results_of_team[i].equals(noresult) && count_consecutive>0)
            {
                count_consecutive = count_consecutive - 1;
            }
        }
        if(count_consecutive==consecutive)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String []args) {
        String result_type;
        int consecutive;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type in which you want your teams to be filtered");
        System.out.print("So please enter either loss or win: ");
        result_type = sc.next();
        System.out.print("Now, please enter the number of consecutive losses/wins, means the value of n: ");
        consecutive = sc.nextInt();
        ArrayList<String> Filtered_Teams = new ArrayList<>();
        CricketTeam_Challenge[] teams;
        teams = new CricketTeam_Challenge[10];
        String[] results_of_team1 = {"win", "win", "loss", "loss", "win"};
        teams[0] = new CricketTeam_Challenge("GT", 20, results_of_team1, result_type, consecutive);
        int r = teams[0].display();
        if (r == 1) {
            Filtered_Teams.add(teams[0].name);
        }
        String[] results_of_team2= {"win", "loss", "loss", "win", "win"};
        teams[1] = new CricketTeam_Challenge("LSG", 18, results_of_team2, result_type, consecutive);
        r = teams[1].display();
        if (r == 1) {
            Filtered_Teams.add(teams[1].name);
        }
        String[] results_of_team3 = {"win", "loss", "win", "loss", "loss"};
        teams[2] = new CricketTeam_Challenge("RR", 16, results_of_team3, result_type, consecutive);
        r = teams[2].display();
        if (r == 1) {
            Filtered_Teams.add(teams[2].name);
        }
        String[] results_of_team4 = {"win", "win", "loss", "win", "loss"};
        teams[3] = new CricketTeam_Challenge("DC", 14, results_of_team4, result_type, consecutive);
        r = teams[3].display();
        if (r == 1) {
            Filtered_Teams.add(teams[3].name);
        }
        String[] results_of_team5 = {"loss", "win", "win", "loss", "loss"};
        teams[4] = new CricketTeam_Challenge("RCB", 14, results_of_team5, result_type, consecutive);
        r = teams[4].display();
        if (r == 1) {
            Filtered_Teams.add(teams[4].name);
        }
        String[] results_of_team6 = {"loss", "win", "win", "loss", "win"};
        teams[5] = new CricketTeam_Challenge("KKR", 12, results_of_team6, result_type, consecutive);
        r = teams[5].display();
        if (r == 1) {
            Filtered_Teams.add(teams[5].name);
        }
        String[] results_of_team7 = {"loss", "win", "loss", "win", "loss"};
        teams[6] = new CricketTeam_Challenge("PBKS", 12, results_of_team7, result_type, consecutive);
        r = teams[6].display();
        if (r == 1) {
            Filtered_Teams.add(teams[6].name);
        }
        String[] results_of_team8 = {"win", "loss", "loss", "loss", "loss"};
        teams[7] = new CricketTeam_Challenge("SRH", 12, results_of_team8, result_type, consecutive);
        r = teams[7].display();
        if (r == 1) {
            Filtered_Teams.add(teams[7].name);
        }
        String[] results_of_team9 = {"loss", "loss", "win", "loss", "win"};
        teams[8] = new CricketTeam_Challenge("CSK", 8, results_of_team9, result_type, consecutive);
        r = teams[8].display();
        if (r == 1) {
            Filtered_Teams.add(teams[8].name);
        }
        String[] results_of_team10 = {"loss", "win", "loss", "win", "win"};
        teams[9] = new CricketTeam_Challenge("MI", 6, results_of_team10, result_type, consecutive);
        r = teams[9].display();
        if (r == 1) {
            Filtered_Teams.add(teams[9].name);
        }
        if(Filtered_Teams.size()!=0)
        {
            System.out.print("Filtered teams are: ");
            int j = 0;
            int total = 0;
            for (int i = 0; i < teams.length; i++) {
                if (Filtered_Teams.get(j).equals(teams[i].name)) {
                    if(j!=Filtered_Teams.size()-1)
                    {
                        System.out.print(teams[i].name+"," + " ");
                    }
                    else
                    {
                        System.out.println(teams[i].name);
                    }
                    total = total + teams[i].pts;
                    j++;
                }
                if (j == Filtered_Teams.size()) {
                    i = teams.length;
                }
            }
            //System.out.println(Teams.size());
            //System.out.println(total);
            float len = Filtered_Teams.size();
            float t = total;
            float avg = t / len;
            System.out.println("Average points of these filtered teams = "+avg);
        }
        else {
            System.out.println("No such teams found");
            System.out.println("Average = "+0);
        }
    }
}
