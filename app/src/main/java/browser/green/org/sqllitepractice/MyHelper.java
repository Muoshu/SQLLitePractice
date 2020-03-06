package browser.green.org.sqllitepractice;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyHelper extends SQLiteOpenHelper {

    public MyHelper(@Nullable Context context) {
        super(context, "mydb.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    sqLiteDatabase.execSQL("create table info(_id integer primary key autoincrement," +
            "name varchar(32),email varchar(32),phone varchar(16))");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
