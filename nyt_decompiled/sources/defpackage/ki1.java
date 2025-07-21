package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class ki1 implements vc4 {
    @Override // defpackage.vc4
    public pc4 a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new ji1(httpURLConnection);
    }
}
