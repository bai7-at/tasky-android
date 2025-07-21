package com.nytimes.android.abra.allocator;

import android.content.Context;
import android.graphics.PointF;
import com.nytimes.android.abra.allocator.AllocationResult;
import com.nytimes.android.abra.io.AbraNetworkUpdater;
import com.nytimes.android.abra.io.NetworkUpdateListener;
import com.nytimes.android.abra.models.AbraPackage;
import com.nytimes.android.abra.utilities.AbraLogger;
import com.nytimes.android.abra.utilities.JsonExtensionsKt;
import com.nytimes.android.abra.utilities.ParamProvider;
import com.nytimes.android.abra.utilities.ParamProviderKt;
import com.squareup.duktape.Duktape;
import defpackage.du8;
import defpackage.qs2;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class AbraAllocator implements NetworkUpdateListener {
    private AbraPackage abraPackage;
    private final Context context;
    private DuktapeClient duktapeClient;
    private final List<AllocatorListener> listeners;
    private final AbraNetworkUpdater networkUpdater;
    private ParamProvider params;
    private final ResourceProvider resourceProvider;

    public AbraAllocator(Context context, ParamProvider paramProvider, AbraPackage abraPackage, AbraNetworkUpdater abraNetworkUpdater, ResourceProvider resourceProvider, DuktapeClient duktapeClient) {
        zq3.h(context, "context");
        zq3.h(paramProvider, "params");
        zq3.h(abraPackage, "abraPackage");
        zq3.h(abraNetworkUpdater, "networkUpdater");
        zq3.h(resourceProvider, "resourceProvider");
        zq3.h(duktapeClient, "duktapeClient");
        this.context = context;
        this.params = paramProvider;
        this.abraPackage = abraPackage;
        this.networkUpdater = abraNetworkUpdater;
        this.resourceProvider = resourceProvider;
        this.duktapeClient = duktapeClient;
        this.listeners = new ArrayList();
        abraNetworkUpdater.addListener(this);
        loadJs();
    }

    public final void addListener(AllocatorListener allocatorListener) {
        zq3.h(allocatorListener, "allocatorListener");
        this.listeners.add(allocatorListener);
    }

    public final void checkForUpdates() {
        if (this.abraPackage.getExpired()) {
            AbraLogger.d$default(AbraLogger.INSTANCE, "AbraPackage expired", null, 2, null);
            this.networkUpdater.checkForUpdates();
        }
    }

    public final AbraPackage getAbraPackage() {
        return this.abraPackage;
    }

    public final int getRulesVersion() {
        return this.abraPackage.getRulesVersion();
    }

    public final AllocationResult getVariant(String str) {
        String str2;
        AllocationResult successNull;
        zq3.h(str, "testName");
        Map<String, String> overrides = this.params.getOverrides();
        if (overrides == null || (str2 = JsonExtensionsKt.toJsonString(overrides)) == null) {
            str2 = "{}";
        }
        String str3 = str2;
        PointF viewPort = this.params.getViewPort(this.context);
        Map n = t.n(du8.a(ParamProviderKt.PARAM_TIMEZONE, this.params.getCurrentTimeZone().getID()), du8.a(ParamProviderKt.PARAM_AGENT_ID, this.params.getAgentId()), du8.a(ParamProviderKt.PARAM_VIEWPORT_WIDTH, String.valueOf(viewPort.x)), du8.a(ParamProviderKt.PARAM_VIEWPORT_HEIGHT, String.valueOf(viewPort.y)), du8.a(ParamProviderKt.PARAM_SMALLEST_WIDTH, String.valueOf(ParamProviderKt.min(viewPort))));
        n.putAll(this.params.getExtraParameters());
        String jsonString = JsonExtensionsKt.toJsonString(n);
        try {
            AbraLogger abraLogger = AbraLogger.INSTANCE;
            abraLogger.d("abraParams = " + jsonString + ", overrides = " + str3 + ", testName = " + str, "AbraAllocater.getVariant");
            String variant = this.duktapeClient.get("AbraInterface", AbraInterface.class).getVariant(this.abraPackage.getRules(), jsonString, str3, false, str);
            if (variant != null && !h.d0(variant)) {
                abraLogger.d(str + " set to " + variant, "AbraAllocater.getVariant");
                successNull = new AllocationResult.Success(variant, this.abraPackage.getRulesVersion(), this.params.getIntegration(), n);
                return successNull;
            }
            abraLogger.d("Variant for " + str + " is null", "AbraAllocater.getVariant");
            successNull = new AllocationResult.SuccessNull(this.abraPackage.getRulesVersion(), this.params.getIntegration(), n);
            return successNull;
        } catch (Exception e) {
            AbraLogger.INSTANCE.e("Error getting variant for " + str + ": " + e.getMessage(), "AbraAllocater.getVariant");
            return new AllocationResult.Error(this.abraPackage.getRulesVersion(), this.params.getIntegration(), n);
        }
    }

    public final void loadJs() {
        try {
            DuktapeClient duktapeClient = this.duktapeClient;
            duktapeClient.refresh();
            this.duktapeClient = duktapeClient;
            String str = this.abraPackage.getJsCode() + "\n" + this.resourceProvider.getAbraGlobal();
            zq3.g(str, "toString(...)");
            duktapeClient.evaluate(str);
        } catch (Exception unused) {
            AbraLogger.e$default(AbraLogger.INSTANCE, "Failed to initialize duktape.", null, 2, null);
        }
    }

    @Override // com.nytimes.android.abra.io.NetworkUpdateListener
    public void onNetworkUpdate(AbraPackage abraPackage) {
        zq3.h(abraPackage, "abraPackage");
        this.abraPackage = abraPackage;
        loadJs();
        Iterator<T> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            ((AllocatorListener) it2.next()).onAllocatorUpdate();
        }
    }

    public final void setAbraPackage(AbraPackage abraPackage) {
        zq3.h(abraPackage, "<set-?>");
        this.abraPackage = abraPackage;
    }

    public /* synthetic */ AbraAllocator(Context context, ParamProvider paramProvider, AbraPackage abraPackage, AbraNetworkUpdater abraNetworkUpdater, ResourceProvider resourceProvider, DuktapeClient duktapeClient, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, paramProvider, abraPackage, abraNetworkUpdater, resourceProvider, (i & 32) != 0 ? new DuktapeClient(new qs2() { // from class: com.nytimes.android.abra.allocator.AbraAllocator.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Duktape mo865invoke() {
                Duktape create = Duktape.create();
                zq3.g(create, "create(...)");
                return create;
            }
        }) : duktapeClient);
    }
}
