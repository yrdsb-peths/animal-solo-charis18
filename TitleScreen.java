import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        Label titleLabel = new Label("Hungry Elephant", 60);
        addObject(titleLabel, getWidth()/2, getHeight()/2);

        Label instructionLabel = new Label("Press Space to Start", 30);
        addObject(instructionLabel, getWidth()/2, getHeight()/2 + 50);

        Label moveInstructions = new Label("Use \u2190 and \u2192 to Move", 25);
        addObject(moveInstructions, getWidth()/2, getHeight()/2 + 90);
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
