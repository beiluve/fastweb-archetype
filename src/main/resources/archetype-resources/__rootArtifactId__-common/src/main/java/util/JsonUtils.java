#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * The {@code JsonUtils} class.
 *
 * @author beiluve
 */
public class JsonUtils {

  public static String toJsonString(Object o) {
    return JSON.toJSONString(o, SerializerFeature.WriteMapNullValue,
        SerializerFeature.WriteDateUseDateFormat);
  }

  public static <T> T toObject(String text, Class<T> clazz) {
    return JSON.parseObject(text, clazz);
  }
}
