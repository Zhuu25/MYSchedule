package Common;

import javafx.scene.control.TextArea;

public interface Holder {

    void add(String date, String time, String title, String place, String note, String repeat);

    void show(String date, TextArea textArea);

    void delete(String date, String time, String ti, String pl, String no, String re);

}
