# dbml-from-jooq
Generate [DBML](https://github.com/holistics/dbml) by leverage [JOOQ](https://www.jooq.org/doc/latest/manual/)

对数据库不熟悉？

想要快速画出 E-R 图？

图上最好还要有 Sample data 才能想起来这个字段是什么？

你可以试试用这个工具来快速生成 DBML.

# Pre-requirement
一点点 JOOQ 的知识，知道怎么配置 `jooq-codegen-maven`,并生成代码

# Usage

1. configure JDBC connection in `Jooq-codegen-maven` in `pom.xml`
2. `./mvnw jooq-codegen:generate` to generate `jooq` codes
3. Put tables or records in `Usecase` and run test to generate DBML

> 当然，也可以打包这个成 jar， 现有代码库直接依赖这个工具包，用 `DbmlFromJooqTool` 类去生成就行

# RepoStructure

```
.
├── DbmlFromJooqApplication.kt
├── core
│   ├── BasicRender.kt
│   ├── DbmlFromJooqTool.kt # 工具主入口 !important
│   ├── JooqEnhance.kt
│   ├── Model.kt
│   └── Render.kt
└── demo
    ├── Usecase.kt # 使用案例
    └── generated  # JOOQ生成的代码
```

# 视频讲解

[TODO](https://bilibili.com)
