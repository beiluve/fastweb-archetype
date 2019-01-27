#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.po.User;

/**
 * The {@code UserService} class.
 *
 * @author beiluve
 */
public interface UserService {

  User login(String userName, String password);
}
