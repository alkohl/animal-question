package record;

import animal.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunnior on 9/21/16.
 */
public class RecordInf {
    private String id;
    private String date;
    private String time;
    private Animal animal;
    private int deltax;
    private int deltay;

    private static List<RecordInf> recordsList = new ArrayList<>();

    public static List<RecordInf> getRecordsList() {
        return recordsList;
    }

    public static void addRecords(List<RecordInf> records) {
        for (RecordInf recordInf:records) {
            recordsList.add(recordInf);
        }
    }
}
