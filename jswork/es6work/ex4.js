let arr1 = [2,3,6];
let arr2= [6,7];
let arr3 = [11,12,...arr1,44,...arr2];

console.log(arr3.length); //8
console.dir(arr3); //구조 

let arr4 = [...[100,200],...arr2];
console.log(arr4.length);
console.dir(arr4);
console.log(arr4);

function fsum(arr){
    let sum = 0;
    //방법 1
    // for(i=0;i<arr.length;i++){
    //     sum +=arr[i];
    // }

    //방법 2
    for(let a in arr){
        sum+=arr[a];
    }
    console.log("합ㄱㅖ: "+sum);
}

fsum(arr3);

function func3(a,b,c,e,f){
    console.log(a,b,c,e,f);


}
//arr3를 인자로 보내서 호출해 보세요
func3(...arr3);
