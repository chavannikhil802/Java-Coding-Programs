import java.io.*;

class CricketPlayer {

    String player_name;
    int no_of_innings;
    int no_times_not_out;
    int total_runs;
    float bat_avg;

    CricketPlayer() {
        System.out.println("Please Enter valid Player Details");
    }

    CricketPlayer(String name, int innings, int not_out, int runs) {
        this.player_name = name;
        this.no_of_innings = innings;
        this.no_times_not_out = not_out;
        this.total_runs = runs;
        this.bat_avg = average(this.total_runs, this.no_of_innings);
    }

    static float average(int runs, int innings) {
        return runs / innings;
    }

    float getAverage() {
        return this.bat_avg;
    }

    static void sortPlayer(CricketPlayer[] player) {
        CricketPlayer temp;

        for(int i=0; i<player.length; i++) {
            for(int j=i+1; j<player.length; j++) {
                if(player[i].getAverage() > player[j].getAverage()) {
                    temp = player[i];
                    player[i] = player[j];
                    player[j] = temp;
                }
            }
        }

        System.out.println("========CRICKET PLAYERS AFTER SORTING THEM ON THE BASIS OF AVERAGE========");
        System.out.println();
        for(int i=0; i<player.length; i++) {
            System.out.println(player[i]);
            System.out.println();
        }
    }

    public String toString() {
        return "Player Name : " + player_name + "\nNumber of Innings : " + no_of_innings
                + "\nNumber of Times Not Out : " + no_times_not_out + "\nTotal Runs : " + total_runs
                + "\nBatting Average : " + bat_avg;
    }
}

class Program2 {
    public static void main(String[] args) {

        int count = 0, innings, notout, runs;
        String name;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the Number of Players : ");
            count = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        CricketPlayer player[] = new CricketPlayer[count];

        for (int i = 0; i < player.length; i++) {
            try {
                System.out.print("Enter Player " + (i + 1) + "'s name : ");
                name = br.readLine();
                System.out.print("Enter Player " + (i + 1) + "'s Number of Innings : ");
                innings = Integer.parseInt(br.readLine());
                System.out.print("Enter Player " + (i + 1) + "'s Number of Times Not Out : ");
                notout = Integer.parseInt(br.readLine());
                System.out.print("Enter Player " + (i + 1) + "'s Total Runs : ");
                runs = Integer.parseInt(br.readLine());
                System.out.println();

                player[i] = new CricketPlayer(name, innings, notout, runs);

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println("========CRICKET PLAYERS BEFORE SORTING THEM ON THE BASIS OF AVERAGE========\n");
        for(int i = 0; i < player.length; i++) {
            System.out.println(player[i]);
            System.out.println();
        }

        CricketPlayer.sortPlayer(player);
    }
}

/* 
OUTPUT:-

PS D:\Java-Coding\Java-Programs\Assignment-2\Set-A-additional> java Program2
Enter the Number of Players : 3
Enter Player 1's name : NIKHIL CHAVAN
Enter Player 1's Number of Innings : 100
Enter Player 1's Number of Times Not Out : 100
Enter Player 1's Total Runs : 33333

Enter Player 2's name : RISHIKSH BHUJBAL
Enter Player 2's Number of Innings : 100
Enter Player 2's Number of Times Not Out : 100
Enter Player 2's Total Runs : 22222

Enter Player 3's name : KAUTUK BHATTAD
Enter Player 3's Number of Innings : 100
Enter Player 3's Number of Times Not Out : 100
Enter Player 3's Total Runs : 11111

========CRICKET PLAYERS BEFORE SORTING THEM ON THE BASIS OF AVERAGE========

Player Name : NIKHIL CHAVAN
Number of Innings : 100
Number of Times Not Out : 100
Total Runs : 33333
Batting Average : 333.0

Player Name : RISHIKSH BHUJBAL
Number of Innings : 100
Number of Times Not Out : 100
Total Runs : 22222
Batting Average : 222.0

Player Name : KAUTUK BHATTAD
Number of Innings : 100
Number of Times Not Out : 100
Total Runs : 11111
Batting Average : 111.0

========CRICKET PLAYERS AFTER SORTING THEM ON THE BASIS OF AVERAGE========

Player Name : KAUTUK BHATTAD
Number of Innings : 100
Number of Times Not Out : 100
Total Runs : 11111
Batting Average : 111.0

Player Name : RISHIKSH BHUJBAL
Number of Innings : 100
Number of Times Not Out : 100
Total Runs : 22222
Batting Average : 222.0

Player Name : NIKHIL CHAVAN
Number of Innings : 100
Number of Times Not Out : 100
Total Runs : 33333
Batting Average : 333.0

*/
