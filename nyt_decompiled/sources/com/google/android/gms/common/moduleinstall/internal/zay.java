package com.google.android.gms.common.moduleinstall.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.bc8;
import defpackage.hp9;
import defpackage.og8;
import defpackage.qg8;
import defpackage.vg8;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zay extends GoogleApi implements ModuleInstallClient {
    public static final /* synthetic */ int zab = 0;
    private static final Api.ClientKey zac;
    private static final Api.AbstractClientBuilder zad;
    private static final Api zae;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zac = clientKey;
        c cVar = new c();
        zad = cVar;
        zae = new Api("ModuleInstall.API", cVar, clientKey);
    }

    public zay(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) zae, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    static final ApiFeatureRequest zad(boolean z, OptionalModuleApi... optionalModuleApiArr) {
        Preconditions.checkNotNull(optionalModuleApiArr, "Requested APIs must not be null.");
        Preconditions.checkArgument(optionalModuleApiArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (OptionalModuleApi optionalModuleApi : optionalModuleApiArr) {
            Preconditions.checkNotNull(optionalModuleApi, "Requested API must not be null.");
        }
        return ApiFeatureRequest.zaa(Arrays.asList(optionalModuleApiArr), z);
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final og8 areModulesAvailable(OptionalModuleApi... optionalModuleApiArr) {
        final ApiFeatureRequest zad2 = zad(false, optionalModuleApiArr);
        if (zad2.getApiFeatures().isEmpty()) {
            return vg8.e(new ModuleAvailabilityResponse(true, 0));
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(hp9.a);
        builder.setMethodKey(27301);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zap
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zay zayVar = zay.this;
                ApiFeatureRequest apiFeatureRequest = zad2;
                ((zaf) ((zaz) obj).getService()).zae(new d(zayVar, (qg8) obj2), apiFeatureRequest);
            }
        });
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final og8 deferredInstall(OptionalModuleApi... optionalModuleApiArr) {
        final ApiFeatureRequest zad2 = zad(false, optionalModuleApiArr);
        if (zad2.getApiFeatures().isEmpty()) {
            return vg8.e(null);
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(hp9.a);
        builder.setMethodKey(27302);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zan
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zay zayVar = zay.this;
                ApiFeatureRequest apiFeatureRequest = zad2;
                ((zaf) ((zaz) obj).getService()).zag(new e(zayVar, (qg8) obj2), apiFeatureRequest, null);
            }
        });
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final og8 getInstallModulesIntent(OptionalModuleApi... optionalModuleApiArr) {
        final ApiFeatureRequest zad2 = zad(true, optionalModuleApiArr);
        if (zad2.getApiFeatures().isEmpty()) {
            return vg8.e(new ModuleInstallIntentResponse(null));
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(hp9.a);
        builder.setMethodKey(27307);
        builder.run(new RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zam
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zay zayVar = zay.this;
                ApiFeatureRequest apiFeatureRequest = zad2;
                ((zaf) ((zaz) obj).getService()).zaf(new i(zayVar, (qg8) obj2), apiFeatureRequest);
            }
        });
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final og8 installModules(ModuleInstallRequest moduleInstallRequest) {
        final ApiFeatureRequest fromModuleInstallRequest = ApiFeatureRequest.fromModuleInstallRequest(moduleInstallRequest);
        final InstallStatusListener listener = moduleInstallRequest.getListener();
        Executor listenerExecutor = moduleInstallRequest.getListenerExecutor();
        if (fromModuleInstallRequest.getApiFeatures().isEmpty()) {
            return vg8.e(new ModuleInstallResponse(0));
        }
        if (listener == null) {
            TaskApiCall.Builder builder = TaskApiCall.builder();
            builder.setFeatures(hp9.a);
            builder.setAutoResolveMissingFeatures(true);
            builder.setMethodKey(27304);
            builder.run(new RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zao
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    zay zayVar = zay.this;
                    ApiFeatureRequest apiFeatureRequest = fromModuleInstallRequest;
                    ((zaf) ((zaz) obj).getService()).zag(new f(zayVar, (qg8) obj2), apiFeatureRequest, null);
                }
            });
            return doRead(builder.build());
        }
        Preconditions.checkNotNull(listener);
        ListenerHolder registerListener = listenerExecutor == null ? registerListener(listener, InstallStatusListener.class.getSimpleName()) : ListenerHolders.createListenerHolder(listener, listenerExecutor, InstallStatusListener.class.getSimpleName());
        final b bVar = new b(registerListener);
        final AtomicReference atomicReference = new AtomicReference();
        RemoteCall remoteCall = new RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zai
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zay zayVar = zay.this;
                AtomicReference atomicReference2 = atomicReference;
                InstallStatusListener installStatusListener = listener;
                ApiFeatureRequest apiFeatureRequest = fromModuleInstallRequest;
                b bVar2 = bVar;
                ((zaf) ((zaz) obj).getService()).zag(new g(zayVar, atomicReference2, (qg8) obj2, installStatusListener), apiFeatureRequest, bVar2);
            }
        };
        RemoteCall remoteCall2 = new RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zaj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zay zayVar = zay.this;
                b bVar2 = bVar;
                ((zaf) ((zaz) obj).getService()).zai(new h(zayVar, (qg8) obj2), bVar2);
            }
        };
        RegistrationMethods.Builder builder2 = RegistrationMethods.builder();
        builder2.withHolder(registerListener);
        builder2.setFeatures(hp9.a);
        builder2.setAutoResolveMissingFeatures(true);
        builder2.register(remoteCall);
        builder2.unregister(remoteCall2);
        builder2.setMethodKey(27305);
        return doRegisterEventListener(builder2.build()).r(new bc8() { // from class: com.google.android.gms.common.moduleinstall.internal.zak
            @Override // defpackage.bc8
            public final og8 then(Object obj) {
                AtomicReference atomicReference2 = atomicReference;
                int i = zay.zab;
                return atomicReference2.get() != null ? vg8.e((ModuleInstallResponse) atomicReference2.get()) : vg8.d(new ApiException(Status.RESULT_INTERNAL_ERROR));
            }
        });
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    public final og8 releaseModules(OptionalModuleApi... optionalModuleApiArr) {
        final ApiFeatureRequest zad2 = zad(false, optionalModuleApiArr);
        if (zad2.getApiFeatures().isEmpty()) {
            return vg8.e(null);
        }
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(hp9.a);
        builder.setMethodKey(27303);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new RemoteCall() { // from class: com.google.android.gms.common.moduleinstall.internal.zal
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zay zayVar = zay.this;
                ApiFeatureRequest apiFeatureRequest = zad2;
                ((zaf) ((zaz) obj).getService()).zah(new j(zayVar, (qg8) obj2), apiFeatureRequest);
            }
        });
        return doRead(builder.build());
    }

    @Override // com.google.android.gms.common.moduleinstall.ModuleInstallClient
    @ResultIgnorabilityUnspecified
    public final og8 unregisterListener(InstallStatusListener installStatusListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(installStatusListener, InstallStatusListener.class.getSimpleName()), 27306);
    }

    public zay(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) zae, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
