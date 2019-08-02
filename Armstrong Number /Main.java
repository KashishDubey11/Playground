#include <stdio.h>
int main() {
  int n,x,y,sum=0,temp;
	scanf("%d",&n);
  temp=n;
  while(n>0)
  {
    x=n%10;
    y=x*x*x;
    sum=sum+y;
    n=n/10;
  }
if(temp==sum)
  {
  printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}