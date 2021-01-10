
alert("Para saber cuantos dias de vida tienes, multiplica tu edad por 365 dias del año");
var diasVida = parseInt(prompt("Ingrese tus dias de vida",""));

var numAnos = Math.floor(diasVida / 365);  //Math.floor Sirbe para redondear el numero y que no de decimales
var diasRestantes = diasVida - (numAnos * 365);
var numMeses = Math.floor(diasRestantes / 30);
diasRestantes = diasRestantes - (numMeses * 30);

alert("Has vivido " + numAnos + " Años, " + numMeses + " Meses y " + diasRestantes + " dias. ");