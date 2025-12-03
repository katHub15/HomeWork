package task1;

public class Processor {

    public static int processArray(String[][] array)
            throws Size, Data {

        if (array.length != 4) {
            throw new Size("Ожидалось 4 строки, а получено: " + array.length);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new Size(
                        "В строке " + i + " ожидалось 4 элемента, а получено: " + array[i].length
                );
            }
        }

        int sum = 0;


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new Data(
                            "Ошибка данных в ячейке [" + i + "][" + j + "]: " + array[i][j]
                    );
                }
            }
        }

        return sum;
    }
}
