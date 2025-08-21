#include <stdio.h>

int main()
{
    int x = 10;
    int y = 20;
    
    int *px;
    int *py;
    
    px = &x;
    py = &y;
    
    printf("\n x = %d \t px = %p \t *px = %d", x, px, *px);
    printf("\n y = %d \t py = %p \t *py = %d", y, py, *py);
    
    *px = 30;
    printf("\n x = %d \t px = %p \t *px = %d", x, px, *px);
    return 0;
}
