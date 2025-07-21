package co.datadome.sdk;

import co.datadome.sdk.DataDomeSDK;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class a implements CookieJar {
    private CookieJar a;
    private DataDomeSDK.Builder b;
    private String c = "datadome";

    public a(CookieJar cookieJar, DataDomeSDK.Builder builder) {
        this.a = cookieJar;
        this.b = builder;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list);
        for (int i = 0; i < arrayList.size(); i++) {
            if (((Cookie) arrayList.get(i)).name().equals(this.c)) {
                d.a("removing old DataDome cookie " + ((Cookie) arrayList.get(i)).value() + " from DataDomeCookieJar");
                arrayList.remove(i);
                return arrayList;
            }
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public List loadForRequest(HttpUrl httpUrl) {
        List<Cookie> loadForRequest = this.a.loadForRequest(httpUrl);
        Cookie parse = Cookie.parse(httpUrl, this.b.x());
        if (parse != null) {
            loadForRequest = a(loadForRequest);
            loadForRequest.add(parse);
        }
        d.a("loadForRequest cookies: " + loadForRequest);
        return loadForRequest;
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List list) {
        d.a("saveFromResponse cookies: " + list);
        this.a.saveFromResponse(httpUrl, list);
    }
}
