package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.gp9;
import defpackage.og8;
import defpackage.qg8;
import defpackage.vo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class GoogleApiManager implements Handler.Callback {
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status zab = new Status(4, "The user must be signed in to make this API call.");
    private static final Object zac = new Object();
    private static GoogleApiManager zad;
    private TelemetryData zag;
    private TelemetryLoggingClient zah;
    private final Context zai;
    private final GoogleApiAvailability zaj;
    private final com.google.android.gms.common.internal.zal zak;
    private final Handler zar;
    private volatile boolean zas;
    private long zae = 10000;
    private boolean zaf = false;
    private final AtomicInteger zal = new AtomicInteger(1);
    private final AtomicInteger zam = new AtomicInteger(0);
    private final Map zan = new ConcurrentHashMap(5, 0.75f, 1);
    private zaae zao = null;
    private final Set zap = new vo();
    private final Set zaq = new vo();

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zas = true;
        this.zai = context;
        gp9 gp9Var = new gp9(looper, this);
        this.zar = gp9Var;
        this.zaj = googleApiAvailability;
        this.zak = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.zas = false;
        }
        gp9Var.sendMessage(gp9Var.obtainMessage(6));
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (zac) {
            try {
                GoogleApiManager googleApiManager = zad;
                if (googleApiManager != null) {
                    googleApiManager.zam.incrementAndGet();
                    Handler handler = googleApiManager.zar;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status zaF(ApiKey apiKey, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + apiKey.zaa() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    @ResultIgnorabilityUnspecified
    private final zabq zaG(GoogleApi googleApi) {
        ApiKey apiKey = googleApi.getApiKey();
        zabq zabqVar = (zabq) this.zan.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new zabq(this, googleApi);
            this.zan.put(apiKey, zabqVar);
        }
        if (zabqVar.zaz()) {
            this.zaq.add(apiKey);
        }
        zabqVar.zao();
        return zabqVar;
    }

    private final TelemetryLoggingClient zaH() {
        if (this.zah == null) {
            this.zah = TelemetryLogging.getClient(this.zai);
        }
        return this.zah;
    }

    private final void zaI() {
        TelemetryData telemetryData = this.zag;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zaD()) {
                zaH().log(telemetryData);
            }
            this.zag = null;
        }
    }

    private final void zaJ(qg8 qg8Var, int i, GoogleApi googleApi) {
        h0 a;
        if (i == 0 || (a = h0.a(this, i, googleApi.getApiKey())) == null) {
            return;
        }
        og8 a2 = qg8Var.a();
        final Handler handler = this.zar;
        handler.getClass();
        a2.c(new Executor() { // from class: com.google.android.gms.common.api.internal.zabk
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, a);
    }

    public static GoogleApiManager zaj() {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            Preconditions.checkNotNull(zad, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @ResultIgnorabilityUnspecified
    public static GoogleApiManager zak(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            try {
                if (zad == null) {
                    zad = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.getOrStartHandlerThread().getLooper(), GoogleApiAvailability.getInstance());
                }
                googleApiManager = zad;
            } catch (Throwable th) {
                throw th;
            }
        }
        return googleApiManager;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ApiKey apiKey;
        boolean zaN;
        ApiKey apiKey2;
        ApiKey apiKey3;
        ApiKey apiKey4;
        ApiKey apiKey5;
        int i = message.what;
        zabq zabqVar = null;
        switch (i) {
            case 1:
                this.zae = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.zar.removeMessages(12);
                for (ApiKey apiKey6 : this.zan.keySet()) {
                    Handler handler = this.zar;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey6), this.zae);
                }
                return true;
            case 2:
                zal zalVar = (zal) message.obj;
                Iterator it2 = zalVar.zab().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ApiKey apiKey7 = (ApiKey) it2.next();
                        zabq zabqVar2 = (zabq) this.zan.get(apiKey7);
                        if (zabqVar2 == null) {
                            zalVar.zac(apiKey7, new ConnectionResult(13), null);
                        } else if (zabqVar2.zay()) {
                            zalVar.zac(apiKey7, ConnectionResult.RESULT_SUCCESS, zabqVar2.zaf().getEndpointPackageName());
                        } else {
                            ConnectionResult zad2 = zabqVar2.zad();
                            if (zad2 != null) {
                                zalVar.zac(apiKey7, zad2, null);
                            } else {
                                zabqVar2.zat(zalVar);
                                zabqVar2.zao();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (zabq zabqVar3 : this.zan.values()) {
                    zabqVar3.zan();
                    zabqVar3.zao();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zach zachVar = (zach) message.obj;
                zabq zabqVar4 = (zabq) this.zan.get(zachVar.zac.getApiKey());
                if (zabqVar4 == null) {
                    zabqVar4 = zaG(zachVar.zac);
                }
                if (!zabqVar4.zaz() || this.zam.get() == zachVar.zab) {
                    zabqVar4.zap(zachVar.zaa);
                } else {
                    zachVar.zaa.zad(zaa);
                    zabqVar4.zav();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it3 = this.zan.values().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        zabq zabqVar5 = (zabq) it3.next();
                        if (zabqVar5.zab() == i2) {
                            zabqVar = zabqVar5;
                        }
                    }
                }
                if (zabqVar == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i2 + " while trying to fail enqueued calls.", new Exception());
                } else if (connectionResult.getErrorCode() == 13) {
                    zabqVar.zaD(new Status(17, "Error resolution was canceled by the user, original error message: " + this.zaj.getErrorString(connectionResult.getErrorCode()) + ": " + connectionResult.getErrorMessage()));
                } else {
                    apiKey = zabqVar.zad;
                    zabqVar.zaD(zaF(apiKey, connectionResult));
                }
                return true;
            case 6:
                if (this.zai.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.zai.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new z(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zae = 300000L;
                    }
                }
                return true;
            case 7:
                zaG((GoogleApi) message.obj);
                return true;
            case 9:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zau();
                }
                return true;
            case 10:
                Iterator it4 = this.zaq.iterator();
                while (it4.hasNext()) {
                    zabq zabqVar6 = (zabq) this.zan.remove((ApiKey) it4.next());
                    if (zabqVar6 != null) {
                        zabqVar6.zav();
                    }
                }
                this.zaq.clear();
                return true;
            case 11:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zaw();
                }
                return true;
            case 12:
                if (this.zan.containsKey(message.obj)) {
                    ((zabq) this.zan.get(message.obj)).zaA();
                }
                return true;
            case 14:
                e eVar = (e) message.obj;
                ApiKey a = eVar.a();
                if (this.zan.containsKey(a)) {
                    zaN = ((zabq) this.zan.get(a)).zaN(false);
                    eVar.b().c(Boolean.valueOf(zaN));
                } else {
                    eVar.b().c(Boolean.FALSE);
                }
                return true;
            case 15:
                e0 e0Var = (e0) message.obj;
                Map map = this.zan;
                apiKey2 = e0Var.a;
                if (map.containsKey(apiKey2)) {
                    Map map2 = this.zan;
                    apiKey3 = e0Var.a;
                    zabq.zal((zabq) map2.get(apiKey3), e0Var);
                }
                return true;
            case 16:
                e0 e0Var2 = (e0) message.obj;
                Map map3 = this.zan;
                apiKey4 = e0Var2.a;
                if (map3.containsKey(apiKey4)) {
                    Map map4 = this.zan;
                    apiKey5 = e0Var2.a;
                    zabq.zam((zabq) map4.get(apiKey5), e0Var2);
                }
                return true;
            case 17:
                zaI();
                return true;
            case 18:
                i0 i0Var = (i0) message.obj;
                if (i0Var.c == 0) {
                    zaH().log(new TelemetryData(i0Var.b, Arrays.asList(i0Var.a)));
                } else {
                    TelemetryData telemetryData = this.zag;
                    if (telemetryData != null) {
                        List zab2 = telemetryData.zab();
                        if (telemetryData.zaa() != i0Var.b || (zab2 != null && zab2.size() >= i0Var.d)) {
                            this.zar.removeMessages(17);
                            zaI();
                        } else {
                            this.zag.zac(i0Var.a);
                        }
                    }
                    if (this.zag == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(i0Var.a);
                        this.zag = new TelemetryData(i0Var.b, arrayList);
                        Handler handler2 = this.zar;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), i0Var.c);
                    }
                }
                return true;
            case 19:
                this.zaf = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
    }

    public final void zaA(zaae zaaeVar) {
        synchronized (zac) {
            try {
                if (this.zao != zaaeVar) {
                    this.zao = zaaeVar;
                    this.zap.clear();
                }
                this.zap.addAll(zaaeVar.zaa());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void zaB(zaae zaaeVar) {
        synchronized (zac) {
            try {
                if (this.zao == zaaeVar) {
                    this.zao = null;
                    this.zap.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final boolean zaD() {
        if (this.zaf) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int zaa2 = this.zak.zaa(this.zai, 203400000);
        return zaa2 == -1 || zaa2 == 0;
    }

    @ResultIgnorabilityUnspecified
    final boolean zaE(ConnectionResult connectionResult, int i) {
        return this.zaj.zah(this.zai, connectionResult, i);
    }

    public final int zaa() {
        return this.zal.getAndIncrement();
    }

    final zabq zai(ApiKey apiKey) {
        return (zabq) this.zan.get(apiKey);
    }

    public final og8 zam(Iterable iterable) {
        zal zalVar = new zal(iterable);
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    @ResultIgnorabilityUnspecified
    public final og8 zan(GoogleApi googleApi) {
        e eVar = new e(googleApi.getApiKey());
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(14, eVar));
        return eVar.b().a();
    }

    public final og8 zao(GoogleApi googleApi, RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable) {
        qg8 qg8Var = new qg8();
        zaJ(qg8Var, registerListenerMethod.zaa(), googleApi);
        zaf zafVar = new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), qg8Var);
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(8, new zach(zafVar, this.zam.get(), googleApi)));
        return qg8Var.a();
    }

    public final og8 zap(GoogleApi googleApi, ListenerHolder.ListenerKey listenerKey, int i) {
        qg8 qg8Var = new qg8();
        zaJ(qg8Var, i, googleApi);
        zah zahVar = new zah(listenerKey, qg8Var);
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(13, new zach(zahVar, this.zam.get(), googleApi)));
        return qg8Var.a();
    }

    public final void zau(GoogleApi googleApi, int i, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zae zaeVar = new zae(i, apiMethodImpl);
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(4, new zach(zaeVar, this.zam.get(), googleApi)));
    }

    public final void zav(GoogleApi googleApi, int i, TaskApiCall taskApiCall, qg8 qg8Var, StatusExceptionMapper statusExceptionMapper) {
        zaJ(qg8Var, taskApiCall.zaa(), googleApi);
        zag zagVar = new zag(i, taskApiCall, qg8Var, statusExceptionMapper);
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(4, new zach(zagVar, this.zam.get(), googleApi)));
    }

    final void zaw(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(18, new i0(methodInvocation, i, j, i2)));
    }

    public final void zax(ConnectionResult connectionResult, int i) {
        if (zaE(connectionResult, i)) {
            return;
        }
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void zay() {
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaz(GoogleApi googleApi) {
        Handler handler = this.zar;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }
}
