// ���� json-������ (����� ��������� � ���� � ������ �� �����)
// [{"�������":"������","������":"5","�������":"����������"},
// {"�������":"�������","������":"4","�������":"�����������"},
// {"�������":"�������","������":"5","�������":"������"}]
// �������� �����(�), ������� ��������� json �, ��������� StringBuilder, 
// ������� ������ ����: 
// ������� [�������] ������� [������] �� �������� [�������].
// ������ ������:
// ������� ������ ������� 5 �� �������� ����������.
// ������� ������� ������� 4 �� �������� �����������.
// ������� ������� ������� 5 �� �������� ������.

public class task2 {
    public static void main(String[] args) {
    String filter = "[{\"�������\":\"������\",\"������\":\"5\",\"�������\":\"����������\"},{\"�������\":\"�������\",\"������\":\"4\",\"�������\":\"�����������\"},{\"�������\":\"�������\",\"������\":\"5\",\"�������\":\"������\"}]";
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
      line[i] = line[i].replace("�������:", "");
      line[i] = line[i].replace("������:", "");
      line[i] = line[i].replace("�������:", "");
    }
    String[] formatStrArray = new String[line.length];
    for (int i = 0; i < line.length; i++) {
      String[] arrData = line[i].split(",");
      String listName = String.format("������� %s ������� %s �� �������� %s.", arrData[0], arrData[1], arrData[2]);
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
