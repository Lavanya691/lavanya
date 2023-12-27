/* program for student report*/
#include<stdio.h>
void main()
{
    int m,p,c,total;
    float avg;
    char name[5];
    printf("Enter the student name:");
    scanf("%d",&name);
    printf("Enter the student marks:");
    scanf("%d%d%d",&m,&p,&c);
    total=m+p+c;
    avg=total/3.0;
    if (m >=35 && p >= 35 && c >=35){
    if(avg>=60)
            printf("the student is First class");
    else
        if(avg>=50)
           printf("the student is Second class");
        else
           printf("the student is Third class");
}
        else
           printf("the student is failed");
        printf("\nMarks are : %d %d %d",m,p,c);
        printf("\nTotal is : %d",total);
        printf("\nAverage is :%0.2f",avg);


}
