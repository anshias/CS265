public class prob4
{

public static void main( String[] args )
{

String [] onesdigit = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
String [] tensdigit = { "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

try {
int a = Integer.parseInt( args[0] );

if ( a >= 10 && (a % 10 == 0)) {
System.out.println(tensdigit.charAt(0));
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
