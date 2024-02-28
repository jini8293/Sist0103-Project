<template>
  <div>
    <div class="menu">
      <!-- <a v-for="header in 3" :key="header">Home</a> -->
      <!-- <a v-for="menu in menus" :key="menu">{{ menu }}</a> -->
      <a v-for="(menu, i) in menus" :key="i">{{ menu }}</a>
    </div>

    <div class="celeb" v-for="(agency, key) in agencys" :key="key">
      <img :src="agency.imgSrc">
      <h3>{{ agency.name }}</h3>
      <p>소속사: {{ agency.company }}</p>
      <button v-on:click="onClicklikes(key)">♥</button>
      <span>{{ agency.likes }}</span>
    </div>

  </div>
</template>

<script>
export default {
  data() {


    return {
      menus: ['Home', 'Celeb', 'About'],
      agencys: [{ name: '여진구', company: '하이브', likes: 0, imgSrc: require('./assets/images/1.jpg') },
      { name: '최지우', company: 'JYP', likes: 0, imgSrc: require('./assets/images/5.jpg') },
      { name: '박보영', company: 'YG', likes: 0, imgSrc: require('./assets/images/12.jpg') },
      { name: '박신혜', company: 'SM', likes: 0, imgSrc: require('./assets/images/13.jpg') },
      { name: '유아인', company: '하이브', likes: 0, imgSrc: require('./assets/images/20.jpg') }],

    }

  },
  methods: {
    onClicklikes(num){
      this.agencys[num].likes++
    }
  }
}
</script>

<style lang="css" scoped>
.menu {
  background-color: antiquewhite;
  padding: 10px;
  border-radius: 5px;
}

.menu a {
  color: rgb(129, 158, 71);
  padding: 10px;
  font-family: Gowun Dodum;
}

.celeb img {
  width: 200px;
  border-radius: 30px;
}

.celeb p,
h3 {
  font-family: Gowun Dodum;
  font-weight: bold;
}
</style>