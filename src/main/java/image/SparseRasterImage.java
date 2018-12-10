package image;


import javafx.scene.paint.Color;

import java.util.HashMap;

public class SparseRasterImage extends  RasterImage {

    int width;
    int height;
    HashMap<Point,Color> map = new HashMap<Point,Color>();

    public SparseRasterImage(Color[][] pixels) {
        super(pixels.length,pixels[0].length);
        for(int i=0;i<width;i++){
            for (int j = 0; j< height;j++){
                map.put(new Point(i,j),pixels[i][j]);
            }
        }
    }
    public  SparseRasterImage(Color color, int width, int height){
        super(width,height);
        for(int i=0;i<width;i++){
            for (int j = 0; j< height;j++){
                map.put(new Point(i,j),color);
            }
        }
    }


    public void createRepresentation() {
        map = new HashMap<Point,Color>();
    }

    public void setPixelColor(Color color, int x, int y) {
        
    }


    public void setPixelsColor(Color color) {

    }

    public void setPixelsColor(Color[][] pixels) {

    }


    public Color getPixelColor(int x, int y) {
        return null;
    }


}