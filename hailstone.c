#include <stdio.h>

void main(){
    int num;
    printf("Enter number: ");

    scanf("%d", &num);

    while(num>1){
        if(num%2==0){
            num = num/2;
        }else{
            num = num*3 + 1;
        }
        printf("%d ", num);
    }
}