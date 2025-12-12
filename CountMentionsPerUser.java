// https://leetcode.com/problems/count-mentions-per-user/?envType=daily-question&envId=2025-12-12

import java.util.*;

class CountMentionsPerUser{
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        events.sort((a, b) -> {
            int timeA = Integer.parseInt(a.get(1));
            int timeB = Integer.parseInt(b.get(1));
            if(timeA != timeB){
                return Integer.compare(timeA, timeB);
            }
            boolean aIsMessage = a.get(0).equals("MESSAGE");
            boolean bIsMessage = b.get(0).equals("MESSAGE");
            return Boolean.compare(aIsMessage, bIsMessage);
        });

        int[] count = new int[numberOfUsers];
        int[] nextOnlineTime = new int[numberOfUsers];

        for(List<String> event : events){
            int curTime = Integer.parseInt(event.get(1));
            String type = event.get(0);

            if(type.equals("MESSAGE")){
                String target = event.get(2);
                if(target.equals("ALL")){
                    for(int i = 0; i < numberOfUsers; i++){
                        count[i]++;
                    }
                }
                else if(target.equals("HERE")){
                    for(int i = 0; i < numberOfUsers; i++){
                        if(nextOnlineTime[i] <= curTime){
                            count[i]++;
                        }
                    }
                }
                else{
                    String[] users = target.split(" ");
                    for(String user : users){
                        int idx = Integer.parseInt(user.substring(2));
                        count[idx]++;
                    }
                }
            }
            else{
                int idx = Integer.parseInt(event.get(2));
                nextOnlineTime[idx] = curTime + 60;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountMentionsPerUser solution = new CountMentionsPerUser();
        List<List<String>> events = new ArrayList<>();
        events.add(Arrays.asList("MESSAGE", "1", "ALL"));
        events.add(Arrays.asList("AWAY", "2", "0"));
        events.add(Arrays.asList("MESSAGE", "61", "HERE"));
        events.add(Arrays.asList("MESSAGE", "62", "U1 U2"));

        int[] result = solution.countMentions(3, events);
        System.out.println("Mentions per user: " + Arrays.toString(result));
    }
}