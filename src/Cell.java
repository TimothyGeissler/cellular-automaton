import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Cell {
    private boolean isLive;
    private Rectangle cell;
    private static final Color LIVE_CELL = Color.BLACK;
    private static final Color DEAD_CELL = Color.TRANSPARENT;
    private static final int CELL_SIZE = 10;

    public Cell(int x, int y) {
        cell = new Rectangle();
        cell.setOnMouseClicked(t -> {
            System.out.println("cell clicked");
            swapLive();
        });
        cell.setFill(DEAD_CELL);
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
            cell.setFill(LIVE_CELL);
        } else {
            cell.setFill(DEAD_CELL);
        }
    }
}
