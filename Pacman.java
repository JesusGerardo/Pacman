import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pacman extends Actor
{
    private int currentImage;
    private int counter;
    private int score=0;
    public Pacman()
    {
        setImage("images/pacman-close.png");
    }

    /**
     * Act - do whatever the Pacman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveMouth();

        handleDirection();

        eat();

    }   
    
    public void eat(){
        if(isTouching(Item.class)){
            Item item=(Item)getOneIntersectingObject(Item.class);
            score+=item.addScore();
            removeTouching(Item.class);
        }
    }
    
    public int getScore(){
        return score;   
    }

    public void handleDirection(){
        int speed = 5;
        int x = getX();
        int y = getY();
        
        if(isAtEdge() && x<30)
            x=827;
            
        if(isAtEdge() && x>830)
            x=37;
        
        if(Greenfoot.isKeyDown("right")){
            Actor collide=getOneObjectAtOffset(38,0,Wall.class);
            if(collide!=null)
                speed=0; 
            setLocation(x + speed, y);
        }
        if(Greenfoot.isKeyDown("left")){
            Actor collide=getOneObjectAtOffset(-38,0,Wall.class);
            if(collide!=null)
                speed=0; 
            setLocation(x - speed, y);
        }
        if(Greenfoot.isKeyDown("down")){
            Actor collide=getOneObjectAtOffset(0,38,Wall.class);
            if(collide!=null)
                speed=0; 
            setLocation(x, y + speed);
        }
        if(Greenfoot.isKeyDown("up")){
            Actor collide=getOneObjectAtOffset(0,-38,Wall.class);
            if(collide!=null)
                speed=0; 
            setLocation(x, y - speed);
        }

    }

    public void moveMouth(){
        if(counter == 0){
            if(currentImage == 0){
                setImage("images/pacman-close.png");
            } else if (currentImage == 1){
                setImage("images/pacman-open.png");
            }

            currentImage = (currentImage + 1) % 2;
        }
        counter = (counter + 1)%10;
    }
}
