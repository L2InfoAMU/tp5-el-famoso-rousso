package image;

import java.awt.*;
import java.nio.file.NoSuchFileException;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image {
    int width ;
    int height;
    public Color[][] colors;


    public BruteRasterImage(int width, int height, Color color) {

     this.width=width;
     this.height=height;

     for (int i=0;i<width; i++){
         for (int j=0;j<height;j++){
             colors[i][j] = color;
         }
     }

    }
    public BruteRasterImage(Color[][] colors){




        width=colors.length;
        height=colors[0].length;
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresRectangularMatrix(colors);


        this.colors=colors.clone();
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
        return colors[x][y];
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height) {
        this.height = height;
    }

    public void createRepresentation(){
        Color[][] secondColors = new  Color[getWidth()][getHeight()];
    }
    public void setPixelColor(Color color, int x, int y){
        this.colors[x][y]=color;
    }
    private void setPixelsColor(Color[][] pixels){
        this.colors = pixels.clone();
    }
    private void setPixelsColor(Color color) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                this.colors[i][j] = color;
            }
        }
    }
    
}
