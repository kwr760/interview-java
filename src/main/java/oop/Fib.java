package oop;

public class Fib {
	private Integer Nth;
	private Integer NthMinusOne;
	private Integer position;
	
	public Fib(){
		Nth = 1;
		NthMinusOne = 1;
	}
	
	private Integer FindNth(Integer rank){
		if (rank < 1) {
			return 0;
		}
		else if ((1 == rank) || (2 == rank)) {
			return 1;
		}
		
		Integer next = this.Nth + this.NthMinusOne;
		this.NthMinusOne = this.Nth;
		this.Nth = next;
		this.position = this.position++;
		
		if (this.position.equals(rank)){
			return this.Nth;
		}
		
		return FindNth(rank);
	}

}
