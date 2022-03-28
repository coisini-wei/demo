package cycles;

/**
 * @description:
 * @author: Evelyn
 * @date: 2022-03-21 22:00
 */
public class Apple {

    private Banana banana;

    public Apple() {

    }

    public Apple(Banana banana) {
        this.banana = banana;
    }

    public Banana getBanana() {
        return banana;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }
}
