package client.dynamic_connectivity;

import stdlib.StdIn;
import stdlib.StdOut;
import algorithm.dynamic_connectivity.UFAlgorithm;
import algorithm.dynamic_connectivity.WeightedQuickUnion;

public class UFClient {

	public static void main(String[] args) {

		System.out.println("Enter the value of N:");
		int N = StdIn.readInt();

		/**
		 * Quick Find
		 */
//		UFAlgorithm uf = new QuickFind(N);

		/**
		 * Quick Union
		 */
//		 UFAlgorithm uf = new QuickUnion(N);

		/**
		 * Weighted Quick Union
		 */
		 UFAlgorithm uf = new WeightedQuickUnion(N);
		System.out
				.println("Set the initial unions, type each union as \"3 4\". Write -1  to end the initialization");
		boolean initializating = true;
		while (initializating) {

			int p = StdIn.readInt();
			if (p == -1) {
				initializating = false;

			} else {

				int q = StdIn.readInt();
				if (!uf.isConnected(p, q)) {

					uf.union(p, q);
					StdOut.println(p + " " + q);
				}
			}

		}
		System.out.println("The ids array is: " + uf.printArray()
				+ " after the unions");

	}

}
