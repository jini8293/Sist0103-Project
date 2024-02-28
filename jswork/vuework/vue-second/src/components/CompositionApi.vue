<template>
    <div>
        <h1 class="alert alert-success">CompositionApi입니다</h1>
        <h3>Counter:{{ counter }}</h3>
        <button v-on:click="numIncre">증가</button>
        <button @click="numDecre">감소</button>
    </div>
</template>

<script>
import { ref } from 'vue';

export default {
    setup () {
        
        const counter=ref(0);
        const numIncre=()=>counter.value++;
        const numDecre=()=>counter.value--;

        return {
            counter,
            numIncre,
            numDecre
        }
    }
}
</script>

<style lang="css" scoped>

</style>