package doWhileLoops;


	public class Circle {
		private double radius;

		public Circle() {

			radius = -999;

		}

		public Circle(double yradius) {
			radius = yradius;

		}

		public double getRadius() {
			return radius;

		}

		public void setRadius(double xradius) {
			radius = xradius;
		}

		public double circumference() {

			double circ = 2 * Math.PI * radius;
			return circ;

		}

		public double area() {

			double newarea = Math.PI * (radius * radius);
			return newarea;

		}

	}


