class Solution {
    public String predictPartyVictory(String senate) {

         Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                rQueue.offer(i);
            } else  {
                dQueue.offer(i);
            }

        }
        while (!rQueue.isEmpty() && !dQueue.isEmpty()) {

            int r = rQueue.poll();
            int d = dQueue.poll();
            if (r < d) {
                rQueue.offer(senate.length()+r);

            } else  {
                dQueue.offer(senate.length()+d);
            }
        }

        return rQueue.isEmpty() ? "Dire" : "Radiant";


        
    }
}