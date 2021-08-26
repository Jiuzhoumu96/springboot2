package com.dokstudio.springboot2.utils;

import java.util.regex.Pattern;

/**
 * @author: HeChengyao
 * @date: 2021/8/26 15:05
 */
public class StringUtils {

    public static final String EMPTY = "";

    private StringUtils() {
        throw new UnsupportedOperationException("Construct StringUtils");
    }

    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    /**
     * 判断正整数
     * @param s 字符串
     * @return boolean
     */
    public static boolean isNotPositiveInteger(String s) {
        Pattern pattern = Pattern.compile("^\\d*$");
        return !pattern.matcher(s).matches();
    }

    public static boolean isNotEmpty(final CharSequence cs) {
        return !isEmpty(cs);
    }

    public static boolean isBlank(String s) {
        if (isEmpty(s)) {
            return true;
        }
        return s.trim().length() == 0;
    }

    public static boolean isNotBlank(String s) {
        return !isBlank(s);
    }

    public static String replaceNRTtoUnderline(String src) {
        if (isBlank(src)) {
            return src;
        } else {
            return src.replaceAll("[\n|\r|\t]", "_");
        }
    }

    public static String trim(String str) {
        return str == null ? null : str.trim();
    }

    public static String defaultIfBlank(String str, String defaultStr) {
        return isBlank(str) ? defaultStr : str;
    }

    public static boolean equalsIgnoreCase(String str1, String str2) {
        return str1 == null ? str2 == null : str1.equalsIgnoreCase(str2);
    }

}
