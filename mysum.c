#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(int argc, char *argv[])
{
	int a,b, result;
	char opr;
	
	a = atoi(argv[1]);
	b = atoi(argv[3]);
	
	opr=argv[2][0];
	switch(opr)
	{
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		default:
			result=0;
			break;
	}
	
	if(opr=='+' || opr=='-')
		printf("Result: %d %c %d = %d\n",a,opr,b,result);
	
	return 0;
}