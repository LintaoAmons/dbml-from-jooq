# dbml-from-jooq
Generate [DBML](https://github.com/holistics/dbml) by leverage [JOOQ](https://www.jooq.org/doc/latest/manual/)

对数据库不熟悉？

想要快速画出 E-R 图？

图上最好还要有 Sample data 才能想起来这个字段是什么？

你可以试试用这个工具来快速生成 DBML.

# Pre-requirement
一点点 JOOQ 的知识，知道怎么配置 `jooq-codegen-maven`,并生成代码

# Usage

```java
@Test
void generate_dbml_from_integration_test() {
    System.out.println(new DbmlFromJooqTool(dslContext).generate(Arrays.asList(
            Tables.PERSON_INFO,  // This Tables class is generated by jooq
            Tables.AMOUNT_INFO)
    ));
}
```
You need download the jar from release page, and put the jar file in maven local repository, then in the `pom.xml`

```xml  
<dependency>
    <groupId>top.oatnil</groupId>
    <artifactId>dbml-from-jooq</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```
