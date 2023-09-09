
 import java.util.*; 
 class Cricketer1 implements Comparable<Cricketer1>{ private int jerNo; private String name;
 //private String message; 
 public Cricketer1(int jerNo, String name) 
 { this.jerNo = jerNo;
 this.name = name;
 }
 public int getJerNo() 
 { 
	 return jerNo;
	 }
 public void setJerNo(int jerNo)
 { 
	 this.jerNo = jerNo;
	 }
 public String getName() {
	 return name;
	 }
 public void setName(String name) { 
	 this.name = name;
	 }
 @Override public String toString() {
	 return "Cricketer [jerNo=" + jerNo + ", name=" + name + "]"; 
	 }
 @Override public int compareTo(Cricketer1 o) { 
	  return(name.compareTo(o.name));
	 }
 public int compareTo(Cricketer1 o) { 
	 if(jerNo==o.jerNo)
		 return 0;
	 else if(jerNo>o.jerNo) 
		 return 1; 
	 else return -1;  
	 }
  } 
 public class Demo {
	 public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 HashSet<Cricketer1> arr1=new HashSet<Cricketer1>();
		 Cricketer1 c1=new Cricketer1(71,"Watson");
		 arr1.add(new Cricketer1(7,"Dhoni"));
		 arr1.add(new Cricketer1(9,"Kholi"));
		 arr1.add(c1); arr1.add(c1);
		 arr1.add(new Cricketer1(18,"Duplese"));
		 Iterator<Cricketer1> itr=arr1.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
			 }
		 arr1.remove(c1);
		 System.out.println(arr1);
		 System.out.println(); 
		 LinkedHashSet<Cricketer1> arr2=new LinkedHashSet<Cricketer1>();
		 Cricketer1 c2=new Cricketer1(71,"Watson");
		 Cricketer1 c3=new Cricketer1(72,"Watson");
		 arr2.add(new Cricketer1(7,"Dhoni"));
		 arr2.add(new Cricketer1(18,"kholi"));
		 arr2.add(c2); 
		 arr2.add(c3);
		 arr2.add(new Cricketer1(9,"Duplese"));
		 Iterator<Cricketer1> itr1=arr2.iterator();
		 while(itr1.hasNext()) {
			 System.out.println(itr1.next()); 
			 } 
		// arr2.removeIf((Cricketer1 c2)->(c2.getName().equals(c3.getName())));
		 System.out.println(arr2);
		 System.out.println(); 
		 TreeSet<Cricketer1> arr3=new TreeSet<Cricketer1>();
		 Cricketer1 c4=new Cricketer1(71,"Watson");
		 arr3.add(new Cricketer1(7,"Dhoni"));
		 arr3.add(new Cricketer1(18,"Kholi"));
		 arr3.add(c4);
		 arr3.add(c4);
		 arr3.add(new Cricketer1(9,"Duplese"));
		 Iterator<Cricketer1> itr2=arr3.iterator();
		 while(itr2.hasNext()) { 
			 System.out.println(itr2.next());
			 } 
		 System.out.println(arr3);
		 scan.close(); 
 }
 }

