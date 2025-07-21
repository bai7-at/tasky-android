package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class s7e {
    private static s7e e;
    private final Handler a = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private final Object c = new Object();
    private int d = 0;

    private s7e(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new q6e(this, null), intentFilter);
    }

    public static synchronized s7e b(Context context) {
        s7e s7eVar;
        synchronized (s7e.class) {
            try {
                if (e == null) {
                    e = new s7e(context);
                }
                s7eVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s7eVar;
    }

    static /* synthetic */ void c(s7e s7eVar, int i) {
        synchronized (s7eVar.c) {
            try {
                if (s7eVar.d == i) {
                    return;
                }
                s7eVar.d = i;
                Iterator it2 = s7eVar.b.iterator();
                while (it2.hasNext()) {
                    WeakReference weakReference = (WeakReference) it2.next();
                    u7g u7gVar = (u7g) weakReference.get();
                    if (u7gVar != null) {
                        u7gVar.a.k(i);
                    } else {
                        s7eVar.b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int a() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void d(final u7g u7gVar) {
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            WeakReference weakReference = (WeakReference) it2.next();
            if (weakReference.get() == null) {
                this.b.remove(weakReference);
            }
        }
        this.b.add(new WeakReference(u7gVar));
        this.a.post(new Runnable() { // from class: m3e
            @Override // java.lang.Runnable
            public final void run() {
                u7gVar.a.k(s7e.this.a());
            }
        });
    }
}
