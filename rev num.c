/*program for reverse number*/
#include<stdio.h>
void main()
{
    int s=0,n,r;
    printf("Enter the value of n:");
    scanf("%d",&n);
    while(n!=0){
        r=n%10;
        s=s*10+r;
        n=n/10;
        }
    printf("Reverse Number is :%d",s);
    }
