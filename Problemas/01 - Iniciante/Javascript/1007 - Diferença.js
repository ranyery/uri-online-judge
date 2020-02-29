const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const a = parseInt(lines.shift());
const b = parseInt(lines.shift());
const c = parseInt(lines.shift());
const d = parseInt(lines.shift());

const diferenca = a * b - c * d;

console.log("DIFERENCA = " + diferenca);