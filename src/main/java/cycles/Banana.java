package cycles;

/**
 * @description:
 * @author: Evelyn
 * @date: 2022-03-21 22:00
 */
public class Banana {

    private Apple apple;

    public Banana() {

    }

    public Banana(Apple apple) {
        this.apple = apple;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }
}
