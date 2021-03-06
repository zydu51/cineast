package ch.unibas.cs.dbis.cineast.core.data.providers;

import java.util.LinkedList;
import java.util.List;

import ch.unibas.cs.dbis.cineast.core.data.Pair;
import georegression.struct.point.Point2D_F32;


public interface PathProvider {

	List<Pair<Integer, LinkedList<Point2D_F32>>> getPaths();
	
	List<Pair<Integer, LinkedList<Point2D_F32>>> getBgPaths();
	
}
