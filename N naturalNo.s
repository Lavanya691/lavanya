/*program of printing first n natural numbers by using while loop*/
#include<stdio.h>
void main()
{
    int n,i;
    printf("Enter the value of n :");
    scanf("%d",&n);
    i=1;
    while(i<=n)
    {
        printf("\t%d",i);
        i=i+1;
    }

}



