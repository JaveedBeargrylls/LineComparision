public class LineComparision{
public static void main(String[] args){
System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

// inserted the variables and logic for two lines and comparision

int x_1 = 10, x_2=15, y_1=20, y_2=25;
int a_1 = 50, a_2=55, b_1=60, b_2=75;
int v_x,v_y,v_a,v_b;
v_x = x_2 - x_1;
v_y = y_2 - y_1;
v_a = a_2 - a_1;
v_b = b_2 - b_1;
double a = Math.pow(v_x,2);
double b = Math.pow(v_y,2);
double c = Math.pow(v_a,2);
double d = Math.pow(v_b,2);
double length_1 = Math.sqrt(a+b);
double length_2 = Math.sqrt(c+d);
System.out.println("length of a first line is : "+length_1);
System.out.println("length of a second line is : "+length_2);

// Line Comparision of two lines 

if ( length_1 == length_2 )
System.out.println(" the lengths are equal");
else if ( length_1 > length_2 )
System.out.println(" the length_1 "+length_1+" is greater than "+length_2);
else
System.out.println(" the length_1 "+length_1+" is smaller than "+length_2);
}
}
