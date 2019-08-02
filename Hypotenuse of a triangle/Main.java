#include<stdio.h>
#include<math.h>
int main()
{
 float x,y,h,s;
  scanf("%f %f",&x,&y);
  h=(x*x)+(y*y);
  s=sqrt(h);
  printf("%.2f",s);
  return 0;
}