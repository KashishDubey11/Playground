#include<stdio.h>
int main()
{
  int n,x,i=1,binary=0;
  scanf("%d",&n);
  while(n>0)
  {
  x=n%8;
  n=n/8;
    binary=binary+(x*i);
    i=i*10;
  }
    printf("%d",binary);
  return 0;
}