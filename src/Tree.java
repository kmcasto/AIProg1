import java.util.ArrayList;
import java.util.*;
public class Tree {
Node head;
	
public class Node{
	//future convert state to generic
	ArrayList<Integer> state;
	ArrayList<Tree.Node> list;
	Node parent;
}
	
//get child element x
public Node getChild(Node parent, int x) {
	return parent.list.get(x);
}

public int getNumOfChildren(Node input) {
	return input.list.size();
}
	
//set child element x
public Node gethead(){
	return head;
}
public void setHead(ArrayList state){
	head.state = state;
	
}
public void addChild(Node parent, ArrayList childState) {
	Node child = new Node();
	child.state = childState;
	parent.list.add(child);
}
//get parent
public Node getParent(Node child) {
	return child.parent;
}

//changeChild to be determined

}
