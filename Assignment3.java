/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Assignment3 extends GraphicsProgram {

/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

/** Separation between bricks */
	private static final int BRICK_SEP = 4;

/** Width of a brick */
	private static final int BRICK_WIDTH =
	  (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

/** Number of turns */
	private static final int NTURNS = 3;
	
	private GRect paddle;
	
	private GRect brick;
	
	private GOval trialsLeft;
	
	private double vx;
	private double vy;
	
	int countTrials = 0;
	int countBricks = 0;
	
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
//	AudioClip bounceClip = MediaTools.loadAudioClip("bounce.au");
	AudioClip bounceClip1 = MediaTools.loadAudioClip("gameoversound.au");

	
/* Method: run() */
/** Runs the Breakout program. */
	public void run() {
		setBackground(Color.DARK_GRAY);
		addBricks();
		addTrialsLeft();
		addPaddle();
		addMouseListeners();
		addBall();
	}


	private void addTrialsLeft() {
		GLabel healthLeft = new GLabel("HEALTH:");
		healthLeft.setColor(Color.MAGENTA);
		healthLeft.setFont("MONOSPACED-15");
		add(healthLeft, 5, 15);
		for(int i = 0; i < 3; i++) {
			trialsLeft = new GOval(17, 17);
			trialsLeft.setFilled(true);
			trialsLeft.setColor(Color.magenta);
			add(trialsLeft, i * 23 + 5, 22);
		}
}


	// adds moving ball that collides bricks
	private void addBall() {
		GOval ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
		ball.setFilled(true);
		ball.setColor(Color.MAGENTA);
		add(ball, getWidth() / 2 - BALL_RADIUS, getHeight() / 2 - BALL_RADIUS); 
		vy = 3;
		vx = rgen.nextDouble(1.0, 3.0);
		if(rgen.nextBoolean(0.5))vx = -vx;
		while(true){
			ball.move(vx, vy);
			pause(7);
			GObject collider1 = getCollidingObject(ball.getX(), ball.getY());
			GObject collider2 = getCollidingObject(ball.getX(), ball.getY() + 2 * BALL_RADIUS);
			GObject collider3 = getCollidingObject(ball.getX() + 2 * BALL_RADIUS, ball.getY());
			GObject collider4 = getCollidingObject(ball.getX() + 2 * BALL_RADIUS, ball.getY() + 2 * BALL_RADIUS);
			if(collider2 == paddle || collider4 == paddle) { // bottom points of the ball
				ball.setLocation(ball.getX(), paddle.getY() - 2 * BALL_RADIUS);
				vy = -vy;
//				bounceClip.play();
			}
			if(collider1 != null && collider1 != paddle) {
				remove(collider1);
				vy = -vy;
				countBricks++;
//				bounceClip.play();
				continue;
			}
			if(collider2 != null && collider2 != paddle) {
				remove(collider2);
				vy = -vy;
				countBricks++;
//				bounceClip.play();
				continue;
			}
			if(collider4 != null && collider4 != paddle) {
				remove(collider4);
				vy = -vy;
				countBricks++;
//				bounceClip.play();
				continue;
			}
			if(collider3 != null && collider3 != paddle) {
				remove(collider3);
				vy = -vy;
				countBricks++;
//				bounceClip.play();
				continue;
			}
			if(ball.getX() >= getWidth() - 2 * BALL_RADIUS) {
				ball.setLocation(getWidth() - 2 * BALL_RADIUS, ball.getY());
				vx *= -1;
			}
			if(ball.getX() <= 0) {
				ball.setLocation(0, ball.getY());
				vx *= -1;
			}
			if(ball.getY() <= 0) {
				ball.setLocation(ball.getX(), 0);
				vy *= -1;
			}
			if(ball.getY() >= getHeight() - 2 * BALL_RADIUS) {
				ball.setLocation(getWidth() / 2 - BALL_RADIUS, getHeight() / 2 - BALL_RADIUS);
				countTrials++;
				remove(getElementAt((countTrials - 1) * 23 + 8, 28));// removes pink circles after each trial
				if(countTrials < NTURNS) {// on the last try we do not need pause
					pause(1500);
				}
				vx = rgen.nextDouble(1.0,3.0); //generating new direction for the ball for each try
				if(rgen.nextBoolean(0.5)) {
					vx = -vx;
				}
			}
			if(countTrials == NTURNS) {
				GLabel LLabel = new GLabel("GAME OVER :(");
				LLabel.setFont("MONOSPACED-45");
				LLabel.setColor(Color.MAGENTA);
				add(LLabel, getWidth() / 2 - LLabel.getWidth() / 2, getHeight() / 2 + LLabel.getAscent());
				remove(ball);
				bounceClip1.play();
				break;
			}
			if(countBricks == 10) {
				GLabel WLabel = new GLabel("You won! :)");
				WLabel.setFont("MONOSPACED-45");
				WLabel.setColor(Color.MAGENTA);
				add(WLabel, getWidth() / 2 - WLabel.getWidth() / 2, getHeight() / 2 + WLabel.getAscent() / 2);
				remove(ball);
				break;
			}
			
		}
	}

// returns an object on the x and y coordinates
	private GObject getCollidingObject(double x, double y) {
		return getElementAt(x, y);
	}

// adds 100 bricks with different colors
	private void addBricks() {
		for(int i = 0; i < NBRICK_ROWS; i++) {
			for(int j = 0; j <= NBRICKS_PER_ROW; j++) {
				createBrick(i, j);
			}
		}
	}

// creates each brick
	private void createBrick(int i, int j) {
		double startingX = (getWidth() - 10 * BRICK_WIDTH - 9 * BRICK_SEP) / 2; // left side X coordinate of the bricks
		brick = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
		brick.setFilled(true);
		paintBrick(brick, i);
		add(brick, startingX + j * (BRICK_WIDTH + BRICK_SEP), BRICK_Y_OFFSET + i * (BRICK_HEIGHT + BRICK_SEP));
	}
	
// paints each brick. depends on which line is the brick.
	private void paintBrick(GRect brick, int i) {
		if(i == 0 || i == 1) {
			brick.setColor(Color.RED);
		}
		if(i == 2 || i == 3) {
			brick.setColor(Color.ORANGE);
		}
		if(i == 4 || i == 5) {
			brick.setColor(Color.YELLOW);
		}
		if(i == 6 || i == 7) {
			brick.setColor(Color.GREEN);
		}
		if(i == 8 || i == 9) {
			brick.setColor(Color.CYAN);
		}
	}
	
// adds paddle
		private void addPaddle() {
			paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
			paddle.setFilled(true);
			paddle.setColor(Color.MAGENTA);
			add(paddle, getWidth() / 2 - paddle.getWidth() / 2, getHeight() - PADDLE_Y_OFFSET);
		}
	
	@Override
	public void mouseMoved(MouseEvent e) {
			double paddleX = e.getX() - PADDLE_WIDTH / 2; // x coordinate of the paddle
			if(paddleX > getWidth() - PADDLE_WIDTH) { // paddle should not go outside of the window
				paddleX = getWidth() - PADDLE_WIDTH;
			}
			if(paddleX < 0) {
				paddleX = 0;
			}
			paddle.setLocation(paddleX, getHeight() - PADDLE_HEIGHT - PADDLE_Y_OFFSET);
	}
}



//ხმა +
//ქულები