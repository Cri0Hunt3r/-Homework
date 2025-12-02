package Module6.Middle4;

public class Player {
    public int winsOne;
    public int winsTwo;

    public void playerOne() {
        winsOne += 1;
    }

    public void playerTwo() {
        winsTwo += 1;
    }

    public int getWinsOne() {
        return winsOne;
    }

    public int getWinsTwo() {
        return winsTwo;
    }
    public void winner() {
        System.out.println("Первый игрок набрал " + getWinsOne());
        System.out.println("Второй игрок набрал " + getWinsTwo());
        if (getWinsOne() > getWinsTwo()) {
            System.out.println("ПЕРВЫЙ ИГРОК ПОБЕДИЛ");
        } else {
            System.out.println("ЦТОРОЙ ИГРОК ПОБЕДИЛ");
        }
    }
}
