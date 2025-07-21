package defpackage;

import android.os.Trace;

/* loaded from: classes.dex */
public final class to8 {
    public static final to8 a = new to8();

    private to8() {
    }

    public final Object a(String str) {
        Trace.beginSection(str);
        return null;
    }

    public final void b(Object obj) {
        Trace.endSection();
    }
}
