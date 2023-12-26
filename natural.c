/*program for printing n natural numbers by usingwhile loop
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

}*/


/*program for n natural numbers by using dowhile loop*/
#include<stdio.h>
void main()
{
    int i,n;
    printf("Enter the n value:");
    scanf("%d",&n);
    i=1;
    do{
        printf("%5d",i);
        i=i+1;
}
while(i<=n);
}

