package de.telran.lesson2310;

public class HomeTask2 {
    public static void main(String[] args) {

        String[] myStr = {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", String.valueOf(true)};
        StringBuilder sbSQL = new StringBuilder("SELECT * FROM cars WHERE");

        for (int i = 0; i < myStr.length; i += 2) {
            String pairElement1 = myStr[i];
            String pairElement2 = myStr[i + 1];

            if (pairElement2 != null) {
                sbSQL.append(" ").append(pairElement1).append(" = '").append(pairElement2).append("'");
                if (i < myStr.length - 2) {
                    sbSQL.append(" AND");
                }
            }
        }
        System.out.println(sbSQL.toString());
    }
}

/*
Сформировать строку, сходную с  SQL запросом, используя StringBuilder:

1) Берем исходную строку с данными из cars
{"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
Если значение второго параметра равно null с каждой пары, то параметр не должен попадать в условие отбора, которое задается после ключевого слова WHERE в результирующей строке.
Пример: строка с данными из users: {"id", 1, "country", null, "city", "Helsinki", "year", null}
Результат, новая строка:  SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';
 */