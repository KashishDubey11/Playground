#include<stdio.h>
int main()
{
  char a[50],i,c;
  scanf("%[^\n]s",a);
  for(i=0;a[i]!='\0';i++)
  {
    if(a[i]==' ')
    {
      c++;
    }
  }
  printf("%d",c+1);
  
}