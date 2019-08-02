#include<stdio.h>
int main()
{
  	int n,a[50],pos1,pos2,i,p=-1,p1=-1;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d %d",&pos1,&pos2);
  for(i=0;i<n;i++)
  {
    if(a[i]==pos1 && p==-1)
    {
      p=i;
    }
    if(a[i]==pos2 && p1==-1)
    {
      p1=i;
    }}
    printf("Element 1 index = %d\n",p);
    printf("Element 2 index = %d",p1);
}