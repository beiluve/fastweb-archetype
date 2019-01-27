#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.po;

import ${package}.common.SerializableObject;
import java.util.Date;

/**
 * The {@code BasePo} class.
 *
 * @author beiluve
 */
public class BasePo extends SerializableObject {

  private static final long serialVersionUID = 1991532134258918168L;

  private Date createTime;

  private Date updateTime;

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }
}
