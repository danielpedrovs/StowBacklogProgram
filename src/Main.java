import Entities.Dwellings;
import Entities.TimeManagement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = null;
        Scanner sc = new Scanner(System.in);

        int induct = sc.nextInt();
        int stow = sc.nextInt();
        Dwellings dw =new Dwellings();
        dw.CalcDwellings(stow,induct);

        long starTime = System.currentTimeMillis();
        long finalTime = System.currentTimeMillis();
        TimeManagement tm  = new TimeManagement();
        tm.setStart(starTime);
        tm.setElapsedTime(finalTime);



    }
}
