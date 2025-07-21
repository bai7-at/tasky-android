package defpackage;

import android.os.Binder;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class o3f {
    public static Object a(o4f o4fVar) {
        try {
            return o4fVar.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return o4fVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
