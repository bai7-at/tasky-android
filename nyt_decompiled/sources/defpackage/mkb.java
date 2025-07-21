package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class mkb implements Releasable {
    protected final Context a;
    protected final String b;
    protected final WeakReference c;

    public mkb(wib wibVar) {
        Context context = wibVar.getContext();
        this.a = context;
        this.b = dyf.r().E(context, wibVar.zzn().zza);
        this.c = new WeakReference(wibVar);
    }

    static /* bridge */ /* synthetic */ void k(mkb mkbVar, String str, Map map) {
        wib wibVar = (wib) mkbVar.c.get();
        if (wibVar != null) {
            wibVar.t("onPrecacheEvent", map);
        }
    }

    public abstract void l();

    public final void m(String str, String str2, String str3, String str4) {
        tfb.b.post(new lkb(this, str, str2, str3, str4));
    }

    protected final void n(String str, String str2, int i) {
        tfb.b.post(new jkb(this, str, str2, i));
    }

    public final void o(String str, String str2, long j) {
        tfb.b.post(new kkb(this, str, str2, j));
    }

    public final void p(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        tfb.b.post(new ikb(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void q(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        tfb.b.post(new hkb(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    protected void r(int i) {
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    protected void s(int i) {
    }

    protected void t(int i) {
    }

    protected void u(int i) {
    }

    public abstract boolean v(String str);

    public boolean w(String str, String[] strArr) {
        return v(str);
    }

    public boolean x(String str, String[] strArr, ekb ekbVar) {
        return v(str);
    }
}
