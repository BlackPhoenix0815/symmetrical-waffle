import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Schreibe hier eine Beschreibung der Klasse Wall auf.
 * 
 * @author (Dein Name) 
 * @version (eine Versionsnummer oder das aktuelle Datum)
 */
public class Wand extends Actor
{
   
    
    /**
     * Methode setzeGroesse
     * setzt die Groesse des Wall-Bilds auf die entsprechende breite und hoehe
     *
     * @param width     Die breite des Actors
     * @param height    Die hoehe des Actors
     */
    public void setzeGroesse(int width, int height){
        GreenfootImage wallImg = getImage();  // aktuelles Bild holen und speichern
        wallImg.scale(width, height);   // Bildgroesse anpassen
    }
    
    /**
     * setzt den Wall-Actor an die angegebenen Koordinaten 
     * Achtung!: x und y beziehen sich hier auf die obere linke Ecke der Wall
     *
     * @param x     Die x-Koordinate der oberen linken Ecke des Actors
     * @param y     Die y-Koordinate der oberen linken Ecke des Actors
     */
    public void setzePosition(int x, int y){
        GreenfootImage wallImg = getImage(); // aktuelles Bild holen und speichern
        setLocation(x + wallImg.getWidth()/2, y + wallImg.getHeight() / 2); // Actor mit x und y platzieren
    }
    
    /**
     * Methode platzereWand platziert diese Wand. 
     * Achtung: x & y bezieht sich hier auf die obere linke Ecke der Wand, 
     * nicht - wie in Greenfoot ansonsten ueblich - den Mittelpunkt
     *
     * @param x     X-Koordinate der oberen linken Ecke
     * @param y     Y-Koordinate der oberen linken Ecke
     * @param width     Die Breite der Wand
     * @param height    Die Hoehe der Wand
     */
    public void platziereWand(int x, int y, int width, int height){
        setzeGroesse(width, height);  // zuerst die hoehe und breite aendern
        setzePosition(x, y); // damit dann die obere linke Ecke platziert werden kann
    }
    
    
}
