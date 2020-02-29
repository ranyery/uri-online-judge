const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const a = parseFloat(lines.shift());
const b = parseFloat(lines.shift());
const c = parseFloat(lines.shift());

const media = (a * 2 + b * 3 + c * 5) / 10.0;

console.log("MEDIA = " + media.toFixed(1));