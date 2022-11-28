
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String file, teamName, line;
        String[] lineParts = new String[4];
        
        String home, away;
        int homeScore, awayScore, wins = 0, losses = 0;
        
        
        //get file name
        System.out.println("File: ");
        file = scan.nextLine();
        
        
        //get team name
        System.out.println("Team: ");
        teamName = scan.nextLine();
        
        
        //open file
        try(Scanner reader = new Scanner(Paths.get(file))){
            
            //go through file
            while(reader.hasNextLine()){
                line = reader.nextLine();
                
                
                //check if line contains target team
                if(line.contains(teamName)){
                    
                    //split
                    lineParts = line.split(",");
                    home = lineParts[0];
                    away = lineParts[1];
                    homeScore = Integer.valueOf(lineParts[2]);
                    awayScore = Integer.valueOf(lineParts[3]);
                    
                    
                    //check if target team is home or away
                    if(home.equals(teamName)){
                        
                        //compare scores and increment wins or losses
                        if(homeScore > awayScore){
                            wins++;
                        } else {
                            losses++;
                        }
                    } else if(away.equals(teamName)){
                        
                        //compare scores and increment wins or losses
                        if(homeScore < awayScore){
                            wins++;
                        } else {
                            losses++;
                        }
                    }
                    
                }
            }
            
            
            //print out wins and losses
            System.out.println("Games: " + (wins + losses));
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //output games played by team
    }

}
