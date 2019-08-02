#include <stdio.h>
#include<string.h>
int main() {
	char n,x;
  scanf("%c",&n);
  if(n>=97)
  {
  x=toupper(n);
  printf("%c",x);
  }
  else
  {
    x=tolower(n);
  printf("%c",x);
  }
	return 0;
}