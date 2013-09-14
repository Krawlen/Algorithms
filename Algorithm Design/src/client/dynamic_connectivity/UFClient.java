package client.dynamic_connectivity;

import stdlib.StdIn;
import stdlib.StdOut;
import algorithm.dynamic_connectivity.QuickFind;
import algorithm.dynamic_connectivity.UFAlgorithm;


public class UFClient {

	public static void main(String[] args) {
		
		int N = StdIn.readInt();
		
		
		
		/**
		 * Quick Find
		 */
		UFAlgorithm uf = new QuickFind(N);
		
		/**
		 * Quick Union
		 */
//		UFAlgorithm uf = new QuickUnion(N);
		
		/**
		 * Weighted Quick Union
		 */
//		UFAlgorithm uf = new WeightedQuickUnion(N);
		
		while(!StdIn.isEmpty()){
			
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			
			if(!uf.isConnected(p,q)){
				
				uf.union(p, q);
				StdOut.println(p + " " + q);
			}
			
			
		}
		
	}

}
