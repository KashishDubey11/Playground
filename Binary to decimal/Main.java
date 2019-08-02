#include<stdio.h>
#include<math.h>
int main()
{
 int n,c=0,x,y,sum=0;
  scanf("%d",&n);
  while(n>0)
  {
    x=n%10;
    y=x*pow(2,c);
    sum=sum+y;
    n=n/10;
    ++c;
  }
  printf("%d",sum);
  return 0;
}