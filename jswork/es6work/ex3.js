//함수 파라미터에 기본값 가능하다
function func1(x,y=100,z=200){
    console.log(x,y,z);
}

func1(3,5,8);
func1(58); // 58,100,200
func1(2,5); // 2,5,200
func1(); 

function func2(a,b){
    return a+b;
}

console.log(func2(3,4)); //7

let l1 = func2(5,6);
console.log(l1);

//배열
let arr = [2,5,7];
let l2=func2(arr[0],arr[1]);
console.log(l2);

//...es6에서 추가된 기능 펼침 연산자
func1(...arr); //2,5,7
func1(arr[0],arr[1],arr[2]);

let l3 = func2(...arr); //앞의 2개값 들어간다
console.log(l3);