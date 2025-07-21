package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.gms.internal.measurement.zzcl;
import defpackage.ee3;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class scb extends lxa implements sdb {
    public scb() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static sdb asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof sdb ? (sdb) queryLocalInterface : new obb(iBinder);
    }

    @Override // defpackage.lxa
    protected final boolean O(int i, Parcel parcel, Parcel parcel2, int i2) {
        chb chbVar = null;
        chb chbVar2 = null;
        chb chbVar3 = null;
        skb skbVar = null;
        skb skbVar2 = null;
        skb skbVar3 = null;
        chb chbVar4 = null;
        chb chbVar5 = null;
        chb chbVar6 = null;
        chb chbVar7 = null;
        chb chbVar8 = null;
        chb chbVar9 = null;
        nmb nmbVar = null;
        chb chbVar10 = null;
        chb chbVar11 = null;
        chb chbVar12 = null;
        chb chbVar13 = null;
        chb chbVar14 = null;
        switch (i) {
            case 1:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                zzcl zzclVar = (zzcl) qya.a(parcel, zzcl.CREATOR);
                long readLong = parcel.readLong();
                qya.c(parcel);
                initialize(O, zzclVar, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) qya.a(parcel, Bundle.CREATOR);
                boolean g = qya.g(parcel);
                boolean g2 = qya.g(parcel);
                long readLong2 = parcel.readLong();
                qya.c(parcel);
                logEvent(readString, readString2, bundle, g, g2, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) qya.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    chbVar = queryLocalInterface instanceof chb ? (chb) queryLocalInterface : new web(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                qya.c(parcel);
                logEventAndBundle(readString3, readString4, bundle2, chbVar, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                boolean g3 = qya.g(parcel);
                long readLong4 = parcel.readLong();
                qya.c(parcel);
                setUserProperty(readString5, readString6, O2, g3, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean g4 = qya.g(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    chbVar14 = queryLocalInterface2 instanceof chb ? (chb) queryLocalInterface2 : new web(readStrongBinder2);
                }
                qya.c(parcel);
                getUserProperties(readString7, readString8, g4, chbVar14);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    chbVar13 = queryLocalInterface3 instanceof chb ? (chb) queryLocalInterface3 : new web(readStrongBinder3);
                }
                qya.c(parcel);
                getMaxUserProperties(readString9, chbVar13);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                qya.c(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) qya.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                qya.c(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) qya.a(parcel, Bundle.CREATOR);
                qya.c(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    chbVar12 = queryLocalInterface4 instanceof chb ? (chb) queryLocalInterface4 : new web(readStrongBinder4);
                }
                qya.c(parcel);
                getConditionalUserProperties(readString13, readString14, chbVar12);
                break;
            case 11:
                boolean g5 = qya.g(parcel);
                long readLong7 = parcel.readLong();
                qya.c(parcel);
                setMeasurementEnabled(g5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                qya.c(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                qya.c(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                qya.c(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                ee3 O3 = ee3.a.O(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                qya.c(parcel);
                setCurrentScreen(O3, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    chbVar11 = queryLocalInterface5 instanceof chb ? (chb) queryLocalInterface5 : new web(readStrongBinder5);
                }
                qya.c(parcel);
                getCurrentScreenName(chbVar11);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    chbVar10 = queryLocalInterface6 instanceof chb ? (chb) queryLocalInterface6 : new web(readStrongBinder6);
                }
                qya.c(parcel);
                getCurrentScreenClass(chbVar10);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    nmbVar = queryLocalInterface7 instanceof nmb ? (nmb) queryLocalInterface7 : new klb(readStrongBinder7);
                }
                qya.c(parcel);
                setInstanceIdProvider(nmbVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    chbVar9 = queryLocalInterface8 instanceof chb ? (chb) queryLocalInterface8 : new web(readStrongBinder8);
                }
                qya.c(parcel);
                getCachedAppInstanceId(chbVar9);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    chbVar8 = queryLocalInterface9 instanceof chb ? (chb) queryLocalInterface9 : new web(readStrongBinder9);
                }
                qya.c(parcel);
                getAppInstanceId(chbVar8);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    chbVar7 = queryLocalInterface10 instanceof chb ? (chb) queryLocalInterface10 : new web(readStrongBinder10);
                }
                qya.c(parcel);
                getGmpAppId(chbVar7);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    chbVar6 = queryLocalInterface11 instanceof chb ? (chb) queryLocalInterface11 : new web(readStrongBinder11);
                }
                qya.c(parcel);
                generateEventId(chbVar6);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                qya.c(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                qya.c(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case EventType.SUBS /* 25 */:
                ee3 O4 = ee3.a.O(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                qya.c(parcel);
                onActivityStarted(O4, readLong14);
                break;
            case EventType.CDN /* 26 */:
                ee3 O5 = ee3.a.O(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                qya.c(parcel);
                onActivityStopped(O5, readLong15);
                break;
            case 27:
                ee3 O6 = ee3.a.O(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) qya.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                qya.c(parcel);
                onActivityCreated(O6, bundle5, readLong16);
                break;
            case 28:
                ee3 O7 = ee3.a.O(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                qya.c(parcel);
                onActivityDestroyed(O7, readLong17);
                break;
            case BuildConfig.VERSION_CODE /* 29 */:
                ee3 O8 = ee3.a.O(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                qya.c(parcel);
                onActivityPaused(O8, readLong18);
                break;
            case 30:
                ee3 O9 = ee3.a.O(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                qya.c(parcel);
                onActivityResumed(O9, readLong19);
                break;
            case 31:
                ee3 O10 = ee3.a.O(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    chbVar5 = queryLocalInterface12 instanceof chb ? (chb) queryLocalInterface12 : new web(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                qya.c(parcel);
                onActivitySaveInstanceState(O10, chbVar5, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) qya.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    chbVar4 = queryLocalInterface13 instanceof chb ? (chb) queryLocalInterface13 : new web(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                qya.c(parcel);
                performAction(bundle6, chbVar4, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                ee3 O11 = ee3.a.O(parcel.readStrongBinder());
                ee3 O12 = ee3.a.O(parcel.readStrongBinder());
                ee3 O13 = ee3.a.O(parcel.readStrongBinder());
                qya.c(parcel);
                logHealthData(readInt, readString19, O11, O12, O13);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    skbVar3 = queryLocalInterface14 instanceof skb ? (skb) queryLocalInterface14 : new iib(readStrongBinder14);
                }
                qya.c(parcel);
                setEventInterceptor(skbVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    skbVar2 = queryLocalInterface15 instanceof skb ? (skb) queryLocalInterface15 : new iib(readStrongBinder15);
                }
                qya.c(parcel);
                registerOnMeasurementEventListener(skbVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    skbVar = queryLocalInterface16 instanceof skb ? (skb) queryLocalInterface16 : new iib(readStrongBinder16);
                }
                qya.c(parcel);
                unregisterOnMeasurementEventListener(skbVar);
                break;
            case 37:
                HashMap b = qya.b(parcel);
                qya.c(parcel);
                initForTests(b);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    chbVar3 = queryLocalInterface17 instanceof chb ? (chb) queryLocalInterface17 : new web(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                qya.c(parcel);
                getTestFlag(chbVar3, readInt2);
                break;
            case 39:
                boolean g6 = qya.g(parcel);
                qya.c(parcel);
                setDataCollectionEnabled(g6);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    chbVar2 = queryLocalInterface18 instanceof chb ? (chb) queryLocalInterface18 : new web(readStrongBinder18);
                }
                qya.c(parcel);
                isDataCollectionEnabled(chbVar2);
                break;
            case 41:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) qya.a(parcel, Bundle.CREATOR);
                qya.c(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                qya.c(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) qya.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                qya.c(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) qya.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                qya.c(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
