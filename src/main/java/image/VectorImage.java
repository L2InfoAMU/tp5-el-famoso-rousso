package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.LinkedList;
import java.util.List;

public class VectorImage implements Image {

    List<Shape> shapes;
    int width, height;

    public VectorImage(List<Shape> shapes, int width, int height) {
        this.width = width;
        this.height = height;
        this.shapes=shapes;


    }

    public  Color getPixelColor(int x, int y){

        for(int i =0; i<shapes.size();i++ ) {


            if (shapes.get(i).contains(new Point(x,y))) {
                return shapes.get(i).getColor();

            }
        }



        return Color.WHITE;
    }
    public int  getWidth(){
        return width;
    }
    public int  getHeight(){
        return  height;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
