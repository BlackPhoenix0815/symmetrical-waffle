import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mover extends Feind
{
    /**
     * Act - do whatever the Mover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void pulse(int speed)//speed could be 1 or 2 
    { 
        
       int delay = 0;
      if(speed == 1){
          
          delay = Greenfoot.getRandomNumber(100);
          if(delay == 1){
             setImage("blueDot_20.png"); 
            }else if(delay == 10){
             setImage("blueDot_30.png");    
            }   
        }else if(speed == 2)
        {
          
          delay = Greenfoot.getRandomNumber(1000);
          if(delay == 5){
             setImage("blueDot_20.png"); 
            }else if(delay == 10){
             setImage("blueDot_30.png");    
            }   
            
        }
    
    }
}
