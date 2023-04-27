class Theater
{
public static void main(String[] args)
{
Theater rohini_theatre = new Theater();
rohini_theatre.show(120,5);
}
void show(int ticket_price,int no_of_persons)
{
System.out.println(ticket_price* no_of_persons);
}
}
