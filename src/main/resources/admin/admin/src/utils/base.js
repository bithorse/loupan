const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot47q43/",
            name: "springboot47q43",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot47q43/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "早市摊位管理系统小程序"
        } 
    }
}
export default base
