import greenfoot.*;
import greenfoot.GreenfootSound;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    private GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    public void act()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        
        if (Greenfoot.isKeyDown("Right"))
        {
            move(5);
        }

        eat();
        
    }

    public void eat()
    {
        if (isTouching(Apple.class))
        {
            MyWorld world = (MyWorld) getWorld();
            removeTouching((Apple.class));
            world.createApple();
            elephantSound.play();
        }    
    }


}
