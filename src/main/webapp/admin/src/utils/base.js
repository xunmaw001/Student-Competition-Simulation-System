const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm4x1nt/",
            name: "ssm4x1nt",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm4x1nt/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "学生竞赛模拟系统"
        } 
    }
}
export default base
