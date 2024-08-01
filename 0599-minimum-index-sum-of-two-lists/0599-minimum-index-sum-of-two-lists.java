class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int minIndexSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        for (int j = 0; j < list2.length; j++) {
            String str = list2[j];
            if (map.containsKey(str)) {
                int indexSum = map.get(str) + j;
                if (indexSum < minIndexSum) {
                    minIndexSum = indexSum;
                    result.clear();
                    result.add(str);
                } else if (indexSum == minIndexSum) {
                    result.add(str);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}