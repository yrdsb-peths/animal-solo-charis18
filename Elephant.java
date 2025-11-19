import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    public void act()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        
        if (Greenfoot.isKeyDown("Right"))
        {
            move(1);
        }
        
        // Add your loaction code here.
    }

    public void eat()
    {
        if (isTouching(Apple.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.removeObject((Apple.class));
            world.createApple();
        }    
    }
}
