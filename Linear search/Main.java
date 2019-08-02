#include<stdio.h>
int main()
{
 int n,a[50],p,i,pos,c=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&p);
  for(i=0;i<n;i++)
  {
    if(a[i]==p)
    {
      pos=i;
      printf("%d",pos+1);
      ++c;
      break;
    }
  }
  if(c==0)
  {
      printf("%d isn't present in the array.",p);
  }
  return 0;
}