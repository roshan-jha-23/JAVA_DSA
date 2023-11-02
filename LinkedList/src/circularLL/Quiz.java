package circularLL;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
 * Complete the 'waitingTime' function below.
 *
 * The function is expected to return a FLOAT.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY req
 *  2. INTEGER_ARRAY dur
 */

public class Quiz{

    public static float waitingTime(List<Integer> req, List<Integer> dur) {
        int n = req.size();
        int[] waitingTime = new int[n];

        int startTime = 0;
        for (int i = 0; i < n; i++) {
            startTime = Math.max(startTime, req.get(i));
            waitingTime[i] = startTime - req.get(i);
            startTime += dur.get(i);
        }

        float totalWaitingTime = 0;
        for (int i = 0; i < n; i++) {
            totalWaitingTime += waitingTime[i];
        }

        return totalWaitingTime / n;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int reqCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> req = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int durCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> dur = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        float result = Quiz.waitingTime(req, dur);

        System.out.println(String.format("%.2f", result));

        bufferedReader.close();
    }
}