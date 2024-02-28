//화살표 함수 : 일반함수와의 차이점: 객체 생성안됨, new로 사용 못함
//자바 Ramda(익명 함수)와 같은 방식 (function 키워드 대신 ()와 화살표 사용해서 기존보다 간단히 함수를 정의)

//일반함수
function f1(){
    console.log("일반함수 f1");
}
f1();

//화살표
let f2 = ()=>console.log("화살표 함수 f2");
f2();

//일반
function f3(a,b){
    return a+b;
}

let a = f3(5,7);
console.log(a);

//화살표
let f4=(a,b)=>a+b; // 한줄일땐 리턴 생략 가능
let b = f4(11,13);
console.log(b);

//일반
function f5(x,y,z=30){
    return x+y+z;
}
console.log(f5(1,2,3)); //6
console.log(f5(10,20)); //60

let f6 = (x,y,z=30)=>x+y+z;
let c = f6(1,2,3);
let d = f6(10,20);
console.log(c); //6
console.log(d); //60

//오브젝트 함수를 객체로 만들수도 있다

let ob = {
    f1 : ()=>{
        console.log(1);

        let f2=()=>console.log(2);
        
    }
}