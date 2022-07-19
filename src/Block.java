import java.util.Arrays;

public class Block {
	//we have three different properties

	private String[] transactions;
	private int blockHash;
	private int previousBlockHash;
	
	
	@Override
	public String toString() {
		return "Block [transactions=" + Arrays.toString(transactions) + ", blockHash=" + blockHash
				+ ", previousBlockHash=" + previousBlockHash + "]";
	}
	//generated constructor and want to use only 2 properties
	public Block(String[] transactions, int previousBlockHash) {
		super();
		this.transactions = transactions;
		this.previousBlockHash = previousBlockHash;
		//inside of this constructor we are creating new formula for block hash 
		this.blockHash = Arrays.hashCode(new int[] { Arrays.hashCode(transactions), this.previousBlockHash});
	}
	public String[] getTransactions() {
		return transactions;
	}
	public void setTransactions(String[] transactions) {
		this.transactions = transactions;
	}
	public int getBlockHash() {
		return blockHash;
	}
	public void setBlockHash(int blockHash) {
		this.blockHash = blockHash;
	}
	public int getPreviousBlockHash() {
		return previousBlockHash;
	}
	public void setPreviousBlockHash(int previousBlockHash) {
		this.previousBlockHash = previousBlockHash;
	}
	
	
	
}
