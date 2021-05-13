public class Numbers{
public static void main(String[] args){
Numbers obj = new Numbers();
obj.methed();
}
public void methed(){
int row=1,column=1;
int x;
do{
x=6;
do{
System.out.print("");
x--;
}while(x>=row);
column=1;
do{
System.out.print(column+" ");
column++;
}while(column<=row);
System.out.println(" ");
row++;
}while (row<=6);
}
}