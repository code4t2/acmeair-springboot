# Acme Air 示例应用及性能测试

本应用展示了一个名为"Acme Air"的虚拟航空公司的在线服务。该服务满足了如下的关键业务需求：每天能处理十亿级别的web API访问量，能在公有云上开发及部署(而非专有的、预先分配好的资源)，支持多种渠道的用户交互(移动App及传统浏览器/Web 2.0访问)。

目前应用有2个采用不同语言框架的实现。每种实现都支持多种数据层，包括：
- **Node.js语言**
  - MongoDB
  - Cloudant
- **Java语言**
  - WebSphere Liberty Profile，数据层采用WebSphere eXtreme Scale
  - WebSphere Liberty Profile，数据层采用Mongodb
  - **Spring Boot，数据层采用Mongodb** (当前代码仓库的实现)

## 仓库的内容

源码结构:

- **acmeair-common**: 应用的Java实体类(模型)
- **acmeair-loader**:  用于加载数据的工具(用Java实现)
- **acmeair-services**:  Java数据服务层的接口定义
- **~~acmeair-service-wxs~~**:  基于WebSphere eXtreme Scale的数据服务实现(SpringBoot版本未支持)
- **acmeair-service-morphia**:  基于Mongodb的数据服务实现
- **acmeair-webapp**:  Web 2.0应用及相关的Java REST服务


## 如何开始

* [配置及构建代码](Documentation/Build_Instructions.md)的介绍
* 将示例应用部署至[Websphere Liberty](Documentation/Liberty_Instructions.md)
* 在Websphere Liberty Profile中采用[MongoDB指南](Documentation/Liberty_to_Mongo_Instructions.md)
* 部署至[IBM Bluemix](Documentation/Bluemix_Instructions.md)
* Acme Air (Node.js版) [指南](https://github.com/acmeair/acmeair-nodejs/blob/master/README.md)
* 通过[添加更多数据服务](Documentation/Extending_AcmeAir_Services.md)来扩展Acme Air应用
* --
* 部署[Spring Boot版](Documentation/SpringBoot_Instructions.md)的Acme Air示例应用
* Spring Boot采用[MongoDB指南](Documentation/SpringBoot_to_Mongo_Instructions.md)

## 问题

有关Acme Air开源项目的问题可以去我们的Google讨论组中讨论。

* Acme Air用户组: [https://groups.google.com/forum/?fromgroups#!forum/acmeair-users](https://groups.google.com/forum/?fromgroups#!forum/acmeair-users)

## 提交bug报告

我们使用Github issue来追踪及处理bug报告。

## 开源贡献

我们接受通过pull请求(pull requests)提交的贡献代码。

本项目遵循CLA许可，具体条款可见 [CLAs目录](CLAs)。
