#include <stdio.h>
// Main function
int main()
{
  int n,m,i,c=0,t;
  scanf("%d %d",&n,&m);
  for(i=1;i<=n && i<=m;i++)
  {
  if(n%i==0 && m%i==0)
  {
    t=i;
    c++;
  }}
 // printf("%d",t);
  printf("%d",(n*m)/t);
  return 0;
}