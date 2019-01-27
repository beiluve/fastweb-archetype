#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.constant;

/**
 * The {@code Chars} class.
 *
 * @author beiluve
 */
public interface Chars {

  /**
   * 感叹号
   */
  String EXCLAMATION_MARK = "!";

  /**
   * ＃号
   */
  String POUND = "${symbol_pound}";

  /**
   * dollar符
   */
  String DOLLAR_MARK = "${symbol_dollar}";

  /**
   * 根号
   */
  String RADICAL_SIGN = "^";

  /**
   * and号
   */
  String AMPERSAND = "&";

  /**
   * 星号
   */
  String ASTERISK = "*";

  /**
   * 左圆括号
   */
  String OPEN_PAREN = "(";

  /**
   * 右圆括号
   */
  String CLOSE_PAREN = ")";

  /**
   * 左方括号
   */
  String OPEN_BRACKET = "[";

  /**
   * 右方括号
   */
  String CLOSE_BRACKET = "]";

  /**
   * 左花括号
   */
  String OPEN_BRACE = "{";

  /**
   * 右花括号
   */
  String CLOSE_BRACE = "}";

  /**
   * 反斜杠
   */
  String BACKSLASH = "${symbol_escape}${symbol_escape}";

  /**
   * 竖线
   */
  String VERTICAL_BAR = "|";

  /**
   * 连字符
   */
  String HYPHEN = "-";

  /**
   * 等于号
   */
  String EQUAL = "=";

  /**
   * 加号
   */
  String PLUS = "+";

  /**
   * 分毫
   */
  String SEMICOLON = ";";

  /**
   * 冒号
   */
  String COLON = ":";

  /**
   * 单引号
   */
  String SINGLE_QUOTATION = "'";

  /**
   * 双引号
   */
  String DOUBLE_QUOTATION = "${symbol_escape}"";

  /**
   * 逗号
   */
  String COMMA = ",";

  /**
   * 句号
   */
  String PERIOD = ".";

  /**
   * 斜杠
   */
  String SLASH = "/";

  /**
   * 问号
   */
  String QUESTION_MARK = "?";

  /**
   * 空格
   */
  String SPACE = " ";

  /**
   * 空字符串
   */
  String BLANK = "";

  /**
   * 下划线
   */
  String UNDERLINE = "_";
}
