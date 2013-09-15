package algorithm.dynamic_connectivity;

public interface UFAlgorithm {

	
	/**
	 * Answer to dynamic connectivity problem, are two nodes connected/Linked?
	 * 
	 * @return true if the nodes are connected, false otherwise
	 */
	public boolean isConnected(int node1, int node2);
	
	/**
	 *Link two nodes 
	 * 
	 * @param node1
	 * @param node2
	 */
	public void union(int node1, int node2);
	
	/**
	 * Prints the solution of the dynamic connectivity problem after processing the algorithm
	 * @return
	 */
	public String printArray();
}
