#include<stdio.h>
int main()
{
  int n,x,i=1,binary=0;
  scanf("%d",&n);
  while(n>0)
  {
  x=n%2;
  n=n/2;
    binary=binary+(x*i);
    i=i*10;
  }
    printf("%d",binary);
  return 0;
}