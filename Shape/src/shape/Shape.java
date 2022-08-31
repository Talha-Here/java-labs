/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;
class Circle extends Shape {
  public Circle(Point center, double radius) {
    position = new Point(center);  
    this.radius = radius;}	         
  public String toString() { 					
    return "Circle: Center " + position + " Radius " + radius;}
  public void show() {					
    System.out.println("\n" + toString());}
  private double radius;}	
class Line extends Shape {
  public Line(Point start, Point end) {
    position = new Point(start); 	                       
    this.end = new Point(end.x-start.x, end.y - start.y);}  
  public String toString() {  
    return "Line: " + position + " to " + position.add(end);}
  public void show() {
    System.out.println("\n"+toString());}
  private Point end; }                  
class ListPoint extends Point {
  public ListPoint(double x, double y) {
    super(x, y);   
    next = null;    
  }
  public ListPoint(Point point) {
    super(point);
    next = null;
  }
  public void setNext(ListPoint next) {
    this.next = next;}
  public ListPoint getNext() {
    return next;}
  public String toString() {
    return "ListPoint " + x + "," + y;}
  ListPoint next; }  
 class Point {
  public Point(){}
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public Point(Point point) {
    x = point.x;
    y = point.y;
  }
  public Point add(Point z) {
    return new Point(x+z.x,y+z.y);
  }
  public String toString() {
    return "Point: " + x + "," + y;
  }

  protected double x = 0.0;
  protected double y = 0.0;
}
class PolyLine extends Shape {
  public PolyLine(Point[] points) {
    if(points.length<2) {
      System.out.println("\nAt least two points are required to define a polyline"+
                         "\nProgram terminated");
      System.exit(1);                   
    }
    position = new Point(points[0]);    
    start = new ListPoint(points[1].x-position.x, points[1].y-position.y);      
    end = start;                        
    for(int i = 2; i < points.length; i++) {
      addPoint(points[i]);
    }
  }
  public void addPoint(Point point) {
    ListPoint newEnd = new ListPoint(point.x-position.x, point.y-position.y);
    end.setNext(newEnd);    
    end = newEnd;           
  }
  public String toString() {
    String str = "PolyLine:\n" + position + " ";
    int count = 1;                       
    ListPoint nextPoint = start;	  
    while(nextPoint != null) {
      str += nextPoint.add(position)+" "; 
      if(++count%4==0) {                  
        str += "\n";                      
      }
      nextPoint = nextPoint.getNext();    
    }
    return str;                           
  }
  public void show() {
    System.out.println("\n" + toString());
  }
  private ListPoint start;                
  private ListPoint end;                
}
class Rectangle extends Shape {
  public Rectangle(Point startDiag, Point endDiag) {
    position = new Point(Math.min(startDiag.x,endDiag.x),Math.min(startDiag.y,endDiag.y));
    bottomRight = new Point(Math.max(startDiag.x,endDiag.x) - position.x,
                            Math.max(startDiag.y,endDiag.y) - position.y);}
  public String toString()  { 
    return "Rectangle: Top Left: " + position + " Bottom Right: " + 
                                                     position.add(bottomRight);}
  public void show() {				
    System.out.println("\n" + toString());}
  private Point bottomRight;  }     
public abstract class Shape {
  public void move(double xDelta, double yDelta) {
    position.x += xDelta;		
    position.y += yDelta;}
  public abstract void show();	
  protected Point position;   }  

