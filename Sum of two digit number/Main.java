#include<stdio.h>
int main()
{
 int n,sum,num;
  scanf("%d",&n);
  sum=n%10;
  num=n/10;
  printf("%d",sum+num);
  return 0;
}