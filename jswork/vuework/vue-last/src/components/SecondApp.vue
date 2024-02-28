<template>
    <div>
        <h1 class="alert alert-info">SecondApp 입니다</h1>
        <span>{{counter}}</span><br><br>
        <button @click="countIncre">숫자 증가</button><br><br>
        <h2>{{message}}</h2><br>
        <button v-on:click="rmsg">'?' 메세지 증가</button>
    </div>
</template>

<script>
import {ref } from 'vue';
export default {
    setup () {

        const counter = ref(0);
        const countIncre=()=>{
            counter.value++;
        }
        
        const message = ref("하이 뷰?");
        const rmsg = () => {
            message.value = message.value + "?";
        }
        return {
            counter,
            countIncre,
            message,
            rmsg
        }
    }
}
</script>

<style lang="scss" scoped>

</style>