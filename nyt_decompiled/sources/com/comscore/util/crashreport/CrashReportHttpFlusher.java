package com.comscore.util.crashreport;

import com.amazonaws.services.s3.Headers;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes2.dex */
public class CrashReportHttpFlusher implements CrashReportFlusher {
    private static final int a = 4088;

    private HttpURLConnection a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty(Headers.CONNECTION, "Close");
        return httpURLConnection;
    }

    public URL createURL(String str) {
        if (str.length() > a) {
            String substring = str.substring(0, a);
            int lastIndexOf = substring.lastIndexOf(37);
            if (lastIndexOf >= 4086) {
                substring = substring.substring(0, lastIndexOf);
            }
            str = substring + "&ns_cut=";
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.comscore.util.crashreport.CrashReportFlusher
    public boolean flush(String str, CrashReportParser crashReportParser, CrashReport crashReport) {
        boolean z = false;
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = a(createURL(str + "?" + crashReportParser.reportToString(crashReport)));
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200 || responseCode == 204) {
                z = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return z;
    }
}
