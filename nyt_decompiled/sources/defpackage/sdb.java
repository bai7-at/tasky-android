package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;

/* loaded from: classes3.dex */
public interface sdb extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(chb chbVar);

    void getAppInstanceId(chb chbVar);

    void getCachedAppInstanceId(chb chbVar);

    void getConditionalUserProperties(String str, String str2, chb chbVar);

    void getCurrentScreenClass(chb chbVar);

    void getCurrentScreenName(chb chbVar);

    void getGmpAppId(chb chbVar);

    void getMaxUserProperties(String str, chb chbVar);

    void getTestFlag(chb chbVar, int i);

    void getUserProperties(String str, String str2, boolean z, chb chbVar);

    void initForTests(Map map);

    void initialize(ee3 ee3Var, zzcl zzclVar, long j);

    void isDataCollectionEnabled(chb chbVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, chb chbVar, long j);

    void logHealthData(int i, String str, ee3 ee3Var, ee3 ee3Var2, ee3 ee3Var3);

    void onActivityCreated(ee3 ee3Var, Bundle bundle, long j);

    void onActivityDestroyed(ee3 ee3Var, long j);

    void onActivityPaused(ee3 ee3Var, long j);

    void onActivityResumed(ee3 ee3Var, long j);

    void onActivitySaveInstanceState(ee3 ee3Var, chb chbVar, long j);

    void onActivityStarted(ee3 ee3Var, long j);

    void onActivityStopped(ee3 ee3Var, long j);

    void performAction(Bundle bundle, chb chbVar, long j);

    void registerOnMeasurementEventListener(skb skbVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(ee3 ee3Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(skb skbVar);

    void setInstanceIdProvider(nmb nmbVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, ee3 ee3Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(skb skbVar);
}
