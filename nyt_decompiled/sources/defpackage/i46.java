package defpackage;

import com.nytimes.android.logging.NYTLogger;

/* loaded from: classes4.dex */
public final class i46 implements ps3 {
    @Override // defpackage.ps3
    public void a(String str, String str2) {
        zq3.h(str, "tag");
        zq3.h(str2, "message");
    }

    @Override // defpackage.ps3
    public void b(String str, String str2) {
        zq3.h(str, "tag");
        zq3.h(str2, "message");
    }

    @Override // defpackage.ps3
    public void c(String str, Exception exc) {
        zq3.h(str, "tag");
        zq3.h(exc, "exception");
        NYTLogger.h(exc);
    }
}
