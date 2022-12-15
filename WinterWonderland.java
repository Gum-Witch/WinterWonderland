import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;



class WinterWonderland extends Canvas
{
   public WinterWonderland()    //constructor method - sets up the class
   {
      setSize(800,600);
      Color lightBlue = new Color(173,216,230);
      setBackground(lightBlue);       
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.RED);

      window.drawString("Natu Benyam - Block 7", 35, 35 );

      theGround(window);
      //create several trees of varying sizes to the landscape
      tree1(window);
      tree2(window);
      tree3(window);
      //Decorate the largest tree with some ornaments and a tree topper
      //add a snowman or two 
      //put some snow in the sky (you might try Math.random() to place some random
      //white dots in the sky)
      //add anything else that might enhance those Winter vibes
      
   }
  
   public void drawTriangle(Color col, int[][] points, Graphics window) {
	   window.setColor(col);
	   window.fillPolygon(points[0], points[1], 3);
   }
   
   public void theGround(Graphics window)
   {
       window.setColor(Color.WHITE);
       window.fillRect(0,400,800,200);
   }
   public void snowman1(Graphics window)
   {
	 //add more code here
   }
   public void snowman2(Graphics window)
   {
	 //add more code here
   }
   public void tree1( Graphics window )
   {
	  Color brown = new Color(88,43,9);
	  window.setColor(brown);
	  window.fillRect(100, 350, 50, 100);
	  Color darkGreen = new Color(10,48,4);
	  int[][]points1 = {{50,125,200},{420,280,420}};
	  drawTriangle(darkGreen, points1, window);
      int[][] points2 = {{60,190,125},{360,360,275}};
      drawTriangle(darkGreen, points2, window);
      int[][] points3 = {{70,180,125},{320,320,250}};
      drawTriangle(darkGreen, points3, window);                
   }
   public void tree2( Graphics window )
   {
	  Color brown = new Color(88,43,9);
	  window.setColor(brown);
	  window.fillRect(500, 350, 50, 100);
	  Color darkGreen = new Color(10,48,4);
	  int[][]points1 = {{450,525,600},{420,280,420}};
	  drawTriangle(darkGreen, points1, window);
      int[][] points2 = {{460,590,525},{360,360,275}};
      drawTriangle(darkGreen, points2, window);
      int[][] points3 = {{470,580,525},{320,320,250}};
      drawTriangle(darkGreen, points3, window);                    
   }
   public void tree3( Graphics window )
   {
	    
	   Color brown = new Color(88,43,9);
	   window.setColor(brown);
	   window.fillRect(300, 250, 50, 200);

	   Color darkGreen = new Color(10,48,4);
	   int[][]points1 = {{230,325,420},{340,200,340}};
	   drawTriangle(darkGreen, points1, window);
	   int[][] points2 = {{245,325,405},{360,275,360}};
	   drawTriangle(darkGreen, points2, window);
	   int[][] points3 = {{70,125,180},{320,250,320}};
	   drawTriangle(darkGreen, points3, window);                
	   
	   
	   WinterWonderland.Star star = new WinterWonderland.Star();
		star.draw(window, 400, 300, 30);        
   }
   public void snow( Graphics window )
   {

        //add more code here
	    //Try combining a for loop with Math.random() and window.fillOval()
   }

   


public class Star {
	private Color color;
	private final int STAR_POINTS = 10;
	private int[] polygonX = new int[STAR_POINTS];
	private int[] polygonY = new int[STAR_POINTS];
	
	public Star() {
		color = Color.YELLOW;
	}
	
	public void draw(Graphics g, int centerX, int centerY, double radius) {
	
		 
		double innerRadius = radius*Math.sin(Math.toRadians(18)/Math.sin(Math.toRadians(54)));

		// Note that (i-18)/36 will be 0, 2, 4, 6 8
		for (int i = 18; i < 360; i += 72) {
			polygonX[(i-18)/36] = centerX + (int) (radius * Math.cos(Math.toRadians(i)));
			polygonY[(i-18)/36] = centerY - (int) (radius * Math.sin(Math.toRadians(i))); 
		}

		// Here (i-18)/36 will be 1, 3, 5, 7, 9
		for (int i = 54; i < 360; i += 72) {
			polygonX[(i-18)/36] = centerX + (int) (innerRadius * Math.cos(Math.toRadians(i)));
			polygonY[(i-18)/36] = centerY - (int) (innerRadius * Math.sin(Math.toRadians(i))); 
		}

		Color c = g.getColor();
		g.setColor(color);
		g.fillPolygon(polygonX, polygonY, STAR_POINTS);
		g.setColor(c);
	}

}
}
