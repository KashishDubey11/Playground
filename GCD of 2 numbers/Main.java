// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n,m,i,c=0,t;
  scanf("%d %d",&n,&m);
  for(i=2;i<=n && i<=m;i++)
  {
  if(n%i==0 && m%i==0)
  {
    t=i;
    c++;
  }}
  if(c>0)
  {
  printf("%d",t);
  }
  else
  {
    printf("1");
  }
   return 0;
}