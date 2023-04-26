package exam.Practise;

public class ForEachArrays {
    public static void main(String[] args) {

        String[][] movie = {
            {"FightClub", "Shawshank", "Memento"},
            {"MI", "FnF", "WrongTurn"},
            {"DCU", "MCU", "JWU"}
        };

        for (String[] row : movie) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

	
