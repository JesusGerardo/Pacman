import greenfoot.*;
/**
 * Write a description of class LilDots here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LilDot extends Item 
{
    
    /**
     * Constructor for objects of class LilDots
     */
    public LilDot()
    {
        setImage("images/dot.png");
        GreenfootImage image = getImage();
        image.scale(30, 30);
        setImage(image);
    }
    
    public int addScore(){
        return 10;
    }
    
}
