import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    private int score = 0;
    private Label scoreLabel;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        createApple();

        scoreLabel = new Label(score, 50);
        addObject(scoreLabel, 50, 50);
    }

    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }

    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }

    public void gameOver()
    {
        Label gameOverLable = new Label("Game Over", 100);
        addObject(gameOverLable, 300, 200);
    }
}
