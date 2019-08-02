#include <stdio.h>
#include<math.h>
int main()
{
  	int x,y,ans;
  scanf("%d %d",&x,&y);
  ans=pow(x,y);
  if(y<0)
  {
    printf("Wrong input");
  }
  else
  {
  printf("%d",ans);
  }
    return 0;
}