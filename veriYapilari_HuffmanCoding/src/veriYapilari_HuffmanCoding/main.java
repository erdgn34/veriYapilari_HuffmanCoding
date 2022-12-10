package veriYapilari_HuffmanCoding;

import java.util.PriorityQueue;
import java.util.Comparator;

public class main {

	public static void main(String[] args) {
		int n = 4;
		char[] charDizi = { 'A', 'B', 'C', 'D' };
		int[] charf = { 7, 2, 4, 6 };

		PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new ImplementComparator());

		for (int i = 0; i < n; i++) {
			HuffmanNode hn = new HuffmanNode();

			hn.c = charDizi[i];
			hn.item = charf[i];

			hn.sol = null;
			hn.sag = null;

			q.add(hn);
		}
		HuffmanNode root = null;

	    while (q.size() > 1) {

	      HuffmanNode x = q.peek();
	      q.poll();

	      HuffmanNode y = q.peek();
	      q.poll();

	      HuffmanNode f = new HuffmanNode();

	      f.item = x.item + y.item;
	      f.c = '-';
	      f.sol = x;
	      f.sag = y;
	      root = f;

	      q.add(f);
	    }
	    Huffman huffman =new Huffman();
	    
	    System.out.println(" Char | Huffman code ");
	    System.out.println("--------------------");
	    huffman.printCode(root,"");

	}

}
