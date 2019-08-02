#include <stdio.h>
int main() {
  int n,temp,x,i,fact=1,sum=0;
  scanf("%d",&n);
  temp=n;
  while(n>0)
  {
  x=n%10;
    fact=1;
	for(i=1;i<=x;i++)
  {
    fact=fact*i;
  }
    sum=sum+fact;
    n=n/10;
  }
 if(sum==temp)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
  //printf("%d",sum);
	return 0;
}