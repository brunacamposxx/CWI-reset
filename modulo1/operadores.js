let nomeDoFulano = "Fulano";
let nomeDoBeltrano = "Beltrano";
let mesmoNome = nomeDoFulano == nomeDoBeltrano;
console.log(mesmoNome);

let idade = 16;
let adulto = 18;
let maiorDeIdade = (idade >= adulto);
console.log(maiorDeIdade);

let boleto = 100;
let juros = 1.1;
let valorComJuros = boleto * juros;
console.log(parseFloat(valorComJuros.toFixed(2)));

let item1 = 10;
let item2 = 20;
let item3 = 30;
let item4 = 40;
let item5 = 50;
let mediaAritmetica = (item1 + item2 + item3 + item4 + item5) / 5;
console.log(mediaAritmetica);

let receitaLiquida = 50;
let custoProduto = 30;
let lucroBruto = receitaLiquida - custoProduto;
console.log(lucroBruto);
let margemBruta = (lucroBruto / receitaLiquida) * 100;
console.log(`${margemBruta}%`);

let saldoInicial = 1000;
let calca = 99.90;
let saldo = saldoInicial - calca;
console.log(saldo); 
let salario = 2500;
saldo = saldo + salario;
console.log(saldo);
let doacao = 0.1;
saldo = saldo - doacao;
console.log(saldo);
let arCondiconado = 0.75;
saldo = saldo * arCondiconado;
console.log(saldo);
saldo = saldo / 2;
console.log(saldo);
let saldoFinal = saldo;
console.log(saldoFinal);
