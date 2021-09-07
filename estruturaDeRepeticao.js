 let num = 0;
 while(num <= 10){
 	console.log(num++);
};

// ou

do{
	console.log("o do imprime primeiro e depois verifica a condição")
}while(num <= 10);

// ou

for ( index = 0; index <= 10; index +=1) {
	console.log(index);
};

// Crie um array de 5 posições com quaisquer valores. Utilize qualquer estrutura de repetição apresentada no vídeo para exibir todos os valores do array;

let array = [ "posicao1", "posicao2", "posicao3", "posicao4", "posicao5"];

for( index = 0; index < array.length; index += 1) {
	console.log(array[index]);
};

// Crie um algoritmo capaz de calcular a média aritmética de um array com qualquer quantidade de elementos numéricos. Para fins de exemplo, o resultado do algoritmo com um array de valores 1, 2, 3, 5, 8, 13, 21, 23, 34, 55 deve ser 16.5. Procure usar uma estrutura de repetição diferente da que você usou para fazer o exercício anterior;


let arrayNum = [1, 2, 3, 5, 8, 13, 21, 23, 34, 55];
let soma = 0;
for(index = 0; index < arrayNum.length; index +=1){
	soma += arrayNum[index]
	// console.log(soma)
};

media = soma / arrayNum.length
console.log(media);



// Considerando a lista dos 60 nomes mais comuns no Brasil nos últimos 10 anos, crie um algoritmo para verificar se seu nome está lá. Se sim, exiba a mensagem: É, nome comum :P. Se não, exiba a mensagem: Diferentão, hein? XD.

let nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"]

const meuNome = "xablau";
let nomeComum = false;


for( index = 0; index < nomesComuns.length; index +=1){
	if ( meuNome === nomesComuns[index] ) {
		nomeComum = true;
		console.log("setei para true")
		break
	}
};

if(nomeComum){
	console.log("É, nome comum :p")
} else {
	console.log("Diferentão, hein? XD")
}