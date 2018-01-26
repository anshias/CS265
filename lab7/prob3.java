
public class prob3
{

public static void main( String[] args )
{

try {
int a = Integer.parseInt( args[0] );
if ( ( a % 4 ) == 0) {
System.out.println("Leap year!");
}
else {
System.out.println("Not a leap year!");
}

}


catch (NumberFormatException ex) {
System.out.println("Input is not an integer: " + args[0]);
return;
}
}
}
