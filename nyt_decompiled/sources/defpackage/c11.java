package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.chartbeat.androidsdk.QueryKeys;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class c11 {
    public static final c11 a = new c11();
    private static final Set b = Collections.newSetFromMap(new WeakHashMap());
    private static boolean c;

    public static final class a implements Runnable {
        final /* synthetic */ Throwable a;

        a(Throwable th) {
            this.a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException(this.a);
        }
    }

    private c11() {
    }

    public static final void a() {
        c = true;
    }

    public static final void b(Throwable th, Object obj) {
        zq3.h(obj, QueryKeys.DOCUMENT_WIDTH);
        if (c) {
            b.add(obj);
            if (w92.p()) {
                b62.c(th);
                InstrumentData.a aVar = InstrumentData.a.a;
                InstrumentData.a.b(th, InstrumentData.Type.CrashShield).g();
            }
            e(th);
        }
    }

    public static final boolean c() {
        return false;
    }

    public static final boolean d(Object obj) {
        zq3.h(obj, QueryKeys.DOCUMENT_WIDTH);
        return b.contains(obj);
    }

    public static final void e(Throwable th) {
        if (c()) {
            new Handler(Looper.getMainLooper()).post(new a(th));
        }
    }
}
