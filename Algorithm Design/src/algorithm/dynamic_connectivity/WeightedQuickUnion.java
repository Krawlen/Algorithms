package algorithm.dynamic_connectivity;

public class WeightedQuickUnion implements UFAlgorithm {

	private int[] id;
	private int[] size;

	public WeightedQuickUnion(int N) {
		id = new int[N];
		size = new int[N];
		for (int i = 0; i < N; i++) {
			size[i] = 1;
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

		if (size[i] < size[j]) {
			id[i] = j;
			size[j] += size[i];
		}

		else {
			id[j] = i;
			size[i] += size[j];

		}
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
