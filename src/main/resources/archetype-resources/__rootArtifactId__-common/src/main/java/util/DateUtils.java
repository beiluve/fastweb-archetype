#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.util;

import static ${package}.constant.Patterns.Date.DATE_PATTERN;
import static ${package}.constant.Patterns.Date.DATE_TIME_MILLS_PATTERN;
import static ${package}.constant.Patterns.Date.DATE_TIME_PATTERN;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The {@code DateUtils} class.
 *
 * @author beiluve
 */
public class DateUtils {

  public static String format(Date date, String pattern) {
    SimpleDateFormat format = new SimpleDateFormat(pattern);
    return format.format(date);
  }

  public static String format(Date date) {
    return format(date, DATE_PATTERN);
  }

  public static String today() {
    return format(new Date());
  }

  public static String now() {
    return format(new Date(), DATE_TIME_PATTERN);
  }

  public static String millis() {
    return format(new Date(), DATE_TIME_MILLS_PATTERN);
  }
}
