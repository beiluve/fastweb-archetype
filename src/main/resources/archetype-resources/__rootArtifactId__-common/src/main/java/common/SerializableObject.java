#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.common;

import ${package}.util.JsonUtils;
import java.io.Serializable;

/**
 * The {@code SerializableObject} class.
 *
 * @author beiluve
 */
public class SerializableObject implements Serializable {

  private static final long serialVersionUID = -502127093638810810L;

  @Override
  public String toString() {
    return JsonUtils.toJsonString(this);
  }
}
