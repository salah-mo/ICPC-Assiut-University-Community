#include <bits/stdc++.h>
 
using namespace std;
 
int O()
{
    int number1 , number2;
	char operation;
	cin >> number1 >> operation >> number2;
 
	if(operation == '+')
		cout << number1 + number2;
	else if(operation == '-')
		cout << number1 - number2;
	else if(operation == '*')
		cout << number1 * number2;
	else if(operation == '/')
		cout << number1 / number2;
 
	return 0;
}
