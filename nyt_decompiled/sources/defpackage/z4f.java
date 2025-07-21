package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes3.dex */
final class z4f implements r4f {
    private static z4f c;
    private final Context a;
    private final ContentObserver b;

    private z4f() {
        this.a = null;
        this.b = null;
    }

    static z4f a(Context context) {
        z4f z4fVar;
        synchronized (z4f.class) {
            try {
                if (c == null) {
                    c = er5.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new z4f(context) : new z4f();
                }
                z4fVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4fVar;
    }

    static synchronized void d() {
        Context context;
        synchronized (z4f.class) {
            try {
                z4f z4fVar = c;
                if (z4fVar != null && (context = z4fVar.a) != null && z4fVar.b != null) {
                    context.getContentResolver().unregisterContentObserver(c.b);
                }
                c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r4f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String f(final String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) o3f.a(new o4f() { // from class: u4f
                @Override // defpackage.o4f
                public final Object zza() {
                    return z4f.this.c(str);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException e) {
            Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            return null;
        }
    }

    final /* synthetic */ String c(String str) {
        return g0f.a(this.a.getContentResolver(), str, null);
    }

    private z4f(Context context) {
        this.a = context;
        y4f y4fVar = new y4f(this, null);
        this.b = y4fVar;
        context.getContentResolver().registerContentObserver(g0f.a, true, y4fVar);
    }
}
