package StacksQueues;

import java.util.*;

// Input: asteroids = [3,5,-6,2,-1,4]​​​​​​​
// Output: [-6,2,4]
// Explanation: The asteroid -6 makes the asteroid 3 and 5 explode, and then continues going left. On the other side, the asteroid 2 destroys -1. Since 2 and 4 are both moving right, they never collide.

// A new left-moving asteroid first collides with the nearest earlier right-moving asteroid. If that asteroid explodes, the next nearest right-moving asteroid is checked. Therefore, the most recently stored asteroid must be processed first, which follows the LIFO order of a stack.
// Asteroids moving away from each other never collide, so only earlier right-moving asteroids need to be checked. An array-based stack works well because adding, checking, and removing the last asteroid are fast, and the final remaining asteroids can easily be returned as an array.

class Solution {
    // Simulates asteroid collisions with an array stack.
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> survivors = new ArrayList<>();

        // Process asteroids from left to right.
        for (int asteroid : asteroids) {
            // A right mover cannot hit earlier asteroids.
            if (asteroid > 0) {
                survivors.add(asteroid);
            } else {
                int currentSize = Math.abs(asteroid);
                boolean destroyed = false;

                // Check only right movers nearest to the asteroid.
                while (!survivors.isEmpty()
                        && survivors.get(survivors.size() - 1) > 0) {
                    int topIndex = survivors.size() - 1;
                    int topSize = Math.abs(survivors.get(topIndex));

                    // Smaller right movers explode first.
                    if (topSize < currentSize) {
                        survivors.remove(topIndex);
                    } else {
                        // Equal size removes the stored asteroid too.
                        if (topSize == currentSize) {
                            survivors.remove(topIndex);
                        }

                        destroyed = true;
                        break;
                    }
                }

                // Store a left mover after every blocker is gone.
                if (!destroyed) {
                    survivors.add(asteroid);
                }
            }
        }

        int[] answer = new int[survivors.size()];

        // Copy list values into the required array result.
        for (int index = 0; index < survivors.size(); index++) {
            answer[index] = survivors.get(index);
        }

        return answer;
    }
}

// Driver code
public class Collision {
    public static void main(String[] args) {
        int[] asteroids = { 10, 2, -5 };
        Solution obj = new Solution();
        int[] answer = obj.asteroidCollision(asteroids);
        System.out.println(Arrays.toString(answer));
    }
}
