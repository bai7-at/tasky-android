package defpackage;

import android.app.Application;
import android.content.res.AssetManager;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class c07 {
    private final AssetManager a;

    public c07(Application application) {
        zq3.h(application, "context");
        AssetManager assets = application.getAssets();
        zq3.g(assets, "getAssets(...)");
        this.a = assets;
    }

    public AssetManager a() {
        return this.a;
    }

    public InputStream b(String str) {
        zq3.h(str, "resourcePath");
        InputStream open = a().open(str);
        zq3.g(open, "open(...)");
        return open;
    }
}
