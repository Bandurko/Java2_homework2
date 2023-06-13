// Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, 
// создаст строки вида: 
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class task2 {
    public static void main(String[] args) {
    String filter = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
    String[] formatStr = parseList(filter);
    printArray(formatStr);
  }

  public static String[] parseList(String jsonList) {
      String[] line = jsonList.split("},");
    for (int i = 0; i < line.length; i++) {
      line[i] = line[i].replace("\"", "");
      line[i] = line[i].replace("{", "");
      line[i] = line[i].replace("}", "");
      line[i] = line[i].replace("[", "");
      line[i] = line[i].replace("]", "");
      line[i] = line[i].replace("фамилия:", "");
      line[i] = line[i].replace("оценка:", "");
      line[i] = line[i].replace("предмет:", "");
    }
    String[] formatStrArray = new String[line.length];
    for (int i = 0; i < line.length; i++) {
      String[] arrData = line[i].split(",");
      String listName = String.format("Студент %s получил %s по предмету %s.", arrData[0], arrData[1], arrData[2]);
      formatStrArray[i] = listName;
    }
    return formatStrArray;
  }
    
  public static void printArray(String[] formatArray) {
    for (String s:formatArray) {
      System.out.println(s);
    }
  }
}
