package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.facebook.internal.FeatureManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class qi3 {
    public static final qi3 a = new qi3();
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private qi3() {
    }

    public static final void a() {
        if (c11.d(qi3.class)) {
            return;
        }
        try {
            b.set(true);
            b();
        } catch (Throwable th) {
            c11.b(th, qi3.class);
        }
    }

    public static final void b() {
        if (c11.d(qi3.class)) {
            return;
        }
        try {
            if (b.get()) {
                if (a.c()) {
                    FeatureManager featureManager = FeatureManager.a;
                    if (FeatureManager.g(FeatureManager.Feature.IapLoggingLib2)) {
                        li3 li3Var = li3.a;
                        li3.d(w92.l());
                        return;
                    }
                }
                gi3.g();
            }
        } catch (Throwable th) {
            c11.b(th, qi3.class);
        }
    }

    private final boolean c() {
        String string;
        if (c11.d(this)) {
            return false;
        }
        try {
            Context l = w92.l();
            ApplicationInfo applicationInfo = l.getPackageManager().getApplicationInfo(l.getPackageName(), 128);
            if (applicationInfo == null || (string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version")) == null) {
                return false;
            }
            return Integer.parseInt((String) h.F0(string, new String[]{InstructionFileId.DOT}, false, 3, 2, null).get(0)) >= 2;
        } catch (Exception unused) {
        } catch (Throwable th) {
            c11.b(th, this);
        }
        return false;
    }
}
