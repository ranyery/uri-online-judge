const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const a = parseFloat(lines.shift());
const b = parseFloat(lines.shift());

const soma = a + b;

console.log("SOMA = " + soma);