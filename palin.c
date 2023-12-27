/*program for palindrome number*/
#include<stdio.h>
void main()
{
    int s=0,n,m,r;
    printf("Enter the value of n:");
    scanf("%d",&n);
    m=n;
    while(n!=0){
        r=n%10;
        s=s*10+r;
        n=n/10;
        }
    if(m ==s)
        printf("The given number is palindrom");
    else
    printf("The given number is not palindrome");
}
