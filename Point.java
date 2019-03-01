class Point
{
	// ======>> instance data
	private double x, y;
	// ======>> constructors, automagically called for a ‘new’ object
	Point()
	{
		x=0;
		y=0;
	}
	Point(double d1, double d2 )
	{
		x = d1; y = d2;
	}
	// ======>> instance methods
	//Getters
	double getX()
	{
		return x;
	}
	double getY()
	{
		return y;
	}
	//Setters
	void setX(double x)
	{
		this.x=x;
	}
	void setY(double y)
	{
		this.y=y;
	}
	// toString() method
	public String toString()
	{
		// create a string representation of the object
		String pointLooksLike = "("+x+","+y+")";
		return pointLooksLike;
	}

	// Method to check if two points are the same
	boolean equals( Point that )
	{
		if ( this.x==that.x && this.y==that.y )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}// end of point class
