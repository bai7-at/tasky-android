package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.zzd;
import defpackage.ogd;
import defpackage.q3f;
import defpackage.uab;
import defpackage.vq9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class t5 extends ogd {
    private final r9 a;
    private Boolean b;
    private String c;

    public t5(r9 r9Var, String str) {
        Preconditions.checkNotNull(r9Var);
        this.a = r9Var;
        this.c = null;
    }

    private final void Q1(zzaw zzawVar, zzq zzqVar) {
        this.a.a();
        this.a.d(zzawVar, zzqVar);
    }

    private final void h6(zzq zzqVar, boolean z) {
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        v6(zzqVar.zza, false);
        this.a.f0().K(zzqVar.zzb, zzqVar.zzq);
    }

    private final void v6(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.a.o().n().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.b == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.c) && !UidVerifier.isGooglePlayServicesUid(this.a.zzau(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(this.a.zzau()).isUidGoogleSigned(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    this.b = Boolean.valueOf(z2);
                }
                if (this.b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.a.o().n().b("Measurement Service called with invalid calling package. appId", x3.y(str));
                throw e;
            }
        }
        if (this.c == null && GooglePlayServicesUtilLight.uidHasPackageName(this.a.zzau(), Binder.getCallingUid(), str)) {
            this.c = str;
        }
        if (str.equals(this.c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // defpackage.shd
    public final void D2(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        Preconditions.checkNotNull(zzqVar.zzv);
        k5 k5Var = new k5(this, zzqVar);
        Preconditions.checkNotNull(k5Var);
        if (this.a.e().B()) {
            k5Var.run();
        } else {
            this.a.e().z(k5Var);
        }
    }

    @Override // defpackage.shd
    public final List G2(String str, String str2, boolean z, zzq zzqVar) {
        h6(zzqVar, false);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<v9> list = (List) this.a.e().r(new e5(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (v9 v9Var : list) {
                if (!z && x9.V(v9Var.c)) {
                }
                arrayList.add(new zzlo(v9Var));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.o().n().c("Failed to query user properties. appId", x3.y(zzqVar.zza), e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.shd
    public final void L0(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zza);
        v6(zzacVar.zza, true);
        Y4(new d5(this, new zzac(zzacVar)));
    }

    @Override // defpackage.shd
    public final void L1(zzlo zzloVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzloVar);
        h6(zzqVar, false);
        Y4(new o5(this, zzloVar, zzqVar));
    }

    @Override // defpackage.shd
    public final void M5(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        h6(zzqVar, false);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.zza = zzqVar.zza;
        Y4(new c5(this, zzacVar2, zzqVar));
    }

    @Override // defpackage.shd
    public final List O0(zzq zzqVar, boolean z) {
        h6(zzqVar, false);
        String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<v9> list = (List) this.a.e().r(new p5(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (v9 v9Var : list) {
                if (!z && x9.V(v9Var.c)) {
                }
                arrayList.add(new zzlo(v9Var));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.o().n().c("Failed to get user properties. appId", x3.y(zzqVar.zza), e);
            return null;
        }
    }

    @Override // defpackage.shd
    public final void R1(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzawVar);
        h6(zzqVar, false);
        Y4(new l5(this, zzawVar, zzqVar));
    }

    @Override // defpackage.shd
    public final void S2(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        v6(zzqVar.zza, false);
        Y4(new i5(this, zzqVar));
    }

    @Override // defpackage.shd
    public final void S3(zzq zzqVar) {
        h6(zzqVar, false);
        Y4(new j5(this, zzqVar));
    }

    @Override // defpackage.shd
    public final void X1(zzq zzqVar) {
        h6(zzqVar, false);
        Y4(new r5(this, zzqVar));
    }

    @Override // defpackage.shd
    public final void Y3(final Bundle bundle, zzq zzqVar) {
        h6(zzqVar, false);
        final String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        Y4(new Runnable() { // from class: com.google.android.gms.measurement.internal.b5
            @Override // java.lang.Runnable
            public final void run() {
                t5.this.x4(str, bundle);
            }
        });
    }

    final void Y4(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.a.e().B()) {
            runnable.run();
        } else {
            this.a.e().y(runnable);
        }
    }

    @Override // defpackage.shd
    public final List Z3(String str, String str2, String str3, boolean z) {
        v6(str, true);
        try {
            List<v9> list = (List) this.a.e().r(new f5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (v9 v9Var : list) {
                if (!z && x9.V(v9Var.c)) {
                }
                arrayList.add(new zzlo(v9Var));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.o().n().c("Failed to get user properties as. appId", x3.y(str), e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.shd
    public final List d5(String str, String str2, zzq zzqVar) {
        h6(zzqVar, false);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.a.e().r(new g5(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.o().n().b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.shd
    public final void g2(long j, String str, String str2, String str3) {
        Y4(new s5(this, str2, str3, str, j));
    }

    @Override // defpackage.shd
    public final byte[] k4(zzaw zzawVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzawVar);
        v6(str, true);
        this.a.o().m().b("Log and bundle. event", this.a.V().d(zzawVar.zza));
        long nanoTime = this.a.p().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.e().s(new n5(this, zzawVar, str)).get();
            if (bArr == null) {
                this.a.o().n().b("Log and bundle returned null. appId", x3.y(str));
                bArr = new byte[0];
            }
            this.a.o().m().d("Log and bundle processed. event, size, time_ms", this.a.V().d(zzawVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.a.p().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.a.o().n().d("Failed to log and bundle. appId, event, error", x3.y(str), this.a.V().d(zzawVar.zza), e);
            return null;
        }
    }

    final zzaw l3(zzaw zzawVar, zzq zzqVar) {
        zzau zzauVar;
        if ("_cmp".equals(zzawVar.zza) && (zzauVar = zzawVar.zzb) != null && zzauVar.zza() != 0) {
            String u1 = zzawVar.zzb.u1("_cis");
            if ("referrer broadcast".equals(u1) || "referrer API".equals(u1)) {
                this.a.o().t().b("Event has been filtered ", zzawVar.toString());
                return new zzaw("_cmpx", zzawVar.zzb, zzawVar.zzc, zzawVar.zzd);
            }
        }
        return zzawVar;
    }

    @Override // defpackage.shd
    public final void m5(zzaw zzawVar, String str, String str2) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotEmpty(str);
        v6(str, true);
        Y4(new m5(this, zzawVar, str));
    }

    @Override // defpackage.shd
    public final String r4(zzq zzqVar) {
        h6(zzqVar, false);
        return this.a.h0(zzqVar);
    }

    final void s4(zzaw zzawVar, zzq zzqVar) {
        if (!this.a.Y().B(zzqVar.zza)) {
            Q1(zzawVar, zzqVar);
            return;
        }
        this.a.o().u().b("EES config found for", zzqVar.zza);
        u4 Y = this.a.Y();
        String str = zzqVar.zza;
        uab uabVar = TextUtils.isEmpty(str) ? null : (uab) Y.j.d(str);
        if (uabVar == null) {
            this.a.o().u().b("EES not loaded for", zzqVar.zza);
            Q1(zzawVar, zzqVar);
            return;
        }
        try {
            Map H = this.a.e0().H(zzawVar.zzb.G0(), true);
            String a = q3f.a(zzawVar.zza);
            if (a == null) {
                a = zzawVar.zza;
            }
            if (uabVar.e(new vq9(a, zzawVar.zzd, H))) {
                if (uabVar.g()) {
                    this.a.o().u().b("EES edited event", zzawVar.zza);
                    Q1(this.a.e0().z(uabVar.a().b()), zzqVar);
                } else {
                    Q1(zzawVar, zzqVar);
                }
                if (uabVar.f()) {
                    for (vq9 vq9Var : uabVar.a().c()) {
                        this.a.o().u().b("EES logging created event", vq9Var.d());
                        Q1(this.a.e0().z(vq9Var), zzqVar);
                    }
                    return;
                }
                return;
            }
        } catch (zzd unused) {
            this.a.o().n().c("EES error. appId, eventName", zzqVar.zzb, zzawVar.zza);
        }
        this.a.o().u().b("EES was not applied to event", zzawVar.zza);
        Q1(zzawVar, zzqVar);
    }

    @Override // defpackage.shd
    public final List w4(String str, String str2, String str3) {
        v6(str, true);
        try {
            return (List) this.a.e().r(new h5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.o().n().b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    final /* synthetic */ void x4(String str, Bundle bundle) {
        k U = this.a.U();
        U.c();
        U.d();
        byte[] e = U.b.e0().A(new p(U.a, "", str, "dep", 0L, 0L, bundle)).e();
        U.a.o().u().c("Saving default event parameters, appId, data size", U.a.C().d(str), Integer.valueOf(e.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", e);
        try {
            if (U.O().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                U.a.o().n().b("Failed to insert default event parameters (got -1). appId", x3.y(str));
            }
        } catch (SQLiteException e2) {
            U.a.o().n().c("Error storing default event parameters. appId", x3.y(str), e2);
        }
    }
}
