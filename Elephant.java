import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
