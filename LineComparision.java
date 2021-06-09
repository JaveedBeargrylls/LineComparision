public class LineComparision{
public static void main(String[] args){
System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

// inserted the variables and logic

int x_1 = 10, x_2=15, y_1=20, y_2=25;
int v_x,v_y;
v_x = x_2 - x_1;
v_y = y_2 - y_1;
double a = Math.pow(v_x,2);
double b = Math.pow(v_y,2);
double length = Math.sqrt(a+b);
System.out.println("length of a line is : "+length);
}
}
