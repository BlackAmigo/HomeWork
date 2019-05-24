/**
 * @author Miroshnichenko Anatoliy.
 */
public class KangarooShow {

    public boolean isKangarooCrossing(int x1, int v1, int x2, int v2) {

        if(v1 > v2) return false;
        else {
            int speed = v2 - v1;
            int distance = x1 - x2;

            if(distance % speed == 0)return true;
            else return false;
        }
    }
}
