
public class Fib {
	private Integer Nth;
	private Integer NthMinusOne;
	private Integer position;
	
	public Fib(){
		Nth = 1;
		NthMinusOne = 1;
	}
	
	public Integer FindNth(Integer rank){
		if (rank < 1) {
			return new Integer(0);
		}
		else if ((1 == rank) || (2 == rank)) {
			return new Integer(1);
		}
		
		Integer next = this.Nth + this.NthMinusOne;
		this.NthMinusOne = this.Nth;
		this.Nth = next;
		this.position = this.position++;
		
		if (this.position == rank){
			return this.Nth;
		}
		
		return FindNth(rank);
	}

}
