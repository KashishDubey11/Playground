#include<stdio.h>
int main()
{
	int n,x;
  scanf("%d",&n);
  if(n%2!=0)
  {
    x=2*(n/2);
    printf("%d",x);
  }
  else
  {
    x=(n/2)-1;
    printf("%d",x);
  }
}