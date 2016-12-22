http://www.mkyong.com/spring/spring-aop-transaction-management-in-hibernate/

Transaction management is required to ensure the data integrity and consistency in database. Spring’s AOP technique is allow developers to manage the transaction declarative.

Here’s an example to show how to manage the Hibernate transaction with Spring AOP.

P.S Many Hibernate and Spring configuration files are hidden, only some important files are shown. Or do it yourself as a practice.

Note: spring事务回滚.默认情况,unchecked异常,即运行时异常runntimeException回滚事务;checked异常,即Exception可try{}捕获的不会回滚.
可以配置spring参数让其回滚.