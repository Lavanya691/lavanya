/*max of three numbers using if-else statements*/
#include<stdio.h>
void main()
{
    int a, b, c, max;
    printf("Enter the values of a,b,c: ");
    scanf("%d%d%d" ,&a,&b,&c);
    if(a>b,a>c)
      max=a;
    else
        if(b>c)
          max=b;
    else
        max=c;
    printf("Max number is :%d",max);
}
