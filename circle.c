/*Program for area of a circle*/
#include<stdio.h>
#include<math.h>
void main(){
    float r, area;
    printf("Enter radius of a circle : ");
    scanf("%f", &r);
    /*area = 3.14 * r *r;*/
    area = 3.14 * pow(r,2);
    printf("Area of a circle is : %0.2f", area);
}

/*x = sqrt(no);*/
