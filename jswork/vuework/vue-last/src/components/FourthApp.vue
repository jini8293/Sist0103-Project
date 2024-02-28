<template>
    <div>
        <h1 class="alert alert-info">FourthApp 입니다</h1>
        <!-- <ul>
            <li>{{ fruitArray[0] }}</li>
            <li>{{ fruitArray[1] }}</li>
            <li>{{ fruitArray[2] }}</li>
        </ul> -->

        <li v-for="(fruit, i) in fruitArray" :key="i">{{ fruit }}</li><br>
        <li v-for="(info, inf) in infoArray" :key="inf">{{ info.id+1 }}번 = {{ info.user }}</li>

    </div>
</template>

<script>
export default {
    setup() {

        const fruitArray = ['apple', 'banana', 'orange'];
        const infoArray = [{ id: 0, user: '명수' },
        { id: 1, user: '영식' },
        { id: 2, user: '영철' },
        { id: 3, user: '경수' }];

        return {
            fruitArray,
            infoArray
        }
    }
}
</script>

<style lang="css" scoped></style>