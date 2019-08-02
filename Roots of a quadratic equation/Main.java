#include<stdio.h>
#include<math.h>
int main()
{
 float a,b,c,d,ans,ans2,d1;
  scanf("%f %f %f",&a,&b,&c);
  d=((b*b)-(4*a*c));
  d1=sqrt(d);
  if(d>0)
  {
    ans=(-b+d1)/(2*a);
    ans2=(-b-d1)/(2*a);
    printf("root1 = %.2f  root2 = %.2f",ans,ans2);
  }
   if(d==0)
  {
    ans=(-b)/2*a;
    printf("root1 = %.2f  root2 = %.2f",ans,ans);
  }
  if(d<0)
  {
    ans=(-b)/(2*a);
    ans2=sqrt((-d))/(2*a);
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",ans,ans2,ans,ans2);
  }
}