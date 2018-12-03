package image;

import javafx.scene.paint.Color;

public abstract class RasterImage  {

    int width;
    int height;

    public RasterImage(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
