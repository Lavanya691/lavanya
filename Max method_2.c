#include<stdio.h>
void main()
{
    int a,b,max;
    printf("Enter the value of a,b :");
    scanf("%d%d",&a,&b);
    max=(a>b)?a:b;
    printf("max is%d",max);
    /*(a>b)?printf("max is %d",a):printf("max is %d",b);*/
}
