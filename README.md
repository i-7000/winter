# winter
这是我们的 第一个项目

项目结构:
 management 模块:  这里面写提供给页面的接口
 model      模块:  这里面定义VO
 service    模块:  这里面写业务

运行file目录下的eureka.jar文件，启动Eureka服务注册中心，然后启动management 和 service中对应的服务，即可以在 http://localhost:7777/ 网页上看到注册的两个服务，点击其中一个服务，将网页地址修改为 http://localhost:7001/swagger-ui.html 即可以在网页上看到接口文档
