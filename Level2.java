import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Schreibe hier eine Beschreibung der Klasse Level1 auf.
 * 
 * @author (Dein Name) 
 * @version (eine Versionsnummer oder das aktuelle Datum)
 */
public class Level2 extends World
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
    public Level2()
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
        wand1.platziereWand(80, 0, 100, 300);  // Positionierung der Wand, x, y, breite, hoehe. 
        
        Wand wand2 = new Wand();
        addObject(wand2, 0, 0);
        wand2.platziereWand(210, 300, 100, 100);
        
        Wand wand3 = new Wand();
        addObject(wand3, 0, 0);
        wand3.platziereWand(280, 150, 20, 200);
        
        Wand wand4 = new Wand();
        addObject(wand4, 0, 0);
        wand4.platziereWand(220, 100, 100, 50);
        
        Wand wand5 = new Wand();
        addObject(wand5, 0, 0);
        wand5.platziereWand(380, 0, 100, 350);
        
        
        
        dasZielgebiet = new Zielgebiet();
        addObject(dasZielgebiet, 548, 27);  // Zielbereich instanziieren und einfuegen  
        
        blauerpunkt1 = new BlauerPunkt();
        addObject(blauerpunkt1, 200, 285);   // Gegner erschaffen und einfuegen
        
        blauerpunkt2 = new BlauerPunkt();
        addObject(blauerpunkt2, 210, 200);
        
        blauerpunkt3 = new BlauerPunkt();
        addObject(blauerpunkt3, 345, 250);
        
        blauerpunkt4 = new BlauerPunkt();
        addObject(blauerpunkt4, 530, 210);
        
        
    }
    
    /**
     * Act - schreibe dort hinein, was der BlueDot tun soll. Diese Methode wird immer aufgerufen
     * wenn der 'Act' oder 'Run' Knopf in Greenfoot gedr�ckt wurde.
     */
    public void act()
    {
        derSpieler.steuerung();
        
        blauerpunkt1.bewege(195, 262);
        blauerpunkt2.bewege(195, 262);
        blauerpunkt3.bewege(312, 367);
        blauerpunkt4.bewege(500, 585);
        showText("Level: 2", 40, 10);
        derSpieler.LebenAnzeigen();
    }
}
