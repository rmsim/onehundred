/* Name: Rui Min Sim
* UNI: rs3611
* Title: TopSort.java
* Implement topological sorting to find a sequence 
* of courses for the CS major that satisfies
* all prerequisite requirements. 
*/

import java.io.*;
import java.util.*;

public class TopSort {
	public static HashMap<String, TopVert> courses = new HashMap<String, TopVert>();
	public static HashSet<TopVert> unvisited_courses = new HashSet<TopVert>();

	public static TopVert add_or_get_course(String course_name) {
		if (!courses.containsKey(course_name)) {
			TopVert course = new TopVert(course_name);
			courses.put(course_name, course);
			unvisited_courses.add(course);
		}
		return courses.get(course_name);
	}

	public static void main (String[] args) throws IOException {
		FileReader in = new FileReader("csmajor.txt");
		BufferedReader br = new BufferedReader(in);
		String line;

		ArrayList<String> inputLines = new ArrayList<String>();

		while ((line = br.readLine()) != null) {
			inputLines.add(line);
		}

		for (int i = 0; i < inputLines.size(); i++) {
			String[] courses_strs = inputLines.get(i).split(" ");
			TopVert successor = add_or_get_course(courses_strs[0]);
			int numOfPrereqs = inputLines.size() - 1;
			if (numOfPrereqs > 0) {
				for (int j = 1; j < courses_strs.length; j++) {
					TopVert course = add_or_get_course(courses_strs[j]);
					course.add_successor_course(successor);
				}
			}
		}

		in.close();

		for (TopVert course : topologicalSort()) {
			System.out.println(course.name);
		}
	}

	public static ArrayList<TopVert> topologicalSort() {
		LinkedList<TopVert> q = new LinkedList<TopVert>();
		ArrayList<TopVert> course_sequence = new ArrayList<TopVert>();

		for (TopVert course : unvisited_courses) {
			if (course.indegree == 0) { q.add(course); }
		}

		while (!q.isEmpty()) {
			TopVert course = q.poll();
			unvisited_courses.remove(course);
			course_sequence.add(course);

			for (TopVert successor : course.successor_courses) {
				if (unvisited_courses.contains(successor) && --successor.indegree == 0) {
					q.add(successor);
				}
			}
		}

		return course_sequence;
	}
}