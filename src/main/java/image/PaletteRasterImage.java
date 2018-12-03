package image;


import javafx.scene.paint.Color;
import util.Matrices;

import java.util.LinkedList;
import java.util.List;

public class PaletteRasterImage   implements Image {


    int width ;
    int height;
    public int[][] indexesOfColors;

    List<Color> palette;

    public PaletteRasterImage(int[][] indexesOfColors, List<Color> palette) {

        indexesOfColors = new  int[width][height];
        this.palette = palette;
    }

    public void fixPixelColor(Color color){
        if (!palette.contains(color)){
            palette.add(color);

        }
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return palette.get(indexesOfColors[x][y]);
    }

    @Override
    public int getWidth() {
        return indexesOfColors.length;
    }

    @Override
    public int getHeight() {
        return indexesOfColors[0].length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void createRepresentation(){

        indexesOfColors = new int[getWidth()][getHeight()];
        palette = new LinkedList<Color>;
    }
    public void setPixelColor(Color color, int x, int y){
        this.indexesOfColors[x][y]=palette.indexOf(color);
    }
    private void setPixelsColor(int[][] indexesOfColors){
        this.indexesOfColors = indexesOfColors.clone();
    }
    private void setPixelsColor(Color color) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                this.indexesOfColors[i][j] = palette.indexOf(color);
            }
        }
    }
    
}
