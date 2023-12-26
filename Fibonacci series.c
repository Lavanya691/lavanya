#include<stdio.h>
void main()
{
 int a=-1,b=1,c,n,i;
 printf("Enter the value of n :");
 scanf("%d" ,&n);
 for(i=1;i<=n;i++)
 {
  c=a+b;
  printf("%5d",i);
  a=b;
  b=c;
 }
}
