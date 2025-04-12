/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap oluşturuyoruz, burada anahtar: sayı, değer: indeks
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Dizi üzerinde dolaşıyoruz
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // Hedef toplamı elde etmek için gereken tamamlayıcı sayıyı hesaplıyoruz
            
            // Eğer tamamlayıcıyı hashmap'te bulduysak
            if (map.containsKey(complement)) {
                // Tamamlayıcının indeksi ile şu anki indeksini döndürüyoruz
                return new int[]{map.get(complement), i};
            }
            
            // Eğer tamamlayıcıyı bulamazsak, mevcut sayıyı hashmap'e ekliyoruz
            map.put(nums[i], i);  // Sayıyı ve indeksini hashmap'e ekliyoruz
        }
        
        // Eğer çözüm bulunmazsa (ki soruda "bir çözüm her zaman vardır" denildiği için burası çalışmaz)
        return new int[]{};
    }
}

 