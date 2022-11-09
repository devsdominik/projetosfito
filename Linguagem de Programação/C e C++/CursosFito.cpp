//Cursos.cpp
#include<dos.h>
#include<iostream.h>
#include<conio.h>
void main()
{
clrscr();
int op;
cout<<"\n            CURSOS na FITO:\n\n";
cout<<"\n            1_Ensino Medio";
cout<<"\n            2_Tec. Administracao";
cout<<"\n            3_Tec. CC";
cout<<"\n            4_Tec. Edificacao";
cout<<"\n            5_Tec. Sistemas";
cout<<"\n            6_Tec. Internet";
cout<<"\n            7_Sair";
cout<<"\n           _________________ ";
cout<<"\n            Qual opcao===>";
cin>>op;

switch(op)
{
  case 1:
       cout<<"\n\nEnsino Medio\nBasico de 3 anos \nMatutino";
       break;
  case 2:
       cout<<"\nTec. Administracao\nCurso de 3 anos\nMatutino e Noturno";
       break;
  case 3:
	cout<<"\nTec. Sistemas\nCurso de 4 anos\nMatutino e Noturno" ;
       break;
case 4:
	cout<<"\nTec. Edificacao\nCurso de 4 anos\nMatutino e Noturno" ;
       break;
  case 5:
       cout<<"\nTec. Des. Sistemas\nCurso de 4 anos\nMatutino e Noturno";
	break;
  case 6:
       cout<<"\nTec. Internet\nCurso de 3 anos\nMatutino e Vespertino";
       break;
  case 7:
       cout<<"\nAguarde...to saindo.....";
       break;
  default:
       cout<<"\nOpcao Invalida";
       }
  cout<<"\n\n\nTecle algo para sair do App....";
  getch();
  }
