package com.example.kim.pickup.storage.disk;

/**
 * Created by kim on 2015-12-15.
*/
import android.content.Context;

/**
 * Created by kim on 2015-11-18.
 */
public interface JsonStorable {
    public String getFileName();
    public Object loadFromJson(Context context);
    public void saveToJson(Context context);
}