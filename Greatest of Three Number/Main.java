#include <stdio.h>

int main()
{ 
    int a,b,c;
  char u,t;
  scanf("%d %c %d %c %d",&a,&u,&b,&t,&c);
  if(b>a && b>c)
  {
   printf("%d",b);
  }
  if(c>a && c>b)
  {
   printf("%d",c);
  }
   if(a>b && a>c)
  {
   printf("%d",a);
  }
  return 0;
}