#include<stdio.h>
#include<math.h>
int main()
{
  int n,x;
  scanf("%d",&n);
  if(n%2==0)
  {
    x=pow(3,(n/2)-1);
    printf("%d",x);
  }
  if(n%2!=0)
  {
    x=pow(2,n/2);
    printf("%d",x);
  }
  return 0;
}