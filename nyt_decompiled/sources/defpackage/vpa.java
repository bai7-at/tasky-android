package defpackage;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class vpa {
    public static final void a(upa upaVar, spa spaVar) {
        if (spaVar.a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(spaVar.b())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        upaVar.d(spaVar.a(), spaVar.b(), spaVar.c(), spaVar.d());
    }
}
