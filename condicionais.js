let peso = 85; 
let altura = 1.68; 
let IMC = peso / (altura * altura);
let grau = 0;

if ( IMC < 18.50 ) {
	console.log(`O seu IMC é ${IMC} e é classificado como Magreza`);
} else if ( IMC < 24.99 ) {
	console.log(`O seu IMC é ${IMC} e é classificado como Normal`);
} else if ( IMC < 29.99 ) {
	console.log(`O seu IMC é ${IMC} e é classificado como Sobrepeso, grau 1`)
	grau = 1;
} else if ( IMC < 39.99) {
 console.log(`O seu IMC é ${IMC} e é classificado como Obesidade, grau 2`)
 grau = 2;
} else {
	console.log(`O seu IMC é ${IMC} e é classificado como Obesidade Grave, grau 3`)
	grau = 3;
};
// console.log(grau)

if (grau > 0) {
	console.log("Cuidado! Você está acima do peso recomendado pela OMS.")
} else if ( grau == 3) {
	console.log("É importante procurar um médico para avaliar sua saúde.")
};
