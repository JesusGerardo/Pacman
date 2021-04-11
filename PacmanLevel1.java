import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanLevel1 extends World
{
    private Pacman pacman = new Pacman();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PacmanLevel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(864, 616, 1); 

        generateWorld();
        addObject(pacman, 140, 460);
        //addObject(new Phantom(), 250, 40);
    }

    public void act(){
        showText("Score: " + pacman.getScore(),780,30);
    }

    void generateWorld(){
        this.addObject(new BigDot(), 730, 340);
        this.addObject(new BigDot(), 140, 340);
        this.addObject(new Cherry(), 432, 475);
        this.addObject(new Banana(), 432, 308);
        for(int y = 0; y<11;y++){
            switch(y){
                case 0:
                case 10:
                for(int x = 0; x < 12; x++){
                    this.addObject(new Wall(), Wall.widthCenter+(x*Wall.width), Wall.lengthCenter+(y*Wall.length));
                }
                break;

                case 1:
                case 9:
                for(int x=0;x<12;x++){
                    if(x==0 || x==11){
                        this.addObject(new Wall(), Wall.widthCenter+(x*Wall.width), Wall.lengthCenter+(y*Wall.length));
                    }
                    else{
                        this.addObject(new LilDot(),Wall.widthCenter+(x*Wall.width), Wall.lengthCenter+(y*Wall.length));
                    }
                }
                break;

                case 2:
                for(int x=0;x<12;x++){
                    if(x==0 || x==11){
                        this.addObject(new Wall(), Wall.widthCenter+(x*Wall.width), Wall.lengthCenter+(y*Wall.length));
                    }
                }
                break;

                case 3:
                for(int x=0;x<12;x++){
                    if(x==0||x==11)
                        this.addObject(new Wall(), Wall.widthCenter+(x*Wall.width), Wall.lengthCenter+(y*Wall.length));
                    if(x>=3 && x<=8 && x!=5 && x!=6)
                        this.addObject(new Wall(), Wall.widthCenter+(x*Wall.width), Wall.lengthCenter+(y*Wall.length));
                }
                break;

                case 4:
                for(int x=0;x<12;x++){
                    if(x==0||x==11)
                        this.addObject(new Wall(), Wall.widthCenter+(x*Wall.width), Wall.lengthCenter+(y*Wall.length));
                    if(x==3 || x==8)
                        this.addObject(new Wall(), Wall.widthCenter+(x*Wall.width), Wall.lengthCenter+(y*Wall.length));
                }
                break;

                case 5:
                case 6:
                for(int x=0;x<12;x++){
                    if(x==3 || x==8)
                        this.addObject(new Wall(), Wall.widthCenter+(x*Wall.width), Wall.lengthCenter+(y*Wall.length));
                }
                break;

                case 7:
                for(int x=0;x<12;x++){
                    if(x==0||x==11)
                        this.addObject(new Wall(), Wall.widthCenter+(x*Wall.width), Wall.lengthCenter+(y*Wall.length));
                    if(x>=3 && x<=8)
                        this.addObject(new Wall(), Wall.widthCenter+(x*Wall.width), Wall.lengthCenter+(y*Wall.length));
                }
                break;

                case 8:
                for(int x=0;x<12;x++){
                    if(x==0||x==11)
                        this.addObject(new Wall(), Wall.widthCenter+(x*Wall.width), Wall.lengthCenter+(y*Wall.length));
                }
                break;
            }    
        }
    }
}
