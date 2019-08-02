#include<stdio.h>
#include<math.h>
int main()
{
  int n,x,y,sum=0,c=0,z,bin=0,i=1;
  scanf("%d",&n);
  while(n>0)
  {
    x=n%10;
    y=x*pow(2,c);
    n=n/10;
    sum=sum+y;
    c++;
}
  while(sum>0)
  {
    z=sum%8;
    sum=sum/8;
    bin=bin+(z*i);
    i=i*10;
  }
  printf("%d",bin);
}
