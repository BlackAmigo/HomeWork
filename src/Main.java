public class Main {

    public static void main(String[] args) {
        TimeConversion timeConversion = new TimeConversion();
        System.out.println(timeConversion.to24format("07:05:45PM"));
        System.out.println(timeConversion.to24formatOther("07:05:45PM"));

        KangarooShow ks = new KangarooShow();
        System.out.println(ks.isKangarooCrossing(2,1,1,2));
    }
}
