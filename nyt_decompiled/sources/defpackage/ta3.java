package defpackage;

import com.amazonaws.services.s3.internal.Constants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes3.dex */
public class ta3 {
    private final String a;
    private final Map b;
    private final Map c = new HashMap();

    public ta3(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    private String a(Map map) {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it2.next();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? (String) entry.getValue() : "");
        sb.append(sb2.toString());
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("&");
            sb3.append((String) entry2.getKey());
            sb3.append("=");
            sb3.append(entry2.getValue() != null ? (String) entry2.getValue() : "");
            sb.append(sb3.toString());
        }
        return sb.toString();
    }

    private String b(String str, Map map) {
        String a = a(map);
        if (a.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + a;
        }
        if (!str.endsWith("&")) {
            a = "&" + a;
        }
        return str + a;
    }

    private String e(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Constants.DEFAULT_ENCODING));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public eb3 c() {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String e = null;
        inputStream = null;
        try {
            String b = b(this.a, this.b);
            m94.f().i("GET Request URL: " + b);
            httpsURLConnection = (HttpsURLConnection) new URL(b).openConnection();
            try {
                httpsURLConnection.setReadTimeout(Constants.MAXIMUM_UPLOAD_PARTS);
                httpsURLConnection.setConnectTimeout(Constants.MAXIMUM_UPLOAD_PARTS);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        e = e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new eb3(responseCode, e);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public ta3 d(String str, String str2) {
        this.c.put(str, str2);
        return this;
    }
}
