package algorithm.dynamic_connectivity;

/**
 * @author Kekho
 * 
 */
public class QuickFind implements UFAlgorithm {

	private int[] id;

	/**
	 * Array Initialization
	 * 
	 * @param N
	 */
	public QuickFind(int N) {

		id = new int[N];

		for (int i = 0; i < N; i++) {

			id[i] = i;

		}

	}

	/**
	 * Answer to dynamic connectivity problem, are two nodes connected/Linked?
	 * 
	 * @return true if the nodes are connected, false otherwise
	 */
	public boolean isConnected(int node1, int node2) {

		return id[node1] == id[node2];

	}

	/**
	 *Link two nodes 
	 * 
	 * @param node1
	 * @param node2
	 */
	public void union(int node1, int node2) {

		int node2value = id[node2];
		int node1value = id[node1];

		for (int i = 0; i < id.length; i++) {
			if (node1value == id[i])
				id[i] = node2value;

		}

	}

}
