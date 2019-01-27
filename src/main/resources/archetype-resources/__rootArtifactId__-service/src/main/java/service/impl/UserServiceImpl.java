#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import ${package}.po.User;
import ${package}.service.UserService;
import org.springframework.stereotype.Service;

/**
 * The {@code UserServiceImpl} class.
 *
 * @author beiluve
 */
@Service
public class UserServiceImpl implements UserService {

  @Override
  public User login(String userName, String password) {
    return null;
  }
}
