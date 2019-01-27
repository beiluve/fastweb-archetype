#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The {@code IndexController} class.
 *
 * @author beiluve
 */
@Controller
public class IndexController {

  @RequestMapping("/index")
  public String index() {
    return "index";
  }
}
