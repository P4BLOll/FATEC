#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x, y = 10;
    double r;
    
    printf("Digite um número");
    scanf("%d", &x);
    
    r = x/y;
    
    printf("\n Resultado da divisão de %d por %d = %.2f" , x, y, r);
    system("PAUSE");

    return 0;
}