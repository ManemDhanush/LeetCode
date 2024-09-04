class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int [] coords = {0, 0};
        int maxDist = Integer.MIN_VALUE;
        int dir = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Set<Pair<Integer, Integer>> obs = new HashSet<>();

        for(int[] obstacle: obstacles){
            obs.add(new Pair<>(obstacle[0], obstacle[1]));
        }
        // System.out.println(obs);
        // int[] numbers = {10, 20, 30, 40, 50};

        for(int command: commands){
            if(command == -1){
                // turn right
                // dir = (dir + 1) % 4;
                dir++;
            } else if(command == -2){
                // turn left
                // dir = (dir + 3) % 4;
                dir+=3;
            } else {
                int[] newCoords = directions[dir%4];
                while(command-- > 0){
                    int x = coords[0] + newCoords[0];
                    int y = coords[1] + newCoords[1];
                    // int[]

                    if(!obs.contains(new Pair<>(x,y))){
                        coords[0] = x;
                        coords[1] = y;
                    } else {
                        break;
                    }
                }
                // switch(Math.abs(dir) % 4){
                //     case 0:
                //     // int y = coords[1] + 1;
                //     // if(obs.contains(coords[0] + "" + y))
                //     // coords[1] += command;
                //     while(command-- != 0){
                //         if(!obs.contains(coords[0] + "" + (coords[1] + 1)))
                //         coords[1]++;
                //     }
                //     // System.out.println("North");
                //     break;
                //     case 1:
                //     // coords[0] += command;
                //     while(command-- != 0){
                //         if(!obs.contains((coords[0] + 1) + "" + (coords[1])))
                //         coords[0]++;
                //     }
                //     // System.out.println("East");
                //     break;
                //     case 2:
                //     // coords[1] -= command;
                //     while(command-- != 0){
                //         if(!obs.contains(coords[0] + "" + (coords[1] - 1)))
                //         coords[1]--;
                //     }
                //     // System.out.println("South");
                //     break;
                //     case 3:
                //     // System.out.println("West");
                //     // coords[0] -= command;
                //     while(command-- != 0){
                //         if(!obs.contains((coords[0] - 1) + "" + (coords[1])))
                //         coords[0]--;
                //     }
                //     break;
                // }
                // System.out.println(coords[0] + " " + coords[1]);
                maxDist = Math.max(maxDist, (coords[0] * coords[0]) + (coords[1] * coords[1]));
            }
        }
        return maxDist;
    }
}