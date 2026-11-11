public class Rectangle {
    private float length;
    private float width;


    // constructor


public Rectangle(){
    setLength(1.0f);
    setWidth(1.0f);
}

    // Getters and Setters
    public float getLength() {
        return length;
}
public float getWidth(){
    return width;
}
public void setWidth(float width){
    if (width >0.0 && width<=40.0)
    {
        this.width = width;
    }
    else{
        System.out.println("Invalid width");
    }
}
public void setLength(float length){
    if (length >0.0 && length<=40.0)
    {
        this.length = length;
    }
    else{
        System.out.println("Invalid length");
    }
}
    //ToString method
public String toString() {
    return "Rectangle [length=" + length + ", width=" + width + "]";
}

//misc methrods
public float getArea(){
    return length * width;
}
public float getPerimeter(){
    return 2 * (length + width);
}
public void printRectangle(){
    String w="*";
    for(int i=0; i<width-1;i++){
        w=w+"*";
    }
    System.out.print(w);
    for(int j=0; j<length-2;j++){
        System.out.print("\n*");
        for(int x=0; x<width-2;x++){
            System.out.print(" ");
        }
        System.out.print("*");
    }
    System.out.print("\n"+w);
}
}

