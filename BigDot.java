import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BigDot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BigDot extends Item
{
    /**
     * Act - do whatever the BigDot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BigDot(){
        setImage("images/dot.png");
        GreenfootImage image = getImage();
        image.scale(60, 60);
        setImage(image);
    }
    
    public int addScore(){
        return 50;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
