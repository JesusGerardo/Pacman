import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Phantom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phantom extends Actor
{
    private int offset = 5;
    
    public Phantom(){
        setImage("images/blue-phantom-left.png");
    }
    
    /**
     * Act - do whatever the Phantom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        
        setLocation(x , y += offset);
        
        if(isTouching(Actor.class)){
            offset = -5;
        }
        
        if(isAtEdge()){
            offset = 5;
        }
        
    }    
}
