const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const PI = 3.14159;
const raio = parseFloat(lines.shift());

const area = PI * Math.pow(raio, 2);

console.log("A=" + area.toFixed(4));