#include <stdio.h>
int main() {
  int n,y;
	scanf("%d",&n);
  while(n>=100)
  {
  n=n/10;
  }
  if(n<100)
  {
    y=n%10;
  }
  printf("%d",y);
	return 0;
}