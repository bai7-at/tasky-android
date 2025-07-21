package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import com.amazonaws.services.s3.internal.Constants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e {
    private static final Map c = new HashMap();
    private final Context a;
    private final String b;

    private e(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public static synchronized e c(Context context, String str) {
        e eVar;
        synchronized (e.class) {
            try {
                Map map = c;
                if (!map.containsKey(str)) {
                    map.put(str, new e(context, str));
                }
                eVar = (e) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public synchronized Void a() {
        this.a.deleteFile(this.b);
        return null;
    }

    String b() {
        return this.b;
    }

    public synchronized b d() {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.a.openFileInput(this.b);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStream = null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr, 0, available);
            b b = b.b(new JSONObject(new String(bArr, Constants.DEFAULT_ENCODING)));
            fileInputStream.close();
            return b;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public synchronized Void e(b bVar) {
        FileOutputStream openFileOutput = this.a.openFileOutput(this.b, 0);
        try {
            openFileOutput.write(bVar.toString().getBytes(Constants.DEFAULT_ENCODING));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}
