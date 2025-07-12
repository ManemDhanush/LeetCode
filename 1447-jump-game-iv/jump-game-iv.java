class Solution {
    public int minJumps(int[] arr) {
        if(arr.length == 1) return 0;

        HashMap<Integer, List<Integer>> graph = new HashMap<>(); 

        for (int i = 0; i < arr.length; i++) {
            graph.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(0);

        boolean[] visited = new boolean[arr.length];
        visited[0] = true;

        int steps = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                int idx = queue.poll();

                if(idx == arr.length - 1) return steps;

                if (idx - 1 >= 0 && !visited[idx - 1]) {
                    visited[idx - 1] = true;
                    queue.offer(idx - 1);
                }

                if (idx + 1 < arr.length && !visited[idx + 1]) {
                    visited[idx + 1] = true;
                    queue.offer(idx + 1);
                }

                if(graph.containsKey(arr[idx])){
                    for(int key: graph.get(arr[idx])){
                        if(!visited[key]){
                            visited[key] = true;
                            queue.offer(key);
                        }
                    }
                    graph.remove(arr[idx]);
                }
            }
            steps++;
        }

        return -1;
    }
}