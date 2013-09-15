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

	
	/* (non-Javadoc)
	 * @see algorithm.dynamic_connectivity.UFAlgorithm#isConnected(int, int)
	 */
	public boolean isConnected(int node1, int node2) {

		return id[node1] == id[node2];

	}

	
	/* (non-Javadoc)
	 * @see algorithm.dynamic_connectivity.UFAlgorithm#union(int, int)
	 */
	public void union(int node1, int node2) {

		int node2value = id[node2];
		int node1value = id[node1];

		for (int i = 0; i < id.length; i++) {
			if (node1value == id[i])
				id[i] = node2value;

		}

	}

	/* (non-Javadoc)
	 * @see algorithm.dynamic_connectivity.UFAlgorithm#printArray()
	 */
	@Override
	public String printArray() {
		String result = "[";
		for (int i = 0; i < id.length; i++) {
			result += id[i] +",";
		}
		result = result.substring(0, result.length()-1);
		result = result + "]";
		
		return result;
	}

}
