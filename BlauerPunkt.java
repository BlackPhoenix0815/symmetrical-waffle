import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Schreibe hier eine Beschreibung der Klasse BlueDot auf.
 * 
 * @author (Dein Name) 
 * @version (eine Versionsnummer oder das aktuelle Datum)
 */
public class BlauerPunkt extends Feind
{
    int minX = 230;  
    int maxX = 390;
    int speed = Greenfoot.getRandomNumber(6)+3;  // so schnell bewegt sich ein BlueDot pro Runde
 

    public void bewege(int minX, int maxX) 
    {
       
        if(getX() > maxX || getX() < minX){  // wenn min oder max X-Position erreicht
            speed = -speed;                  // Bewegungsrichtung umkehren
        }
        move(speed);                         // bewegen     
    }    
}
