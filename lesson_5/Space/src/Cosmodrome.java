public class Cosmodrome {

    public void launch(IStart iStart) throws InterruptedException {

        if (iStart.check()) {
            iStart.engineStarting();
            int i = 10;
            while (i > 0) {
                System.out.println(i);
                i--;
                Thread.sleep(1000L);
            }
            iStart.start();

        } else {
            System.out.println("Предстартовая проверка провалена.");
        }


    }
}
