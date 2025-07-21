package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.shd;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class e8 implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ zzq d;
    final /* synthetic */ boolean e;
    final /* synthetic */ m8 f;

    e8(m8 m8Var, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar, boolean z) {
        this.f = m8Var;
        this.a = atomicReference;
        this.b = str2;
        this.c = str3;
        this.d = zzqVar;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        m8 m8Var;
        shd shdVar;
        synchronized (this.a) {
            try {
                try {
                    m8Var = this.f;
                    shdVar = m8Var.d;
                } catch (RemoteException e) {
                    this.f.a.o().n().d("(legacy) Failed to get user properties; remote exception", null, this.b, e);
                    this.a.set(Collections.emptyList());
                    atomicReference = this.a;
                }
                if (shdVar == null) {
                    m8Var.a.o().n().d("(legacy) Failed to get user properties; not connected to service", null, this.b, this.c);
                    this.a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    Preconditions.checkNotNull(this.d);
                    this.a.set(shdVar.G2(this.b, this.c, this.e, this.d));
                } else {
                    this.a.set(shdVar.Z3(null, this.b, this.c, this.e));
                }
                this.f.D();
                atomicReference = this.a;
                atomicReference.notify();
            } finally {
                this.a.notify();
            }
        }
    }
}
