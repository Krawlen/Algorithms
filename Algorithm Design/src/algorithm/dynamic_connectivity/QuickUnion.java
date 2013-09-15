package algorithm.dynamic_connectivity;

public class QuickUnion implements UFAlgorithm {

	private int[] id;

	public QuickUnion(int N) {
		id = new int[N];

		for (int i = 0; i < N; i++) {

			id[i] = i;

		}
	}

	/**
	 * @return
	 */
	private int root(int node) {

		int root = node;
		while (id[root] != root) {
			root = id[root];

		}

		return root;

	}

	@Override
	public boolean isConnected(int node1, int node2) {

		return root(node1) == root(node2);

	}

	@Override
	public void union(int node1, int node2) {

		int i = root(node1);
		int j = root(node2);
		id[i] = j;
	}

	@Override
	public String printArray() {
		String result = "[";
		for (int i = 0; i < id.length; i++) {
			result += id[i] + ",";
		}
		result = result.substring(0, result.length() - 1);
		result = result + "]";

		return result;
	}

}
