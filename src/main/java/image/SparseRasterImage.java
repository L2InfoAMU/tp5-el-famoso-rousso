package image;


import javafx.scene.paint.Color;

import java.util.HashMap;

public class SparseRasterImage extends  RasterImage {

    HashMap<Point,Color> map ;

    public SparseRasterImage(Color[][] pixels) {
        super(pixels.length,pixels[0].length);
        createRepresentation();
        for(int i=0;i<width;i++){
            for (int j = 0; j< height;j++){
                map.put(new Point(i,j),pixels[i][j]);
            }
        }
    }
    public  SparseRasterImage(Color color, int width, int height){
        super(width,height);
        createRepresentation();
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
        map.put(new Point(x, y), color);
    }


    public void setPixelsColor(Color color) {


        for(int i=0;i<width;i++) {
            for (int j = 0; j < height; j++) {


                map.getOrDefault(new Point(i, j), color);
            }
        }
    }

    public void setPixelsColor(Color[][] pixels) {
        for(int x=0;x<width;x++) {
            for (int y = 0; y < height; y++) {
                map.put( new Point(x,y),pixels[x][y]);
            }
        }
    }


    public Color getPixelColor(int x, int y) {
        return map.get(new Point(x,y));
    }


}