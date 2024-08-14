class Solution {
    public int[] asteroidCollision(int[] asteroids) {
//  a. If the `asteroid` is bigger than the asteroid on the top, then this asteroid on the top will explode, and we will pop it from the stack.
//  b. If the `asteroid` has the same size as the asteroid on the top, then both will explode. Hence we will pop it from the stack; also, we will mark `flag` as `false` because this `asteroid` will also explode, and hence we won't save it into the stack.
//  c. If the `asteroid` is smaller than the asteroid on the top, then the asteroid on the top will not explode, so we will not pop it. But the `asteroid` will explode and thus we will mark `flag` as `false`.    }

        Stack<Integer> stack = new Stack<>();
        // boolean exploded = false;

        for(int a: asteroids){
            boolean flag = true;
            while(!stack.isEmpty() && (stack.peek() > 0 && a < 0)){
                if(Math.abs(stack.peek()) < Math.abs(a)){
                    stack.pop();
                    continue;
                } else if(Math.abs(stack.peek()) == Math.abs(a)) {
                    stack.pop();
                }
                flag = false;
                break;
            }

            if(flag){
                stack.push(a);
            }
        }

        return stack.stream().mapToInt(x -> x).toArray();
    }
}