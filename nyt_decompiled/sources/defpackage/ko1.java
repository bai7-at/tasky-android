package defpackage;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class ko1 {
    private final Context a;
    private b b = null;

    private class b {
        private final String a;
        private final String b;

        private b() {
            int q = CommonUtils.q(ko1.this.a, "com.google.firebase.crashlytics.unity_version", "string");
            if (q == 0) {
                if (!ko1.this.c("flutter_assets/NOTICES.Z")) {
                    this.a = null;
                    this.b = null;
                    return;
                } else {
                    this.a = "Flutter";
                    this.b = null;
                    m94.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.a = "Unity";
            String string = ko1.this.a.getResources().getString(q);
            this.b = string;
            m94.f().i("Unity Editor version is: " + string);
        }
    }

    public ko1(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.a.getAssets().open(str);
            if (open == null) {
                return true;
            }
            open.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.b == null) {
            this.b = new b();
        }
        return this.b;
    }

    public String d() {
        return f().a;
    }

    public String e() {
        return f().b;
    }
}
