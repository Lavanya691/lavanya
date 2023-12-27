#include<stdio.h>
void main()
{
int m,n,s,gcd=1,i;
printf("Enter the values of m,n :");
scanf("%d%d",&m,&n);
if(m<n)
    s=m;
else
    s=n;
for(i=1;i<=s;i++)
if(m%i==0 && n%i==0)
 gcd=i;
printf("gcd is : %d",gcd);
}
