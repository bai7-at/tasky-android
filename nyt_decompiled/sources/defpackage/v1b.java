package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes3.dex */
public final class v1b {
    private final Object a = new Object();
    private final Object b = new Object();
    private e2b c;
    private e2b d;

    private static final Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final e2b a(Context context, zzcei zzceiVar, v7e v7eVar) {
        e2b e2bVar;
        synchronized (this.a) {
            try {
                if (this.c == null) {
                    this.c = new e2b(c(context), zzceiVar, (String) pla.c().a(mpa.a), v7eVar);
                }
                e2bVar = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e2bVar;
    }

    public final e2b b(Context context, zzcei zzceiVar, v7e v7eVar) {
        e2b e2bVar;
        synchronized (this.b) {
            try {
                if (this.d == null) {
                    this.d = new e2b(c(context), zzceiVar, (String) fsa.b.e(), v7eVar);
                }
                e2bVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e2bVar;
    }
}
