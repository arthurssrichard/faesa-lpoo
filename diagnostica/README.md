# faesa-lpoo  
## Versão simples sem muito polimento de uma avaliação diagnóstica da faculdade
## Feito baseado nas orientações a seguir:

Suponha que você queira fazer um aplicativo para uma clínica.
Construa duas classes (Paciente e VetPaciente), conforme
especificado a seguir:
a) Paciente que possui os seguintes atributos:
● nome
● CPF
● Data de Nascimento (pode ser String)
● Histórico

Os seguintes métodos:
● construtor, gets, sets (somente para nome e histórico)
● ToString, com as informações: nome, cpf e data de nascimento em
uma linha e histórico na linha de baixo

b) VetPaciente que possui os seguintes atributos:
● vet que é um vetor de Paciente.
● nElem que contém a quantidade de Pacientes que estão
armazenados no vetor.

Os seguintes métodos:
● construtor, getNElem
● getPaciente que recebe uma posição e retorna o paciente
desta posição ou null se a posição for inválida.
● pesquisa que recebe o cpf do paciente e retorna a posição do
paciente que tem este cpf ou -1, se não encontrar.
● insere que recebe um Paciente e insere na primeira posição
vazia do vetor. Se o vetor estiver cheio retorna -1, se o
paciente já foi cadastrado retorna -2 e, se a operação foi bem
sucedida, retorna 0.

remove que recebe o CPF de um Paciente e remove-o do
vetor. Se o paciente não existir, retorna false. Se a operação
for bem sucedida retorna true.

c) AppClinica que é um aplicativo que cria um cadastro de
pacientes e tenha o seguinte menu:
1 – Cadastrar
2 – Consultar
3 – Imprimir Cadastro
4 – Sair

O app deverá ser constituído de métodos.
Observe que na opção 2 - Consultar você deve pedir o CPF do
paciente e mostrar na tela nome, CPF e data de nascimento em
uma linha e o Histórico em outra linha. Se o paciente não existir,
você deve apresentar uma mensagem de erro.
Observe que na opção 3 - Imprimir Cadastro você deve mostrar na
tela nome, CPF e data de nascimento de cada paciente, um por
linha.
