# dbml-from-jooq
Generate DBML(database markdown language with easy) by leverage JOOQ

对数据库不熟悉？

想要快速画出 E-R 图？

图上最好还要有 Sample data 才能想起来这个字段是什么？

你可以试试用这个工具来快速生成 DBML.

# Pre-requirement
一点点 JOOQ 的知识，知道怎么配置 `jooq-codegen-maven`,并生成代码

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
