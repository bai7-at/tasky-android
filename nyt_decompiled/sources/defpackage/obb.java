package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzcl;

/* loaded from: classes3.dex */
public final class obb extends gwa implements sdb {
    obb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // defpackage.sdb
    public final void beginAdUnitExposure(String str, long j) {
        Parcel O = O();
        O.writeString(str);
        O.writeLong(j);
        l3(23, O);
    }

    @Override // defpackage.sdb
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        qya.e(O, bundle);
        l3(9, O);
    }

    @Override // defpackage.sdb
    public final void clearMeasurementEnabled(long j) {
        Parcel O = O();
        O.writeLong(j);
        l3(43, O);
    }

    @Override // defpackage.sdb
    public final void endAdUnitExposure(String str, long j) {
        Parcel O = O();
        O.writeString(str);
        O.writeLong(j);
        l3(24, O);
    }

    @Override // defpackage.sdb
    public final void generateEventId(chb chbVar) {
        Parcel O = O();
        qya.f(O, chbVar);
        l3(22, O);
    }

    @Override // defpackage.sdb
    public final void getCachedAppInstanceId(chb chbVar) {
        Parcel O = O();
        qya.f(O, chbVar);
        l3(19, O);
    }

    @Override // defpackage.sdb
    public final void getConditionalUserProperties(String str, String str2, chb chbVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        qya.f(O, chbVar);
        l3(10, O);
    }

    @Override // defpackage.sdb
    public final void getCurrentScreenClass(chb chbVar) {
        Parcel O = O();
        qya.f(O, chbVar);
        l3(17, O);
    }

    @Override // defpackage.sdb
    public final void getCurrentScreenName(chb chbVar) {
        Parcel O = O();
        qya.f(O, chbVar);
        l3(16, O);
    }

    @Override // defpackage.sdb
    public final void getGmpAppId(chb chbVar) {
        Parcel O = O();
        qya.f(O, chbVar);
        l3(21, O);
    }

    @Override // defpackage.sdb
    public final void getMaxUserProperties(String str, chb chbVar) {
        Parcel O = O();
        O.writeString(str);
        qya.f(O, chbVar);
        l3(6, O);
    }

    @Override // defpackage.sdb
    public final void getUserProperties(String str, String str2, boolean z, chb chbVar) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        qya.d(O, z);
        qya.f(O, chbVar);
        l3(5, O);
    }

    @Override // defpackage.sdb
    public final void initialize(ee3 ee3Var, zzcl zzclVar, long j) {
        Parcel O = O();
        qya.f(O, ee3Var);
        qya.e(O, zzclVar);
        O.writeLong(j);
        l3(1, O);
    }

    @Override // defpackage.sdb
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        qya.e(O, bundle);
        qya.d(O, z);
        qya.d(O, z2);
        O.writeLong(j);
        l3(2, O);
    }

    @Override // defpackage.sdb
    public final void logHealthData(int i, String str, ee3 ee3Var, ee3 ee3Var2, ee3 ee3Var3) {
        Parcel O = O();
        O.writeInt(5);
        O.writeString(str);
        qya.f(O, ee3Var);
        qya.f(O, ee3Var2);
        qya.f(O, ee3Var3);
        l3(33, O);
    }

    @Override // defpackage.sdb
    public final void onActivityCreated(ee3 ee3Var, Bundle bundle, long j) {
        Parcel O = O();
        qya.f(O, ee3Var);
        qya.e(O, bundle);
        O.writeLong(j);
        l3(27, O);
    }

    @Override // defpackage.sdb
    public final void onActivityDestroyed(ee3 ee3Var, long j) {
        Parcel O = O();
        qya.f(O, ee3Var);
        O.writeLong(j);
        l3(28, O);
    }

    @Override // defpackage.sdb
    public final void onActivityPaused(ee3 ee3Var, long j) {
        Parcel O = O();
        qya.f(O, ee3Var);
        O.writeLong(j);
        l3(29, O);
    }

    @Override // defpackage.sdb
    public final void onActivityResumed(ee3 ee3Var, long j) {
        Parcel O = O();
        qya.f(O, ee3Var);
        O.writeLong(j);
        l3(30, O);
    }

    @Override // defpackage.sdb
    public final void onActivitySaveInstanceState(ee3 ee3Var, chb chbVar, long j) {
        Parcel O = O();
        qya.f(O, ee3Var);
        qya.f(O, chbVar);
        O.writeLong(j);
        l3(31, O);
    }

    @Override // defpackage.sdb
    public final void onActivityStarted(ee3 ee3Var, long j) {
        Parcel O = O();
        qya.f(O, ee3Var);
        O.writeLong(j);
        l3(25, O);
    }

    @Override // defpackage.sdb
    public final void onActivityStopped(ee3 ee3Var, long j) {
        Parcel O = O();
        qya.f(O, ee3Var);
        O.writeLong(j);
        l3(26, O);
    }

    @Override // defpackage.sdb
    public final void performAction(Bundle bundle, chb chbVar, long j) {
        Parcel O = O();
        qya.e(O, bundle);
        qya.f(O, chbVar);
        O.writeLong(j);
        l3(32, O);
    }

    @Override // defpackage.sdb
    public final void registerOnMeasurementEventListener(skb skbVar) {
        Parcel O = O();
        qya.f(O, skbVar);
        l3(35, O);
    }

    @Override // defpackage.sdb
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel O = O();
        qya.e(O, bundle);
        O.writeLong(j);
        l3(8, O);
    }

    @Override // defpackage.sdb
    public final void setConsent(Bundle bundle, long j) {
        Parcel O = O();
        qya.e(O, bundle);
        O.writeLong(j);
        l3(44, O);
    }

    @Override // defpackage.sdb
    public final void setCurrentScreen(ee3 ee3Var, String str, String str2, long j) {
        Parcel O = O();
        qya.f(O, ee3Var);
        O.writeString(str);
        O.writeString(str2);
        O.writeLong(j);
        l3(15, O);
    }

    @Override // defpackage.sdb
    public final void setDataCollectionEnabled(boolean z) {
        Parcel O = O();
        qya.d(O, z);
        l3(39, O);
    }

    @Override // defpackage.sdb
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel O = O();
        qya.d(O, z);
        O.writeLong(j);
        l3(11, O);
    }

    @Override // defpackage.sdb
    public final void setUserId(String str, long j) {
        Parcel O = O();
        O.writeString(str);
        O.writeLong(j);
        l3(7, O);
    }

    @Override // defpackage.sdb
    public final void setUserProperty(String str, String str2, ee3 ee3Var, boolean z, long j) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        qya.f(O, ee3Var);
        qya.d(O, z);
        O.writeLong(j);
        l3(4, O);
    }
}
