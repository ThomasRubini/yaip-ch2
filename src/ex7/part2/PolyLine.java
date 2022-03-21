package ex7.part2;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
	private List<Point> points;

	public PolyLine() {
		this.points = new ArrayList<>();
	}

	public PolyLine(List<Point> points){
		this.points = points;
	}

	public void appendPoint(int x, int y){
		appendPoint(new Point(x, y));
	}

	public void appendPoint(Point p){
		points.add(p);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for(Point p : points){
			sb.append(p);
		}
		sb.append("}");

		return sb.toString();
	}
}
