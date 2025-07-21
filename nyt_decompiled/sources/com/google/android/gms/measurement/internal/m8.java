package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import defpackage.chb;
import defpackage.shd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class m8 extends w3 {
    private final l8 c;
    private shd d;
    private volatile Boolean e;
    private final n f;
    private final c9 g;
    private final List h;
    private final n i;

    protected m8(a5 a5Var) {
        super(a5Var);
        this.h = new ArrayList();
        this.g = new c9(a5Var.p());
        this.c = new l8(this);
        this.f = new v7(this, a5Var);
        this.i = new x7(this, a5Var);
    }

    private final zzq B(boolean z) {
        Pair a;
        this.a.q();
        o3 A = this.a.A();
        String str = null;
        if (z) {
            x3 o = this.a.o();
            if (o.a.E().d != null && (a = o.a.E().d.a()) != null && a != k4.x) {
                str = String.valueOf(a.second) + ":" + ((String) a.first);
            }
        }
        return A.m(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        c();
        this.a.o().u().b("Processing queued up service tasks", Integer.valueOf(this.h.size()));
        Iterator it2 = this.h.iterator();
        while (it2.hasNext()) {
            try {
                ((Runnable) it2.next()).run();
            } catch (RuntimeException e) {
                this.a.o().n().b("Task exception while flushing queue", e);
            }
        }
        this.h.clear();
        this.i.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        c();
        this.g.b();
        n nVar = this.f;
        this.a.y();
        nVar.d(((Long) m3.K.a(null)).longValue());
    }

    private final void E(Runnable runnable) {
        c();
        if (y()) {
            runnable.run();
            return;
        }
        int size = this.h.size();
        this.a.y();
        if (size >= 1000) {
            this.a.o().n().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.h.add(runnable);
        this.i.d(60000L);
        O();
    }

    private final boolean F() {
        this.a.q();
        return true;
    }

    static /* bridge */ /* synthetic */ void L(m8 m8Var, ComponentName componentName) {
        m8Var.c();
        if (m8Var.d != null) {
            m8Var.d = null;
            m8Var.a.o().u().b("Disconnected from device MeasurementService", componentName);
            m8Var.c();
            m8Var.O();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean A() {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m8.A():boolean");
    }

    final Boolean I() {
        return this.e;
    }

    protected final void N() {
        c();
        d();
        zzq B = B(true);
        this.a.B().n();
        E(new s7(this, B));
    }

    final void O() {
        c();
        d();
        if (y()) {
            return;
        }
        if (A()) {
            this.c.c();
            return;
        }
        if (this.a.y().F()) {
            return;
        }
        this.a.q();
        List<ResolveInfo> queryIntentServices = this.a.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(this.a.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.a.o().n().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context zzau = this.a.zzau();
        this.a.q();
        intent.setComponent(new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
        this.c.b(intent);
    }

    public final void P() {
        c();
        d();
        this.c.d();
        try {
            ConnectionTracker.getInstance().unbindService(this.a.zzau(), this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final void Q(chb chbVar) {
        c();
        d();
        E(new r7(this, B(false), chbVar));
    }

    public final void R(AtomicReference atomicReference) {
        c();
        d();
        E(new q7(this, atomicReference, B(false)));
    }

    protected final void S(chb chbVar, String str, String str2) {
        c();
        d();
        E(new d8(this, str, str2, B(false), chbVar));
    }

    protected final void T(AtomicReference atomicReference, String str, String str2, String str3) {
        c();
        d();
        E(new c8(this, atomicReference, null, str2, str3, B(false)));
    }

    protected final void U(chb chbVar, String str, String str2, boolean z) {
        c();
        d();
        E(new n7(this, str, str2, B(false), z, chbVar));
    }

    protected final void V(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        c();
        d();
        E(new e8(this, atomicReference, null, str2, str3, B(false), z));
    }

    @Override // com.google.android.gms.measurement.internal.w3
    protected final boolean j() {
        return false;
    }

    protected final void k(zzaw zzawVar, String str) {
        Preconditions.checkNotNull(zzawVar);
        c();
        d();
        F();
        E(new a8(this, true, B(true), this.a.B().u(zzawVar), zzawVar, str));
    }

    public final void l(chb chbVar, zzaw zzawVar, String str) {
        c();
        d();
        if (this.a.M().o0(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0) {
            E(new w7(this, zzawVar, str, chbVar));
        } else {
            this.a.o().v().a("Not bundling data. Service unavailable or out of date");
            this.a.M().F(chbVar, new byte[0]);
        }
    }

    protected final void m() {
        c();
        d();
        zzq B = B(false);
        F();
        this.a.B().m();
        E(new p7(this, B));
    }

    final void n(shd shdVar, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int i;
        c();
        d();
        F();
        this.a.y();
        int i2 = 100;
        int i3 = 0;
        while (i3 < 1001 && i2 == 100) {
            ArrayList arrayList = new ArrayList();
            List l = this.a.B().l(100);
            if (l != null) {
                arrayList.addAll(l);
                i = l.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        shdVar.R1((zzaw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e) {
                        this.a.o().n().b("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzlo) {
                    try {
                        shdVar.L1((zzlo) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e2) {
                        this.a.o().n().b("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        shdVar.M5((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e3) {
                        this.a.o().n().b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.a.o().n().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i2 = i;
        }
    }

    protected final void r(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        c();
        d();
        this.a.q();
        E(new b8(this, true, B(true), this.a.B().t(zzacVar), new zzac(zzacVar), zzacVar));
    }

    protected final void s(boolean z) {
        c();
        d();
        if (z) {
            F();
            this.a.B().m();
        }
        if (z()) {
            E(new z7(this, B(false)));
        }
    }

    protected final void t(e7 e7Var) {
        c();
        d();
        E(new t7(this, e7Var));
    }

    public final void u(Bundle bundle) {
        c();
        d();
        E(new u7(this, B(false), bundle));
    }

    protected final void v() {
        c();
        d();
        E(new y7(this, B(true)));
    }

    protected final void w(shd shdVar) {
        c();
        Preconditions.checkNotNull(shdVar);
        this.d = shdVar;
        D();
        C();
    }

    protected final void x(zzlo zzloVar) {
        c();
        d();
        F();
        E(new o7(this, B(true), this.a.B().v(zzloVar), zzloVar));
    }

    public final boolean y() {
        c();
        d();
        return this.d != null;
    }

    final boolean z() {
        c();
        d();
        return !A() || this.a.M().n0() >= ((Integer) m3.k0.a(null)).intValue();
    }
}
