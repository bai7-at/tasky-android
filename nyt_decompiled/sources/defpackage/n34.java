package defpackage;

import android.app.Application;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes4.dex */
public final class n34 {
    private final Application a;

    public n34(Application application) {
        zq3.h(application, "application");
        this.a = application;
    }

    public final String a() {
        InputStream open = this.a.getResources().getAssets().open("artifacts.json");
        zq3.g(open, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, yj0.b), 8192);
        try {
            String f = zj8.f(bufferedReader);
            gm0.a(bufferedReader, null);
            return f;
        } finally {
        }
    }
}
