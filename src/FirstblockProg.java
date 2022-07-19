import java.util.ArrayList;
import java.util.Arrays;

public class FirstblockProg {

	public static void main(String[] args) {
		// Demonstrate a hash function
		String statement1 = "My world is perfect";
		int hashvalue = statement1.hashCode();
	    
		System.out.println("Statement = " + statement1 + " whose hash value = " + hashvalue);
		
		
		//let hash an array
		String [] list1 = {"alex", "becky", "cyril"};
		String [] list2 = {"alex", "becky", "cyril"};
		
		int hash1 = Arrays.hashCode(list1);
		int hash2 = Arrays.hashCode(list2);
	
		System.out.println("hash1 = " + hash1 + " hash 2 = " +hash2);
		
		// demonstrate a series of Blocks in chain
		ArrayList<Block> blockChain = new ArrayList<Block>();
		//now we are going to build our first Block in a chain.
		String[] initialValues = {"Tauhid has $1700", "Mario has $550"};
		Block firstBlock = new Block(initialValues, 0);
		blockChain.add(firstBlock);
		System.out.println("First block is " + firstBlock.toString());
		System.out.println("The block chain is " + blockChain.toString());
		//first - blockHash=2146454673
		
		//block two
		String[] tauhidGivesItAway = {"Tauhid gives Elon $40", "Tauhid gives Amazon $60", "Tauhid gives Goldman $100"};
		Block secondBlock = new Block(tauhidGivesItAway, firstBlock.getBlockHash());
		blockChain.add(secondBlock);
		System.out.println("Second block is " + secondBlock.toString());
		System.out.println("The block chain is " + blockChain.toString());
		//second - blockHash=-45793671
		
		//block three
		String[] tauhidGetsSomeBack = {"Elon gives Tauhid $10",  "Goldman gives Tauhid $50"};
		Block thirdBlock = new Block(tauhidGetsSomeBack, secondBlock.getBlockHash());
		blockChain.add(thirdBlock);
		System.out.println("Third block is " + thirdBlock.toString());
		System.out.println("The block chain is " + blockChain.toString());
 		 
		
	}

}
