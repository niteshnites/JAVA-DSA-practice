package interview_prep;

import java.util.*;

public class FiveTranQuestion1 {

    public static List<String> workSchedules(String pattern, int workHours, int dayHours) {
        List<String> result = new ArrayList<>();

        char[] schedule = pattern.toCharArray();

        int fixedSum = 0;
        List<Integer> questionPos = new ArrayList<>();

        for (int i = 0; i < schedule.length; i++) {
            if (schedule[i] == '?') {
                questionPos.add(i);
            } else {
                fixedSum += schedule[i] - '0';
            }
        }

        int remaining = workHours - fixedSum;

        backtrack(schedule, questionPos, 0, remaining, dayHours, result);

        return result;
    }

    private static void backtrack(char[] schedule,
                                  List<Integer> pos,
                                  int idx,
                                  int remaining,
                                  int maxDay,
                                  List<String> result) {

        if (idx == pos.size()) {
            if (remaining == 0) {
                result.add(new String(schedule));
            }
            return;
        }

        for (int h = 0; h <= maxDay; h++) {

            if (h > remaining)
                break;

            schedule[pos.get(idx)] = (char) ('0' + h);

            backtrack(schedule, pos, idx + 1,
                    remaining - h,
                    maxDay,
                    result);
        }

        schedule[pos.get(idx)] = '?';
    }

    public static void main(String[] args) {
        String pattern = "08??840";
        int workHours = 24;
        int dayHours = 4;

        List<String> ans = workSchedules(pattern, workHours, dayHours);

        for (String s : ans)
            System.out.println(s);
    }
}

