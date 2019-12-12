import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Schreibe hier eine Beschreibung der Klasse Level1 auf.
 * 
 * @author (Dein Name) 
 * @version (eine Versionsnummer oder das aktuelle Datum)
 */
public class Level1 extends World
{
    // Deklaration
    Spieler derSpieler;
    Wand wand1;
    Wand wand2;
    Zielgebiet dasZielgebiet;
    BlauerPunkt blauerpunkt1, blauerpunkt2, blauerpunkt3, blauerpunkt4;
    
    
    /**
     * Konstruktor
     */
    public Level1()
    {    
        // Eine neue Welt mit 600x400 Groesse erstellen
        super(600, 400, 1);    
        setup();  // Instanzen für dieses Level erschaffen und einfuegen
    }

    /**
     * Die Objekte in die Welt einfuegen
     */
    private void setup()
    {
        derSpieler = new Spieler();
        addObject(derSpieler, 300, 200);
        
        Wand wand1 = new Wand();  // neuen Wand-Actor erschaffen und speichern 
        addObject(wand1, 0, 0);  // Wand in die Welt einfuegen
        wand1.platziereWand(100, 0, 100, 330);  // Positionierung der Wand, x, y, breite, hoehe. 
        
        Wand wand2 = new Wand();
        addObject(wand2, 0, 0);
        wand2.platziereWand(400, 70, 100, 330);
        
        dasZielgebiet = new Zielgebiet();
        addObject(dasZielgebiet, 550, 350);  // Zielbereich instanziieren und einfuegen  
        
        blauerpunkt1 = new BlauerPunkt();
        addObject(blauerpunkt1, 320, 250);   // Gegner erschaffen und einfuegen
        
        blauerpunkt2 = new BlauerPunkt();
        addObject(blauerpunkt2, 270, 320);
        
        blauerpunkt3 = new BlauerPunkt();
        addObject(blauerpunkt3, 240, 290);
        
        blauerpunkt4 = new BlauerPunkt();
        addObject(blauerpunkt4, 550, 300);
    }
    
    /**
     * Act - schreibe dort hinein, was der BlueDot tun soll. Diese Methode wird immer aufgerufen
     * wenn der 'Act' oder 'Run' Knopf in Greenfoot gedr�ckt wurde.
     */
    public void act()
    {
        derSpieler.steuerung();
        blauerpunkt1.bewege(220, 380);
        blauerpunkt2.bewege(220, 380);
        blauerpunkt3.bewege(220, 380);
        blauerpunkt4.bewege(525, 590);
        showText("Level: 1", 40, 10);
        derSpieler.LebenAnzeigen();
    }
}
