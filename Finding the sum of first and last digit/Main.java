#include <stdio.h>
int main() {
  int n,y,sum=0;
	scanf("%d",&n);
  y=n%10;
  while(n>10)
  {
    n=n/10;
  }
  sum=n+y;
  printf("%d",sum);
	return 0;
}