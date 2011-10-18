class Bitmap
{
    string areaString;
    string shapeString;
    void drawArea(string str)
    {
       areaString = str; 
    }
    void drawShape(string str)
    {
       shapeString = str; 
    }
    void display()
    {
        System.Out.Println(areaString + shapeString);
    }
}
  
