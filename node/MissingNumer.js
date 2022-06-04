let array = [8,9,15,17,16,13,14,10,11];

let s = array.length +1;
let min=array[0];
for(let j=1;j<array.length;j++){
    if(min>array[j]){
        min= array[j];
    }
}
let total =((min-1)*10) + (s*(s+1))/2;

for(let i=0;i<array.length;i++){
    total -= array[i];
}

console.log("MissingNumber : "+total);