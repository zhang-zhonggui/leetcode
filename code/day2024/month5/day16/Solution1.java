package day2024.month5.day16;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

class Solution1 {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        // 获取英文全称
        return localDate.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH);
    }
}
