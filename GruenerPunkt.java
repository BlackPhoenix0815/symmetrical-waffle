import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Schreibe hier eine Beschreibung der Klasse BlueDot auf.
 * 
 * @author (Dein Name) 
 * @version (eine Versionsnummer oder das aktuelle Datum)
 */
public class GruenerPunkt extends Feind
{
    int minY = 230;  
    int maxY = 390;
    int speed = 8;  // so schnell bewegt sich ein BlueDot pro Runde
 

    public void bewege(int minY, int maxY) 
    {
       
        if(getY() > maxY || getY() < minY){  // wenn min oder max X-Position erreicht
            speed = -speed;                  // Bewegungsrichtung umkehren
        }
        setLocation(getX(), getY()-speed);                       // bewegen     
    }    
}