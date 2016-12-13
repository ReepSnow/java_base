package cn.snow.beanutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

public class BeanUtilMy {
	
	public static <T> T copy(Class<T> destination, Object source){
		
		try {
			ConvertUtils.register(new Converter(){

				public Object convert(Class type, Object value) {
					if(value==null){
						return null;
					}
					String str = (String) value;
					if(str.trim().equals("")){
						return null;
					}
					
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					try {
						return df.parse(str);
					} catch (ParseException e) {
						throw new RuntimeException(e);
					}
				}
			}, Date.class);
			T bean1 = destination.newInstance();
			BeanUtils.copyProperties(bean1, source);
			return bean1;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
