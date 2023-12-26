/*program for prime or not*/
#include<stdio.h>
void main()
{
    int n,i,c=1;
    printf("Enter the n value:");
    scanf("%d",&n);
    for(i=2;i<n;i++)
    if(n%i==0){
        c=0;
        break;
    }
    if(c)
        printf("the given number is prime");
    else
        printf("The given number is not prime number");
}
