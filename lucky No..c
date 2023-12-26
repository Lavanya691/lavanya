/*program for lucky number*/
#include<stdio.h>
void main()
{
    int s=0,n,r;
    printf("Enter the value of n:");
    scanf("%d",&n);
    while(n!=0){
        r=n%10;
        s=s+r;
        n=n/10;

        if(n==0 && s>9){
            n=s;
            s=0;
        }
    }
    printf("Lucky number is :%d",s);
}
