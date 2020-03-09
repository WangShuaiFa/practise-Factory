package Factory;

public class Main {
    public static void main(String[] args) {
      /*  AoDi aoDi = new AoDi();
        aoDi.run();
        BenChi benChi = new BenChi();
        benChi.run();

        AoDiFactory aoDiFactory = new AoDiFactory();
        BenChiFactory benChiFactory = new BenChiFactory();
        Car aoDi1 = aoDiFactory.createAoDi();
        aoDi1.run();
        benChiFactory.createBenChi().run();*/
        //体会static关键字的用法，当直接用某个类的方法时，需要加上static,没有static需要new
        Car aoDi2 = AoDiFactory.createAoDi();
        Car benChi1 = BenChiFactory.createBenChi();
        aoDi2.run();
        benChi1.run();
    }
}
