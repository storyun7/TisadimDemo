package model.shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

import model.Shape;

public class Line extends Shape{

	public static final int START_POINT = 0;
	public static final int END_POINT = 1;
	
	public Line(Color edgeColor, Color fillColor, float stroke) {
		super(edgeColor, fillColor, stroke);
	}
	
	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		
		g.drawLine(getStartPoint().x, getStartPoint().y, getEndPoint().x, getEndPoint().y);
	}

	@Override
	public void doClick(Point startPoint) {
		// TODO Auto-generated method stub
		ArrayList<Point> pointList = getPointList();
		
		pointList.add(startPoint);
		setStartPoint(pointList.get(START_POINT));
		Point endPoint = new Point(startPoint);
		pointList.add(endPoint);
		setEndPoint(pointList.get(END_POINT));
	}
	
	public void doPress(Point point) {
		Point p = getPointList().get(END_POINT);
		p.setLocation(point);
	}

	@Override
	public void doRelease(Point endPoint) {
		// TODO Auto-generated method stub
		
		initialCenterPoint();
	}
}
