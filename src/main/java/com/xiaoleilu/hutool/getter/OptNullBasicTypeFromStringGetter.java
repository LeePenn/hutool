package com.xiaoleilu.hutool.getter;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.xiaoleilu.hutool.lang.Conver;

/**
 * 基本类型的getter接口抽象实现，所有类型的值获取都是通过将String转换而来<br>
 * 用户只需实现getStr方法即可，其他类型将会从String结果中转换
 * 在不提供默认值的情况下， 如果值不存在或获取错误，返回null<br>
 * @author Looly
 */
public abstract class OptNullBasicTypeFromStringGetter extends OptNullBasicTypeGetter{
	
	@Override
	public abstract String getStr(String key, String defaultValue);
	
	@Override
	public Object getObj(String key, Object defaultValue) {
		return getStr(key, null == defaultValue ? null : defaultValue.toString());
	}
	
	@Override
	public Integer getInt(String key, Integer defaultValue) {
		return Conver.toInt(getStr(key), defaultValue);
	}

	@Override
	public Short getShort(String key, Short defaultValue) {
		return Conver.toShort(getStr(key), defaultValue);
	}

	@Override
	public Boolean getBool(String key, Boolean defaultValue) {
		return Conver.toBool(getStr(key), defaultValue);
	}

	@Override
	public Long getLong(String key, Long defaultValue) {
		return Conver.toLong(getStr(key), defaultValue);
	}

	@Override
	public Character getChar(String key, Character defaultValue) {
		return Conver.toChar(getStr(key), defaultValue);
	}
	
	@Override
	public Float getFloat(String key, Float defaultValue) {
		return Conver.toFloat(getStr(key), defaultValue);
	}

	@Override
	public Double getDouble(String key, Double defaultValue) {
		return Conver.toDouble(getStr(key), defaultValue);
	}

	@Override
	public Byte getByte(String key, Byte defaultValue) {
		return Conver.toByte(getStr(key), defaultValue);
	}

	@Override
	public BigDecimal getBigDecimal(String key, BigDecimal defaultValue) {
		return Conver.toBigDecimal(getStr(key), defaultValue);
	}

	@Override
	public BigInteger getBigInteger(String key, BigInteger defaultValue) {
		return Conver.toBigInteger(getStr(key), defaultValue);
	}
}
