package magician;

import angels.Angel;
public final class Magician implements Observer {
    private Angel angel = null;

    public Angel getAngel() {
        return angel;
    }

    public void setAngel(final Angel angel) {
        this.angel = angel;
        System.out.println("Angel " + angel.getType() + " was spawned at "
                + angel.getLinePosition() + " " + angel.getColumnPosition());
    }
    @Override
    public void update() {
        angel.update();
    }
}
