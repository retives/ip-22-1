package lab2;


public class LinkedListFamily {
	 int length =0;
	 Family head;
	 Family tail;
	
	public void append(Family fam) {
		if(length==0) {
			head=fam;
			tail=fam;
		}
		else {
			tail.next=fam;
			tail=tail.next;
		}
		length++;
	}

	public void printFamilies() {
		Family temp=head;
		if(length==0) System.out.println("The list is empty");
		else{
			for(int i =0; i<length;i++) {
				temp.printFamily();
				System.out.println();
				temp=temp.next;
			}
		}
	}

	public void checkEmployedWives() {
		Family temp=head;
		System.out.println("Employed wives: ");
		
		for(int i=0; i<length; i++) {
			if(temp.getWife().getJob()!="Unemployed") {
				System.out.println(temp.getWife().getFirstName() +" "+ temp.getWife().getSecondName()+ " Works as: "+ temp.getWife().getJob());
				temp=temp.next;
			}
		}
	}
	public void checkIncome() {
		Family temp=head;
		System.out.println("People with income less than 10000: ");
		
		for(int i=0; i<length; i++) {
			if(temp.getHusband().getIncome()<10000) {
				System.out.println(temp.getHusband().getFirstName() +" "+ temp.getHusband().getSecondName());
			}
			if(temp.getWife().getIncome()<10000){
				System.out.println(temp.getWife().getFirstName() +" "+ temp.getWife().getSecondName());
			}
			for(Person c: temp.children) {
				if(c.getIncome()<10000) {
					System.out.println(c.getFirstName() +" "+ c.getSecondName());
				}
			}
		temp=temp.next;
		}
	}
	public void childrenAmount() {
		Family temp=head;
		System.out.println("");
		
		for(int i=0; i<length; i++) {
			if(temp.children.size()>=3) {
				System.out.println(temp.getHusband().getSecondName()+ "s family has "+temp.children.size()+" kids");
			}
			temp=temp.next;
		}
	}
	
	
}
