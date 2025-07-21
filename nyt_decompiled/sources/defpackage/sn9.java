package defpackage;

import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class sn9 {
    public static final Map a(String str) {
        zq3.i(str, "$this$stringMapFromJson");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            zq3.d(keys, "jsonObject.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                zq3.d(next, TransferTable.COLUMN_KEY);
                String string = jSONObject.getString(next);
                zq3.d(string, "jsonObject.getString(key)");
                linkedHashMap.put(next, string);
            }
            return linkedHashMap;
        } catch (JSONException e) {
            Log.e("Datadome", "Error parsing JSON: " + str + " \n" + e.getMessage());
            return linkedHashMap;
        }
    }
}
