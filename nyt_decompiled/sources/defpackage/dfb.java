package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class dfb {
    private final Clock a;
    private final nfb b;
    private final String e;
    private final String f;
    private final Object d = new Object();
    private long g = -1;
    private long h = -1;
    private long i = 0;
    private long j = -1;
    private long k = -1;
    private final LinkedList c = new LinkedList();

    dfb(Clock clock, nfb nfbVar, String str, String str2) {
        this.a = clock;
        this.b = nfbVar;
        this.e = str;
        this.f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.e);
                bundle.putString("slotid", this.f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.j);
                bundle.putLong("tresponse", this.k);
                bundle.putLong("timp", this.g);
                bundle.putLong("tload", this.h);
                bundle.putLong("pcc", this.i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((cfb) it2.next()).b());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final String c() {
        return this.e;
    }

    public final void d() {
        synchronized (this.d) {
            try {
                if (this.k != -1) {
                    cfb cfbVar = new cfb(this);
                    cfbVar.d();
                    this.c.add(cfbVar);
                    this.i++;
                    this.b.f();
                    this.b.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.d) {
            try {
                if (this.k != -1 && !this.c.isEmpty()) {
                    cfb cfbVar = (cfb) this.c.getLast();
                    if (cfbVar.a() == -1) {
                        cfbVar.c();
                        this.b.e(this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.d) {
            try {
                if (this.k != -1 && this.g == -1) {
                    this.g = this.a.elapsedRealtime();
                    this.b.e(this);
                }
                this.b.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.d) {
            this.b.h();
        }
    }

    public final void h(boolean z) {
        synchronized (this.d) {
            try {
                if (this.k != -1) {
                    this.h = this.a.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.d) {
            this.b.i();
        }
    }

    public final void j(zzl zzlVar) {
        synchronized (this.d) {
            long elapsedRealtime = this.a.elapsedRealtime();
            this.j = elapsedRealtime;
            this.b.j(zzlVar, elapsedRealtime);
        }
    }

    public final void k(long j) {
        synchronized (this.d) {
            try {
                this.k = j;
                if (j != -1) {
                    this.b.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
