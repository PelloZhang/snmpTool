package com.prince.snmp.tool.o2p;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ���ڶ���һ��POJO������ֶζ�Ӧ��MIB�е�OID
 * @author wangzijian
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Oid {
	String oid();
}
