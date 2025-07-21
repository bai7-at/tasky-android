package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaqj;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zaa implements Comparable {
    private final fba a;
    private final int b;
    private final String c;
    private final int d;
    private final Object e;
    private final bba f;
    private Integer g;
    private aba h;
    private boolean i;
    private faa j;
    private saa k;
    private final jaa l;

    public zaa(int i, String str, bba bbaVar) {
        Uri parse;
        String host;
        this.a = fba.c ? new fba() : null;
        this.e = new Object();
        int i2 = 0;
        this.i = false;
        this.j = null;
        this.b = i;
        this.c = str;
        this.f = bbaVar;
        this.l = new jaa();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.d = i2;
    }

    public final jaa A() {
        return this.l;
    }

    public final int a() {
        return this.l.b();
    }

    public final int b() {
        return this.d;
    }

    public final faa c() {
        return this.j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.g.intValue() - ((zaa) obj).g.intValue();
    }

    public final zaa d(faa faaVar) {
        this.j = faaVar;
        return this;
    }

    public final zaa e(aba abaVar) {
        this.h = abaVar;
        return this;
    }

    public final zaa f(int i) {
        this.g = Integer.valueOf(i);
        return this;
    }

    protected abstract dba g(qaa qaaVar);

    public final String j() {
        int i = this.b;
        String str = this.c;
        if (i == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    public final String k() {
        return this.c;
    }

    public Map l() {
        return Collections.emptyMap();
    }

    public final void n(String str) {
        if (fba.c) {
            this.a.a(str, Thread.currentThread().getId());
        }
    }

    public final void o(zzaqj zzaqjVar) {
        bba bbaVar;
        synchronized (this.e) {
            bbaVar = this.f;
        }
        bbaVar.a(zzaqjVar);
    }

    protected abstract void p(Object obj);

    final void q(String str) {
        aba abaVar = this.h;
        if (abaVar != null) {
            abaVar.b(this);
        }
        if (fba.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new raa(this, str, id));
            } else {
                this.a.a(str, id);
                this.a.b(toString());
            }
        }
    }

    public final void s() {
        synchronized (this.e) {
            this.i = true;
        }
    }

    final void t() {
        saa saaVar;
        synchronized (this.e) {
            saaVar = this.k;
        }
        if (saaVar != null) {
            saaVar.a(this);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.d));
        y();
        return "[ ] " + this.c + " " + "0x".concat(valueOf) + " NORMAL " + this.g;
    }

    final void u(dba dbaVar) {
        saa saaVar;
        synchronized (this.e) {
            saaVar = this.k;
        }
        if (saaVar != null) {
            saaVar.b(this, dbaVar);
        }
    }

    final void v(int i) {
        aba abaVar = this.h;
        if (abaVar != null) {
            abaVar.c(this, i);
        }
    }

    final void w(saa saaVar) {
        synchronized (this.e) {
            this.k = saaVar;
        }
    }

    public final boolean x() {
        boolean z;
        synchronized (this.e) {
            z = this.i;
        }
        return z;
    }

    public final boolean y() {
        synchronized (this.e) {
        }
        return false;
    }

    public byte[] z() {
        return null;
    }

    public final int zza() {
        return this.b;
    }
}
