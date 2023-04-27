class LogicalPrograms
{

public static void main(String[] args)
{
LogicalPrograms lp = new LogicalPrograms();
lp.find_divisors(10);

}
void find_divisors(int no)
{
int div =1;
while(div<=no)
{
if(no%div == 0)
{
System.out.println(div);
}
div = div +1;
}
}
}	
