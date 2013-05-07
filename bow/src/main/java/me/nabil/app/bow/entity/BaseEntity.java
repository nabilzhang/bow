package me.nabil.app.bow.entity;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

@SuppressWarnings("serial")
public class BaseEntity implements Serializable {

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
