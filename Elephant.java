import greenfoot.*;
import greenfoot.GreenfootSound;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    private GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    private GreenfootImage[] idleRight = new GreenfootImage[8];
    private GreenfootImage[] idleLeft = new GreenfootImage[8];
    private int imageIndex = 0;
    private String facing = "right";
    private SimpleTimer animationTimer = new SimpleTimer();

    public Elephant()
    {
        for (int i = 0; i < 8; i++)
        {
            idleRight[i] = new GreenfootImage("elephant_idle/idle" + i + ".png");
            idleRight[i].scale(100, 100);
            idleLeft[i] = new GreenfootImage(idleRight[i]);
            idleLeft[i].mirrorHorizontally();
        }
        setImage(idleRight[0]);
        animationTimer.mark();
    }

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

    public void animateElephant()
    {
        if (animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();

        if (facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
        }
        else
        {
            setImage(idleLeft[imageIndex]);
        }
        imageIndex = (imageIndex + 1) % idleRight.length;     
    }


}
