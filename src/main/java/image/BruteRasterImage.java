package image;

import java.awt.*;
import java.nio.file.NoSuchFileException;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage extends RasterImage {
    int width ;
    int height;
    public Color[][] colors;



    public BruteRasterImage(Color color, int width, int height) {
        super(width,height);
         this.width=width;
         this.height=height;
        colors = new Color[width][height];
         for (int i=0;i<width; i++){
             for (int j=0;j<height;j++){
                 colors[i][j] = color;
             }
         }

    }
    public BruteRasterImage(Color[][] colors){

        super(colors.length,colors[0].length);
        width=colors.length;
        height=colors[0].length;
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresRectangularMatrix(colors);


        this.colors=colors.clone();
    }




    public Color getPixelColor(int x,int y) {
        return colors[x][y];
    }

    public void createRepresentation(){

         colors = new Color[getWidth()][getHeight()];
    }

    public void setPixelColor(Color color, int x, int y){
        this.colors[x][y]=color;
    }

    public void setPixelsColor(Color[][] pixels){
        this.colors = pixels.clone();
    }

    public void setPixelsColor(Color color) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                this.colors[i][j] = color;
            }
        }
    }

}
