/* Name: Rui Min Sim
* UNI: rs3611
* Title: TopVert.java
* Class of vertices. 
*/
import java.io.*;
import java.util.*;

class TopVert {
	public String name;
	public int indegree = 0;
	public ArrayList<TopVert> successor_courses = new ArrayList<TopVert>();

	public TopVert(String course) {
		this.name = course;
	}

	public void add_successor_course(TopVert successor) {
		successor.indegree++;
		successor_courses.add(successor);
	}
}