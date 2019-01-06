# FastWeb

`fastweb-archetype`是一个快速构建多模块SSM Web项目的maven脚手架。

## 项目结构

    |-- pom.xml                    -- 父级POM
    |-- profiles                   -- 各环境配置文件
    |-- sql                        -- sql脚本存储目录
    |-- {artifactId}-common        -- 通用工具模块
    |--|-- src/main/java
    |--|-- src/main/resources
    |--|-- src/test/java
    |--|-- src/test/resources
    |-- {artifactId}-service       -- 服务模块，依赖common模块
    |--|-- src/main/java
    |--|-- src/main/resources
    |--|-- src/test/java
    |--|-- src/test/resources
    |-- {artifactId}-web           -- web模块，依赖service模块
    |--|-- src/main/java
    |--|-- src/main/resources
    |--|-- src/main/webapp
    |--|-- src/test/java
    |--|-- src/test/resources

## 安装

将`fastweb-archetype`安装到本地maven仓库：

    mvn clean install

## 使用

使用`mvn archetype:generate`来创建maven web工程，其中：`-DgrouopId`，`-DartifactId`，`-Dversion`分别为新项目的maven坐标。

    mvn archetype:generate 
    -DgroupId=com.beiluve 
    -DartifactId=demo 
    -Dversion=0.0.1-SNAPSHOT
    -DarchetypeGroupId=com.beiluve 
    -DarchetypeArtifactId=fastweb-archetype 
    -DarchetypeVersion=0.0.1 
    -DarchetypeCatalog=local