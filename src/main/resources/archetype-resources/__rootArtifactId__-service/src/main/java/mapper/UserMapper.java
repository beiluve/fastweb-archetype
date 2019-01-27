#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.mapper;

import ${package}.po.User;

/**
 * The {@code UserMapper} class.
 *
 * @author beiluve
 */
public interface UserMapper {

  User getUser(String userId);
}
