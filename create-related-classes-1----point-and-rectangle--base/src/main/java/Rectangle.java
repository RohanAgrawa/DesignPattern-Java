public class Rectangle {
    // write the code of rectangle class here

    Point topLeft;
    int height;
    int width;


    int getArea()
    {
        return  Math.abs(height * width);
    }

    int getParameter()
    {
        return Math.abs(2 * (width + height));
    }

    Point getBottomRight()
    {
        int x1 = topLeft.x;
        int y1 = topLeft.y;




        x1  = x1 + width;

        if(y1 <= 0)
        {
            y1 = y1 - height;
        }
        else
        {
            y1 = y1 + height;
        }

        Point bottomRight = new Point();
        bottomRight.x = x1;
        bottomRight.y = y1;
        System.out.println(x1 + " " + y1);
        return  bottomRight;

    }
}
