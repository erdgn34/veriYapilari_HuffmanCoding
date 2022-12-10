package veriYapilari_HuffmanCoding;
import java.util.PriorityQueue;
import java.util.Comparator;

class HuffmanNode {
	int item;
	  char c;
	  HuffmanNode sol;
	  HuffmanNode sag;
}
class ImplementComparator implements Comparator<HuffmanNode> {
	  public int compare(HuffmanNode x, HuffmanNode y) {
	    return x.item - y.item;
	  }
	}


