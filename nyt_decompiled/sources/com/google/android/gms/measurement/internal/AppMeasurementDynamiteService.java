package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzcl;
import defpackage.chb;
import defpackage.ee3;
import defpackage.fc5;
import defpackage.i8f;
import defpackage.nmb;
import defpackage.scb;
import defpackage.skb;
import defpackage.so;
import defpackage.x4f;
import java.util.Map;

@DynamiteApi
/* loaded from: classes3.dex */
public class AppMeasurementDynamiteService extends scb {
    a5 a = null;
    private final Map b = new so();

    private final void Q1(chb chbVar, String str) {
        zzb();
        this.a.M().I(chbVar, str);
    }

    private final void zzb() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // defpackage.sdb
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.a.x().h(str, j);
    }

    @Override // defpackage.sdb
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        this.a.H().k(str, str2, bundle);
    }

    @Override // defpackage.sdb
    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        this.a.H().J(null);
    }

    @Override // defpackage.sdb
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.a.x().i(str, j);
    }

    @Override // defpackage.sdb
    public void generateEventId(chb chbVar) throws RemoteException {
        zzb();
        long q0 = this.a.M().q0();
        zzb();
        this.a.M().H(chbVar, q0);
    }

    @Override // defpackage.sdb
    public void getAppInstanceId(chb chbVar) throws RemoteException {
        zzb();
        this.a.e().y(new k6(this, chbVar));
    }

    @Override // defpackage.sdb
    public void getCachedAppInstanceId(chb chbVar) throws RemoteException {
        zzb();
        Q1(chbVar, this.a.H().X());
    }

    @Override // defpackage.sdb
    public void getConditionalUserProperties(String str, String str2, chb chbVar) throws RemoteException {
        zzb();
        this.a.e().y(new y9(this, chbVar, str, str2));
    }

    @Override // defpackage.sdb
    public void getCurrentScreenClass(chb chbVar) throws RemoteException {
        zzb();
        Q1(chbVar, this.a.H().Y());
    }

    @Override // defpackage.sdb
    public void getCurrentScreenName(chb chbVar) throws RemoteException {
        zzb();
        Q1(chbVar, this.a.H().Z());
    }

    @Override // defpackage.sdb
    public void getGmpAppId(chb chbVar) throws RemoteException {
        String str;
        zzb();
        z6 H = this.a.H();
        if (H.a.N() != null) {
            str = H.a.N();
        } else {
            try {
                str = i8f.c(H.a.zzau(), "google_app_id", H.a.Q());
            } catch (IllegalStateException e) {
                H.a.o().n().b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        Q1(chbVar, str);
    }

    @Override // defpackage.sdb
    public void getMaxUserProperties(String str, chb chbVar) throws RemoteException {
        zzb();
        this.a.H().S(str);
        zzb();
        this.a.M().G(chbVar, 25);
    }

    @Override // defpackage.sdb
    public void getTestFlag(chb chbVar, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            this.a.M().I(chbVar, this.a.H().a0());
            return;
        }
        if (i == 1) {
            this.a.M().H(chbVar, this.a.H().W().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.a.M().G(chbVar, this.a.H().V().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.a.M().C(chbVar, this.a.H().T().booleanValue());
                return;
            }
        }
        x9 M = this.a.M();
        double doubleValue = this.a.H().U().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble(QueryKeys.EXTERNAL_REFERRER, doubleValue);
        try {
            chbVar.G(bundle);
        } catch (RemoteException e) {
            M.a.o().v().b("Error returning double value to wrapper", e);
        }
    }

    @Override // defpackage.sdb
    public void getUserProperties(String str, String str2, boolean z, chb chbVar) throws RemoteException {
        zzb();
        this.a.e().y(new h8(this, chbVar, str, str2, z));
    }

    @Override // defpackage.sdb
    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    @Override // defpackage.sdb
    public void initialize(ee3 ee3Var, zzcl zzclVar, long j) throws RemoteException {
        a5 a5Var = this.a;
        if (a5Var == null) {
            this.a = a5.G((Context) Preconditions.checkNotNull((Context) fc5.Q1(ee3Var)), zzclVar, Long.valueOf(j));
        } else {
            a5Var.o().v().a("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.sdb
    public void isDataCollectionEnabled(chb chbVar) throws RemoteException {
        zzb();
        this.a.e().y(new z9(this, chbVar));
    }

    @Override // defpackage.sdb
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        this.a.H().s(str, str2, bundle, z, z2, j);
    }

    @Override // defpackage.sdb
    public void logEventAndBundle(String str, String str2, Bundle bundle, chb chbVar, long j) throws RemoteException {
        zzb();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.a.e().y(new h7(this, chbVar, new zzaw(str2, new zzau(bundle), "app", j), str));
    }

    @Override // defpackage.sdb
    public void logHealthData(int i, String str, ee3 ee3Var, ee3 ee3Var2, ee3 ee3Var3) throws RemoteException {
        zzb();
        this.a.o().E(i, true, false, str, ee3Var == null ? null : fc5.Q1(ee3Var), ee3Var2 == null ? null : fc5.Q1(ee3Var2), ee3Var3 != null ? fc5.Q1(ee3Var3) : null);
    }

    @Override // defpackage.sdb
    public void onActivityCreated(ee3 ee3Var, Bundle bundle, long j) throws RemoteException {
        zzb();
        y6 y6Var = this.a.H().c;
        if (y6Var != null) {
            this.a.H().l();
            y6Var.onActivityCreated((Activity) fc5.Q1(ee3Var), bundle);
        }
    }

    @Override // defpackage.sdb
    public void onActivityDestroyed(ee3 ee3Var, long j) throws RemoteException {
        zzb();
        y6 y6Var = this.a.H().c;
        if (y6Var != null) {
            this.a.H().l();
            y6Var.onActivityDestroyed((Activity) fc5.Q1(ee3Var));
        }
    }

    @Override // defpackage.sdb
    public void onActivityPaused(ee3 ee3Var, long j) throws RemoteException {
        zzb();
        y6 y6Var = this.a.H().c;
        if (y6Var != null) {
            this.a.H().l();
            y6Var.onActivityPaused((Activity) fc5.Q1(ee3Var));
        }
    }

    @Override // defpackage.sdb
    public void onActivityResumed(ee3 ee3Var, long j) throws RemoteException {
        zzb();
        y6 y6Var = this.a.H().c;
        if (y6Var != null) {
            this.a.H().l();
            y6Var.onActivityResumed((Activity) fc5.Q1(ee3Var));
        }
    }

    @Override // defpackage.sdb
    public void onActivitySaveInstanceState(ee3 ee3Var, chb chbVar, long j) throws RemoteException {
        zzb();
        y6 y6Var = this.a.H().c;
        Bundle bundle = new Bundle();
        if (y6Var != null) {
            this.a.H().l();
            y6Var.onActivitySaveInstanceState((Activity) fc5.Q1(ee3Var), bundle);
        }
        try {
            chbVar.G(bundle);
        } catch (RemoteException e) {
            this.a.o().v().b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // defpackage.sdb
    public void onActivityStarted(ee3 ee3Var, long j) throws RemoteException {
        zzb();
        if (this.a.H().c != null) {
            this.a.H().l();
        }
    }

    @Override // defpackage.sdb
    public void onActivityStopped(ee3 ee3Var, long j) throws RemoteException {
        zzb();
        if (this.a.H().c != null) {
            this.a.H().l();
        }
    }

    @Override // defpackage.sdb
    public void performAction(Bundle bundle, chb chbVar, long j) throws RemoteException {
        zzb();
        chbVar.G(null);
    }

    @Override // defpackage.sdb
    public void registerOnMeasurementEventListener(skb skbVar) throws RemoteException {
        x4f x4fVar;
        zzb();
        synchronized (this.b) {
            try {
                x4fVar = (x4f) this.b.get(Integer.valueOf(skbVar.zzd()));
                if (x4fVar == null) {
                    x4fVar = new ba(this, skbVar);
                    this.b.put(Integer.valueOf(skbVar.zzd()), x4fVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.H().x(x4fVar);
    }

    @Override // defpackage.sdb
    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        this.a.H().y(j);
    }

    @Override // defpackage.sdb
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            this.a.o().n().a("Conditional user property must not be null");
        } else {
            this.a.H().E(bundle, j);
        }
    }

    @Override // defpackage.sdb
    public void setConsent(Bundle bundle, long j) throws RemoteException {
        zzb();
        this.a.H().H(bundle, j);
    }

    @Override // defpackage.sdb
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        zzb();
        this.a.H().F(bundle, -20, j);
    }

    @Override // defpackage.sdb
    public void setCurrentScreen(ee3 ee3Var, String str, String str2, long j) throws RemoteException {
        zzb();
        this.a.J().D((Activity) fc5.Q1(ee3Var), str, str2);
    }

    @Override // defpackage.sdb
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        z6 H = this.a.H();
        H.d();
        H.a.e().y(new w6(H, z));
    }

    @Override // defpackage.sdb
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        final z6 H = this.a.H();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        H.a.e().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.a6
            @Override // java.lang.Runnable
            public final void run() {
                z6.this.n(bundle2);
            }
        });
    }

    @Override // defpackage.sdb
    public void setEventInterceptor(skb skbVar) throws RemoteException {
        zzb();
        aa aaVar = new aa(this, skbVar);
        if (this.a.e().B()) {
            this.a.H().I(aaVar);
        } else {
            this.a.e().y(new h9(this, aaVar));
        }
    }

    @Override // defpackage.sdb
    public void setInstanceIdProvider(nmb nmbVar) throws RemoteException {
        zzb();
    }

    @Override // defpackage.sdb
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        this.a.H().J(Boolean.valueOf(z));
    }

    @Override // defpackage.sdb
    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    @Override // defpackage.sdb
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        z6 H = this.a.H();
        H.a.e().y(new e6(H, j));
    }

    @Override // defpackage.sdb
    public void setUserId(final String str, long j) throws RemoteException {
        zzb();
        final z6 H = this.a.H();
        if (str != null && TextUtils.isEmpty(str)) {
            H.a.o().v().a("User ID must be non-empty or null");
        } else {
            H.a.e().y(new Runnable() { // from class: com.google.android.gms.measurement.internal.b6
                @Override // java.lang.Runnable
                public final void run() {
                    z6 z6Var = z6.this;
                    if (z6Var.a.A().v(str)) {
                        z6Var.a.A().u();
                    }
                }
            });
            H.M(null, TransferTable.COLUMN_ID, str, true, j);
        }
    }

    @Override // defpackage.sdb
    public void setUserProperty(String str, String str2, ee3 ee3Var, boolean z, long j) throws RemoteException {
        zzb();
        this.a.H().M(str, str2, fc5.Q1(ee3Var), z, j);
    }

    @Override // defpackage.sdb
    public void unregisterOnMeasurementEventListener(skb skbVar) throws RemoteException {
        x4f x4fVar;
        zzb();
        synchronized (this.b) {
            x4fVar = (x4f) this.b.remove(Integer.valueOf(skbVar.zzd()));
        }
        if (x4fVar == null) {
            x4fVar = new ba(this, skbVar);
        }
        this.a.H().O(x4fVar);
    }
}
