import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import weiguichuli from '@/views/modules/weiguichuli/list'
    import news from '@/views/modules/news/list'
    import tanwei from '@/views/modules/tanwei/list'
    import tanweiyuyue from '@/views/modules/tanweiyuyue/list'
    import tanzhu from '@/views/modules/tanzhu/list'
    import tousuyijian from '@/views/modules/tousuyijian/list'
    import jiedaoquyu from '@/views/modules/jiedaoquyu/list'
    import tanweileixing from '@/views/modules/tanweileixing/list'
    import shichangguanliyuan from '@/views/modules/shichangguanliyuan/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/weiguichuli',
        name: '违规处理',
        component: weiguichuli
      }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/tanwei',
        name: '摊位',
        component: tanwei
      }
      ,{
	path: '/tanweiyuyue',
        name: '摊位预约',
        component: tanweiyuyue
      }
      ,{
	path: '/tanzhu',
        name: '摊主',
        component: tanzhu
      }
      ,{
	path: '/tousuyijian',
        name: '投诉意见',
        component: tousuyijian
      }
      ,{
	path: '/jiedaoquyu',
        name: '街道区域',
        component: jiedaoquyu
      }
      ,{
	path: '/tanweileixing',
        name: '摊位类型',
        component: tanweileixing
      }
      ,{
	path: '/shichangguanliyuan',
        name: '市场管理员',
        component: shichangguanliyuan
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
