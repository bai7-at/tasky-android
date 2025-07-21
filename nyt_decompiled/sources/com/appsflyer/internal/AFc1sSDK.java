package com.appsflyer.internal;

import android.support.annotation.NonNull;
import com.amazonaws.services.s3.util.Mimetypes;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import zendesk.core.Constants;

/* loaded from: classes2.dex */
public final class AFc1sSDK {
    private final int values;

    public AFc1sSDK(int i) {
        this.values = i;
    }

    @NonNull
    private static String valueOf(HttpURLConnection httpURLConnection, boolean z) throws IOException {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader = null;
        try {
            InputStream inputStream = z ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            if (inputStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream);
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z2 = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            String obj = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                        if (!z2) {
                            sb.append('\n');
                        }
                        sb.append(readLine);
                        z2 = false;
                    } catch (Throwable th) {
                        inputStreamReader = inputStreamReader2;
                        bufferedReader = bufferedReader2;
                        th = th;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                inputStreamReader = inputStreamReader2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    public final AFc1oSDK<String> AFInAppEventParameterName(AFb1wSDK aFb1wSDK) throws IOException {
        byte[] AFInAppEventType;
        HttpURLConnection httpURLConnection;
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection2 = null;
        BufferedOutputStream bufferedOutputStream = null;
        httpURLConnection2 = null;
        try {
            try {
                AFInAppEventType = aFb1wSDK.AFInAppEventType();
                StringBuilder sb = new StringBuilder();
                sb.append(aFb1wSDK.values);
                sb.append(":");
                sb.append(aFb1wSDK.AFInAppEventParameterName);
                StringBuilder sb2 = new StringBuilder(sb.toString());
                byte[] AFInAppEventType2 = aFb1wSDK.AFInAppEventType();
                if (AFInAppEventType2 != null) {
                    String str = aFb1wSDK.values() ? "<encrypted>" : new String(AFInAppEventType2);
                    sb2.append("\n payload: ");
                    sb2.append(str);
                }
                for (Map.Entry<String, String> entry : aFb1wSDK.AFKeystoreWrapper.entrySet()) {
                    sb2.append("\n ");
                    sb2.append(entry.getKey());
                    sb2.append(": ");
                    sb2.append(entry.getValue());
                }
                StringBuilder sb3 = new StringBuilder("HTTP: [");
                sb3.append(aFb1wSDK.hashCode());
                sb3.append("] ");
                sb3.append((Object) sb2);
                AFLogger.afDebugLog(sb3.toString());
                httpURLConnection = (HttpURLConnection) new URL(aFb1wSDK.AFInAppEventParameterName).openConnection();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpURLConnection.setRequestMethod(aFb1wSDK.values);
            if (aFb1wSDK.valueOf()) {
                httpURLConnection.setUseCaches(false);
            }
            if (!aFb1wSDK.AFLogger()) {
                httpURLConnection.setInstanceFollowRedirects(false);
            }
            int i = this.values;
            int i2 = aFb1wSDK.afDebugLog;
            if (i2 != -1) {
                i = i2;
            }
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.addRequestProperty("Content-Type", aFb1wSDK.values() ? Mimetypes.MIMETYPE_OCTET_STREAM : Constants.APPLICATION_JSON);
            for (Map.Entry<String, String> entry2 : aFb1wSDK.AFKeystoreWrapper.entrySet()) {
                httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
            }
            boolean z = true;
            if (AFInAppEventType != null) {
                httpURLConnection.setDoOutput(true);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(AFInAppEventType.length);
                httpURLConnection.setRequestProperty("Content-Length", sb4.toString());
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    try {
                        bufferedOutputStream2.write(AFInAppEventType);
                        bufferedOutputStream2.close();
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (httpURLConnection.getResponseCode() / 100 != 2) {
                z = false;
            }
            String valueOf = aFb1wSDK.AFInAppEventParameterName() ? valueOf(httpURLConnection, z) : "";
            AFc1tSDK aFc1tSDK = new AFc1tSDK(System.currentTimeMillis() - currentTimeMillis);
            StringBuilder sb5 = new StringBuilder("response code:");
            sb5.append(httpURLConnection.getResponseCode());
            sb5.append(" ");
            sb5.append(httpURLConnection.getResponseMessage());
            sb5.append("\n body:");
            sb5.append(valueOf);
            sb5.append("\n took ");
            sb5.append(aFc1tSDK.values);
            sb5.append("ms");
            String obj = sb5.toString();
            StringBuilder sb6 = new StringBuilder("HTTP: [");
            sb6.append(aFb1wSDK.hashCode());
            sb6.append("] ");
            sb6.append(obj);
            AFLogger.afDebugLog(sb6.toString());
            HashMap hashMap = new HashMap(httpURLConnection.getHeaderFields());
            hashMap.remove(null);
            AFc1oSDK<String> aFc1oSDK = new AFc1oSDK<>(valueOf, httpURLConnection.getResponseCode(), z, hashMap, aFc1tSDK);
            httpURLConnection.disconnect();
            return aFc1oSDK;
        } catch (Exception e2) {
            e = e2;
            httpURLConnection2 = httpURLConnection;
            AFc1tSDK aFc1tSDK2 = new AFc1tSDK(System.currentTimeMillis() - currentTimeMillis);
            StringBuilder sb7 = new StringBuilder("error: ");
            sb7.append(e);
            sb7.append("\n took ");
            sb7.append(aFc1tSDK2.values);
            sb7.append("ms");
            String obj2 = sb7.toString();
            StringBuilder sb8 = new StringBuilder("HTTP: [");
            sb8.append(aFb1wSDK.hashCode());
            sb8.append("] ");
            sb8.append(obj2);
            AFLogger.afErrorLog(sb8.toString(), e);
            throw new HttpException(e, aFc1tSDK2);
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }
}
