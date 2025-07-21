package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class lib {
    private final Context a;
    private final wib b;
    private final ViewGroup c;
    private fib d;

    public lib(Context context, ViewGroup viewGroup, wlb wlbVar) {
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = viewGroup;
        this.b = wlbVar;
        this.d = null;
    }

    public final fib a() {
        return this.d;
    }

    public final Integer b() {
        fib fibVar = this.d;
        if (fibVar != null) {
            return fibVar.n();
        }
        return null;
    }

    public final void c(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        fib fibVar = this.d;
        if (fibVar != null) {
            fibVar.g(i, i2, i3, i4);
        }
    }

    public final void d(int i, int i2, int i3, int i4, int i5, boolean z, vib vibVar) {
        if (this.d != null) {
            return;
        }
        wpa.a(this.b.zzm().a(), this.b.zzk(), "vpr2");
        Context context = this.a;
        wib wibVar = this.b;
        fib fibVar = new fib(context, wibVar, i5, z, wibVar.zzm().a(), vibVar);
        this.d = fibVar;
        this.c.addView(fibVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.d.g(i, i2, i3, i4);
        this.b.x(false);
    }

    public final void e() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        fib fibVar = this.d;
        if (fibVar != null) {
            fibVar.q();
            this.c.removeView(this.d);
            this.d = null;
        }
    }

    public final void f() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        fib fibVar = this.d;
        if (fibVar != null) {
            fibVar.w();
        }
    }

    public final void g(int i) {
        fib fibVar = this.d;
        if (fibVar != null) {
            fibVar.d(i);
        }
    }
}
