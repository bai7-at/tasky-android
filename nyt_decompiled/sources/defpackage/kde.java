package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class kde implements kod {
    private static final List b = new ArrayList(50);
    private final Handler a;

    public kde(Handler handler) {
        this.a = handler;
    }

    static /* bridge */ /* synthetic */ void g(pce pceVar) {
        List list = b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(pceVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static pce h() {
        pce pceVar;
        List list = b;
        synchronized (list) {
            try {
                pceVar = list.isEmpty() ? new pce(null) : (pce) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return pceVar;
    }

    @Override // defpackage.kod
    public final void a(Object obj) {
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.kod
    public final hnd b(int i, Object obj) {
        Handler handler = this.a;
        pce h = h();
        h.a(handler.obtainMessage(i, obj), this);
        return h;
    }

    @Override // defpackage.kod
    public final boolean c(hnd hndVar) {
        return ((pce) hndVar).b(this.a);
    }

    @Override // defpackage.kod
    public final boolean d(int i, long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    @Override // defpackage.kod
    public final boolean e(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // defpackage.kod
    public final hnd f(int i, int i2, int i3) {
        Handler handler = this.a;
        pce h = h();
        h.a(handler.obtainMessage(1, i2, i3), this);
        return h;
    }

    @Override // defpackage.kod
    public final Looper zza() {
        return this.a.getLooper();
    }

    @Override // defpackage.kod
    public final hnd zzb(int i) {
        Handler handler = this.a;
        pce h = h();
        h.a(handler.obtainMessage(i), this);
        return h;
    }

    @Override // defpackage.kod
    public final void zzf(int i) {
        this.a.removeMessages(i);
    }

    @Override // defpackage.kod
    public final boolean zzg(int i) {
        return this.a.hasMessages(0);
    }

    @Override // defpackage.kod
    public final boolean zzi(int i) {
        return this.a.sendEmptyMessage(i);
    }
}
