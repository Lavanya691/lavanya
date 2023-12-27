/*program for sum of first n natural numbers*/
#include<stdio.h>
void main()
{
    int i,n,s;
    printf("Enter the value of n :");
    scanf("%d",&n);
    i=1;
    while(i<=n){
        s=s+1;
        i=i+1;
    }
    printf("Sum is :%d",s);
}
