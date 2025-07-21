package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFa1pSDK {
    final AFb1fSDK AFInAppEventParameterName;

    public AFa1pSDK() {
    }

    private static Object AFKeystoreWrapper(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    jSONArray.put(AFKeystoreWrapper(it2.next()));
                }
                return jSONArray;
            }
            if (!obj.getClass().isArray()) {
                return obj instanceof Map ? valueOf((Map<String, ?>) obj) : ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
            int length = Array.getLength(obj);
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < length; i++) {
                jSONArray2.put(AFKeystoreWrapper(Array.get(obj, i)));
            }
            return jSONArray2;
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static JSONObject valueOf(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), AFKeystoreWrapper(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static Map<String, Object> values(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = AFKeystoreWrapper((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = values((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.support.annotation.WorkerThread
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String AFInAppEventType(com.appsflyer.internal.AFa1fSDK r7) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1pSDK.AFInAppEventType(com.appsflyer.internal.AFa1fSDK):java.lang.String");
    }

    public AFa1pSDK(AFb1fSDK aFb1fSDK) {
        this.AFInAppEventParameterName = aFb1fSDK;
    }

    static AFd1eSDK valueOf(Context context) {
        if (context instanceof Activity) {
            return AFd1eSDK.activity;
        }
        if (context instanceof Application) {
            return AFd1eSDK.application;
        }
        return AFd1eSDK.other;
    }

    private static List<Object> AFKeystoreWrapper(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = AFKeystoreWrapper((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = values((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @WorkerThread
    @NonNull
    public final List<AFa1fSDK> AFKeystoreWrapper() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.AFInAppEventParameterName.AFKeystoreWrapper.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            listFiles = file.listFiles();
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e);
        }
        if (listFiles == null) {
            return arrayList;
        }
        for (File file2 : listFiles) {
            StringBuilder sb = new StringBuilder("CACHE: Found cached request");
            sb.append(file2.getName());
            AFLogger.afInfoLog(sb.toString());
            arrayList.add(AFInAppEventType(file2));
        }
        return arrayList;
    }

    @WorkerThread
    public final boolean AFKeystoreWrapper(String str) {
        File file = new File(new File(this.AFInAppEventParameterName.AFKeystoreWrapper.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb = new StringBuilder("CACHE: Deleting ");
        sb.append(str);
        sb.append(" from cache");
        AFLogger.afInfoLog(sb.toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("CACHE: Could not delete ");
            sb2.append(str);
            sb2.append(" from cache");
            AFLogger.afErrorLog(sb2.toString(), e);
            return false;
        }
    }

    @Nullable
    private static AFa1fSDK AFInAppEventType(File file) {
        FileReader fileReader;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                char[] cArr = new char[(int) file.length()];
                fileReader.read(cArr);
                AFa1fSDK aFa1fSDK = new AFa1fSDK(cArr);
                aFa1fSDK.AFKeystoreWrapper = file.getName();
                try {
                    fileReader.close();
                } catch (IOException e) {
                    AFLogger.afErrorLog(e);
                }
                return aFa1fSDK;
            } catch (Exception unused) {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException e2) {
                        AFLogger.afErrorLog(e2);
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileReader2 = fileReader;
                if (fileReader2 != null) {
                    try {
                        fileReader2.close();
                    } catch (IOException e3) {
                        AFLogger.afErrorLog(e3);
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
