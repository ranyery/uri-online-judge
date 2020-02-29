const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const a = parseFloat(lines.shift());
const b = parseFloat(lines.shift());

const produto = a * b;

console.log("PROD = " + produto);