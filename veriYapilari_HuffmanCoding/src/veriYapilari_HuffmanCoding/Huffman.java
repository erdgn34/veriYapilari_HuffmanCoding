package veriYapilari_HuffmanCoding;


public class Huffman {
	public static void printCode(HuffmanNode root, String s) {
		if (root.sol == null && root.sag == null && Character.isLetter(root.c)) {

			System.out.println(root.c + "   |  " + s);

			return;
		}
		printCode(root.sol, s + "0");
		printCode(root.sag, s + "1");
	}

}
