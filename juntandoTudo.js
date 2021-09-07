colaboradores    = ['Rhoger', 'Cléverson', 'Gleysberto', 'Nádio', 'Rosiméri', 'Regislane', 'Agripino', 'Wellison']
idades           = [      69,          66,           58,      61,         60,          64,         59,         55]
temposDeTrabalho = [      31,          29,           30,      26,         25,          24,         26,         29]


function verificarAposentadoria(nome){

	colaborador = false;
	idade = 0;
	tempoTrabalho = 0;

	for(index = 0; index < colaboradores.length; index +=1){
		
		if(nome == colaboradores[index]) {
			colaborador = true;
			idade = idades[index];
			tempoTrabalho = temposDeTrabalho[index];
		};
	};

	if(colaborador){

		if(idade >= 65 || tempoTrabalho >= 30 || idade >= 60 && tempoTrabalho >= 25){
			console.log("Parabéns, já pode sair de férias eternas :)");
		} else {
			console.log("Infelizmente para você, ainda falta um tempo :(")
		}
	} else {
		console.log("Colaborador invalido :|");
	}
};



verificarAposentadoria('Rosiméri')    // true (regra 3)
verificarAposentadoria('Agripino')    // false (falta 1 ano de idade para regra 3)
verificarAposentadoria('Rhoger')      // true (todas)
verificarAposentadoria('Hudnélson')   // false (colaborador inexistente)
verificarAposentadoria('Gleysberto')  // true (regra 2)
verificarAposentadoria('Regislane')   // false (falta 1 ano de idade para regra 1 e 1 de trabalho para regra 3)
verificarAposentadoria('Cléverson')   // true (regras 1 e 3)
verificarAposentadoria('Nádio')       // true (regra 3)
verificarAposentadoria('Wellison')    // false (falta 1 ano de trabalho para regra 2)
verificarAposentadoria('Florisberto') // false (colaborador inexistente)