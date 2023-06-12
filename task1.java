// Дана строка sql-запроса "select * from students where ". Сформируйте часть 
// WHERE этого запроса, используя StringBuilder. Данные для фильтрации 
// приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class task1 {
    public static void main(String[] args) {
        StringBuilder sqlq = new StringBuilder("select * from students where");
        String filter = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        sqlq.append(getLine(filter));
        System.out.println(sqlq);
    }
    public static String getLine(String lineWere) {
        lineWere = lineWere.replace("{", "");
        lineWere = lineWere.replace("}", "");
        lineWere = lineWere.replace("\"", "");
        String[] filterArr = lineWere.split(", ");
        StringBuilder whereItem = new StringBuilder();
        for (String data:filterArr) {
            String[] dataArr = data.split(":");
            if (dataArr[1].equals("null")){
                continue;
            }
            String addData = String.format(", %s = '%s'", dataArr[0], dataArr[1]);
            whereItem.append(addData);
        }
        whereItem.delete(0, 1);
        return whereItem.toString();
    }
}
