import java.util.ArrayList;
import java.util.*;
import javax.swing.*;
public class FWGC implements ProbInterface {

	int cost;
	Tree tree;
	public FWGC() {
		cost = 0;
		tree = new Tree();
		ArrayList<Integer> is = new ArrayList<Integer>();
		//0 if on the west
		//1 if on the east
		is.add(0,0);
		is.add(1,0);
		is.add(2,0);
		is.add(3,0);
		tree.setHead(is);
		 
	}

	@Override
	public boolean testForGoalState(Tree.Node node) {
		if(node.state.get(0) == 1 && node.state.get(1) == 1 && node.state.get(2) == 1 && node.state.get(3) == 1) {
			return true;
		}
	
		return false;
	}

	@Override
	//takes in state and returns if that state is a valid successor state to the current state
	public void nextStates(Tree.Node node) {
		ArrayList<Integer> next = new ArrayList<Integer>();
		if(node.state.get(0) == 0) {
			if(node.state.get(1) == 0 && node.state.get(2) != 0 && node.state.get(3) != 0) {
				next = node.state;
				next.set(1, 1);
				next.set(0,1);
				tree.addChild(node, next);
			}
			if(node.state.get(2) == 0) {
				next = node.state;
				next.set(2, 1);
				next.set(0, 1);
				tree.addChild(node, next);
			}
			if(node.state.get(1) == 0 && node.state.get(2) != 0 && node.state.get(3) != 0) {
				next = node.state;
				next.set(1, 1);
				tree.addChild(node, next);
			}
		}
		else if(node.state.get(0) == 1) {
			
		}
		ArrayList<Integer> is = new ArrayList<Integer>();
		
		cost++;

	}

	@Override
	public void operationCost() {
		
	}

}
