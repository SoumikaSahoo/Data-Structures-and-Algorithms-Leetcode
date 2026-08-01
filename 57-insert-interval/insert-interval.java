class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int start = newInterval[0];
        int end = newInterval[1];

        boolean inserted = false;
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            if (end < start2) {
                if (!inserted) {
                    list.add(new int[]{start, end});
                    inserted = true;
                }
                list.add(new int[]{start2, end2});
            }
            else if (end2 < start) {
                list.add(new int[]{start2, end2});
            }
            else {
                start = Math.min(start, start2);
                end = Math.max(end, end2);
            }
        }

        if (!inserted) {
            list.add(new int[]{start, end});
        }

        return list.toArray(new int[list.size()][]);
    }
}