# JavaProjects

Here I keep my studies about OOP, Data Structers, and others, using Java language.

## Notes:

- To scan something typed:
```java
Scanner sc = new Scanner(System.in); // sc is the name of variable
int x = sc.nextInt();
double y = sc.nextDouble();
char z = sc.next().charAt(0);
String s = sc.nextLine();
sc.close();
```
On a String case:   
`sc.nextLine(); // ------------- to clean the buffer`   
`name = sc.nextLine();`   
Use : `import java.util.Scanner;`

- @Override toString(). Example: 
```java
@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		
		Node p = head;
		 
		while (p!= null) {
			sb.append(p.getValue() + " ");
			p = p.getNext();
		}
		
		sb.append("]");
		return sb.toString();
		
	}
```

