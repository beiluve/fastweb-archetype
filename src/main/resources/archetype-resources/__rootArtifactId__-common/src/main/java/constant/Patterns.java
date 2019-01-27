#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.constant;

import java.util.regex.Pattern;

/**
 * The {@code Patterns} class.
 *
 * @author beiluve
 */
public final class Patterns {

  /**
   * 常用日期格式化
   */
  public interface Date {

    /**
     * 年份
     */
    String YEAR_PATTERN = "yyyy";

    /**
     * 月份
     */
    String MONTH_PATTERN = "yyyy-MM";

    /**
     * 日期
     */
    String DATE_PATTERN = "yyyy-MM-dd";

    /**
     * 时间
     */
    String TIME_PATTERN = "HH:mm:ss";

    /**
     * 时间戳
     */
    String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 带毫秒时间戳
     */
    String DATE_TIME_MILLS_PATTERN = "yyyy-MM-dd HH:mm:ss.SSS";
  }

  /**
   * 常用正则表达式
   */
  public interface Regex {

    /**
     * 数字
     */
    Pattern DIGIT = Pattern.compile("^[0-9]*${symbol_dollar}");

    /**
     * 汉字
     */
    Pattern CHINESE = Pattern.compile("^[${symbol_escape}${symbol_escape}u4e00-${symbol_escape}${symbol_escape}u9fa5]{0,}${symbol_dollar}");

    /**
     * 邮箱
     */
    Pattern EMAIL = Pattern
        .compile("^([A-Za-z0-9_${symbol_escape}${symbol_escape}-${symbol_escape}${symbol_escape}.])+${symbol_escape}${symbol_escape}@([A-Za-z0-9_${symbol_escape}${symbol_escape}-${symbol_escape}${symbol_escape}.])+${symbol_escape}${symbol_escape}.([A-Za-z]{2,4})${symbol_dollar}");

    /**
     * 网络链接
     */
    Pattern URL = Pattern.compile("[a-zA-z]+://[^${symbol_escape}${symbol_escape}s]*");

    /**
     * 身份证
     */
    Pattern ID_CARD = Pattern.compile("^([0-9]){7,18}(x|X)?${symbol_dollar}");

    /**
     * 手机
     */
    Pattern PHONE = Pattern
        .compile("^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])${symbol_escape}${symbol_escape}d{8}${symbol_dollar}");
  }

  public static boolean match(String text, Pattern pattern) {
    return pattern.matcher(text).matches();
  }
}
