import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Cell {
    private boolean isLive;
    private Rectangle cell;
    private static final Color CELL_COLOUR = Color.BLACK;
    private static final int CELL_SIZE = 10;

    public Cell(int x, int y) {
        cell = new Rectangle();
        cell.setFill(CELL_COLOUR);
        cell.setVisible(false);
        cell.setX(x);
        cell.setY(y);
        cell.setWidth(CELL_SIZE);
        cell.setHeight(CELL_SIZE);
        this.isLive = false;
    }

    public boolean isLive() {
        return isLive;
    }

    public Rectangle getShape() {
        return cell;
    }

    public void swapLive() {
        setLive(!this.isLive);
    }
    public void setLive(boolean live) {
        isLive = live;
        if (live) {
            cell.setVisible(true);
        } else {
            cell.setVisible(false);
        }
    }
}
