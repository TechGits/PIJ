public class BinSearchRec {
    public boolean searchItem(int item, List<Integer> list) {
        if (list.isEmpty()) {

            return false;
        }
        int midpoint = list.size() / 2;
        if (list.get(midPoint) == item) {
            return true;
        }
    } else if (list.get(midPoint) < item) {
        return searchItem(item, list.subList(midPoint+1, list.size()-1));
    }else {
        return searchItem(item, list.subList(0,midPoint));
    }
}
