package image;


import javafx.scene.paint.Color;
import util.Matrices;

import java.util.LinkedList;
import java.util.List;

public class PaletteRasterImage   extends RasterImage {


    int width ;
    int height;
    public int[][] indexesOfColors;

    List<Color> palette;

    public PaletteRasterImage(int[][] indexesOfColors, List<Color> palette) {
        super(indexesOfColors.length,indexesOfColors[0].length);
        indexesOfColors = new  int[width][height];
        this.palette = palette;
    }

    public void fixPixelColor(Color color){
        if (!palette.contains(color)){
            palette.add(color);

        }
    }


    public Color getPixelColor(int x, int y) {
        return palette.get(indexesOfColors[x][y]);
    }


    public void createRepresentation(){

        indexesOfColors = new int[getWidth()][getHeight()];
         palette = new LinkedList<>();
    }
    public void setPixelColor(Color color, int x, int y){
        this.indexesOfColors[x][y]=palette.indexOf(color);
    }
    public void setPixelsColor(int[][] indexesOfColors){
        this.indexesOfColors = indexesOfColors.clone();
    }
    public void setPixelsColor(Color color) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                this.indexesOfColors[i][j] = palette.indexOf(color);
            }
        }
    }
    
}
