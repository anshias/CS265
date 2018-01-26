
public class prob2
{

public static void main( String[] args )
{

try {
int a = Integer.parseInt( args[0] );
if ( ( a % 2 ) == 0) {
System.out.println("even");
}
else {
System.out.println("odd");
}

}


catch (NumberFormatException ex) {
System.out.println("Input is not an integer: " + args[0]);
return;
}
}
}
