package image;

import java.awt.*;
import javafx.scene.paint.Color;
public class BruteRasterImage implements Image {
    int width ;
    int height;
    public Color[][] pixels;
    Color color;

    public BruteRasterImage(int width, int height, Color color) {
     Color [][] pixels = new Color[width][height];
     this.width=width;
     this.height=height;

     for(int i=0;i<width; i++){
         for (int j=0;j<height;j++){
             pixels[i][j] = getPixelColor(i,j);
         }
     }
    }
    public BruteRasterImage(Color[][] color){
        width=pixels.length;
        height=pixels[0].length;
    }


    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
    @Override
    public Color getPixelColor(int x,int y) {
        return pixels[x][y];
    }
}
