import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Schreibe hier eine Beschreibung der Klasse Player auf.
 * 
 * @author (Dein Name) 
 * @version (eine Versionsnummer oder das aktuelle Datum)
 */
public class Spieler extends Actor
{
    
    int step = 3;// Groesse der Schritte des Players in Pixel
    int boost = 0; //value of the boost the player can do
    int startX = 30;    // Anfangsposition des Players
    int startY = 30;    // Anfangsposition des Players
    int Level = 1;
    int Leben = 5;
    public void addedToWorld(World world) {
        startPosition(); // Anfangsposition setzen, geschieht zu Beginn jedes Levels
    }

    /**
     * steuerung - schreibe dort hinein, was der Spieler tun soll. 
     */
    public void steuerung() 
    {
        int xOld = getX();  // momentane x-Position speichern
        int yOld = getY();  // momentane y-Position speichern
        if(Leben > 0){
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX()-step, getY()); // einen Schritt nach links bewegen
        }
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY()-step);
        }
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX()+step, getY());
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + step);    // einen Schritt nach unten bewegen
        }
        if (Greenfoot.isKeyDown("space")) {
            setLocation(getX(), getY() - step);
            boost = -12;// einen Schritt nach unten bewegen
        }
        if (Greenfoot.isKeyDown("f")) {
            setLocation(getX(), getY() + step);
            boost = 12;
        }
        if(getIntersectingObjects(Wand.class).size() > 0) { // wenn in Wand bewegt
            setLocation(xOld, yOld);// auf alte Position setzen
            Greenfoot.playSound("Error.mp3");
        }
        if(getIntersectingObjects(Feind.class).size() > 0) { // wenn auf Gegner getroffen
            startPosition();    // zurueck zur Anfangsposition
            Greenfoot.playSound("fail.mp3");
            Leben --;
        }
        if(getIntersectingObjects(Zielgebiet.class).size() > 0) {  // wenn targetArea erreicht   
            naechstesLevel();    // ins naechste Level
            Greenfoot.playSound("jay.mp3");
        }
        setLocation(getX(), getY() + boost);
        if (boost > 0) { boost--;}
        else { if (boost < 0) boost++; }
        if(Greenfoot.isKeyDown("1")){
        Greenfoot.setWorld(new Level1());
        }
        if(Greenfoot.isKeyDown("2")){
        Greenfoot.setWorld(new Level2());
        }
        if(Greenfoot.isKeyDown("3")){
        Greenfoot.setWorld(new Level3());
        }
    }else{
        LevelZ();
          startPosition();    // zurueck zur Anfangsposition
            Greenfoot.playSound("fail.mp3");
            Leben = 5;
    }
    } 
    

    /**
     * Methode startPosition
     * setzt den Player auf die StartPosition
     */
    public void startPosition(){
        setLocation(startX, startY);
    }

    /**
     * Methode naechstesLevel
     * erschafft das naechste Level - in Abhaengigkeit vom aktuellen Level
     */
    public void naechstesLevel(){
        if (getWorld() instanceof Level1) {  // wenn die aktuelle Welt ein Level1 ist
            Greenfoot.setWorld(new Level2()); // mache sie zu einer Level2-Welt
            Level = 2;
        }
        if (getWorld() instanceof Level2) {
            Greenfoot.setWorld(new Level3());
            Level = 3;
        }
        if (getWorld() instanceof Level3) {
            Greenfoot.setWorld(new End()); 
        }
    }
    public void LevelZ(){
        Greenfoot.setWorld(new Level1());
        Level = 1;
    }
    public void LebenAnzeigen(){
        getWorld().showText("Leben: " + this.Leben, 45, 30); 
    }
} 
