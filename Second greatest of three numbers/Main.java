#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  if((a>b && a<c) || (a>c && a<b))
  {
    printf("%d",a);
  }
  if((b>c && b<a) || (b>a && b<c))
  {
    printf("%d",b);
  }
  if((c>b && c<a) || (c>a && c<b))
  {
    printf("%d",c);
  }
}