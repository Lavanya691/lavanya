/*program of digit sum by using WHILELOOP*/
#include<stdio.h>
void main()
{
    int i,n,r,s=0;
    printf("Enter the value of n :");
    scanf("%d",&n);
    while(n!=0){
        r=n%10;
        s=s+r;
        n=n/10;
    printf("digit sum is :%d",s);
    }
}
