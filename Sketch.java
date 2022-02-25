import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500,500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0,255,255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {


	  // Width and Height
    float sizeAdjustedWidth = width / 500;
    float sizeAdjustedWidth = height / 500;

    // Sun
    stroke(0);
    fill(255, 208, 0);
    ellipse(460 * sizeAdjustedWidth, 50 * sizeAdjustedHeight, 150 * sizeAdjustedWidth, 150);

    // House
    stroke(0);
    fill(0,0,0);
    rect(120 * sizeAdjustedWidth, 240 * sizeAdjustedHeight, 220 * sizeAdjustedWidth, 220 * sizeAdjustedHeight);

    // 1st Window
    stroke(0);
    fill(230, 230, 230);
    rect(130 * sizeAdjustedWidth, 290 * sizeAdjustedHeight, 50 * sizeAdjustedWidth, 50 * sizeAdjustedHeight);

    // 2nd Window
    stroke(0);
    fill(230,230,230);
    rect(200 * sizeAdjustedWidth, 290 * sizeAdjustedHeight, 50 * sizeAdjustedWidth, 50 * sizeAdjustedHeight);

    // 3rd Window
    stroke(0);
    fill(230,230,230);
    rect(270 * sizeAdjustedWidth, 290 * sizeAdjustedHeight, 50 * sizeAdjustedWidth, 50 * sizeAdjustedHeight);

    // Grass
    stroke(0);
    fill(6, 184, 0);
    rect(0 * sizeAdjustedWidth, 450 * sizeAdjustedHeight, 500 * sizeAdjustedWidth, 80 * sizeAdjustedHeight);

    // Sidewalk
    stroke(0);
    fill(184, 194, 126);
    rect(200 * sizeAdjustedWidth, 450 * sizeAdjustedHeight, 70 * sizeAdjustedWidth, 80 * sizeAdjustedHeight);

    // Rooftop
    stroke(0);
    fill(0, 79, 153);
    triangle(80 * sizeAdjustedWidth, 240 * sizeAdjustedHeight, 250 * sizeAdjustedWidth, 140 * sizeAdjustedHeight, 380 * sizeAdjustedWidth, 240 * sizeAdjustedHeight);
  
  
  }
  
  // define other methods down here.
}