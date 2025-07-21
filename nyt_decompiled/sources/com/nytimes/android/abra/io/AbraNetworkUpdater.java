package com.nytimes.android.abra.io;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.nytimes.android.abra.utilities.AbraLogger;
import com.nytimes.android.abra.utilities.ParamProvider;
import defpackage.b04;
import defpackage.by0;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* loaded from: classes2.dex */
public final class AbraNetworkUpdater {
    private final CoroutineDispatcher dispatcher;
    private Job job;
    private final List<NetworkUpdateListener> listeners;
    private final ParamProvider paramProvider;
    private final b04 store;

    public AbraNetworkUpdater(b04 b04Var, ParamProvider paramProvider, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(b04Var, "store");
        zq3.h(paramProvider, "paramProvider");
        zq3.h(coroutineDispatcher, "dispatcher");
        this.store = b04Var;
        this.paramProvider = paramProvider;
        this.dispatcher = coroutineDispatcher;
        this.listeners = new ArrayList();
    }

    public static /* synthetic */ void getJob$annotations() {
    }

    public static /* synthetic */ void getListeners$annotations() {
    }

    public final boolean addListener(NetworkUpdateListener networkUpdateListener) {
        zq3.h(networkUpdateListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        return this.listeners.add(networkUpdateListener);
    }

    public final void checkForUpdates() {
        Job launch$default;
        Job job = this.job;
        if (job == null || !(job == null || job.isActive())) {
            AbraLogger.INSTANCE.d("Starting update job", "AbraNetworkUpdater.checkForUpdates");
            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), this.dispatcher, null, new AbraNetworkUpdater$checkForUpdates$1(this, null), 2, null);
            this.job = launch$default;
        }
    }

    public final Job getJob() {
        return this.job;
    }

    public final List<NetworkUpdateListener> getListeners() {
        return this.listeners;
    }

    public final void setJob(Job job) {
        this.job = job;
    }

    public final Object updateAbra(by0<? super ww8> by0Var) {
        Object withContext = BuildersKt.withContext(this.dispatcher, new AbraNetworkUpdater$updateAbra$2(this, null), by0Var);
        return withContext == a.h() ? withContext : ww8.a;
    }

    public /* synthetic */ AbraNetworkUpdater(b04 b04Var, ParamProvider paramProvider, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(b04Var, paramProvider, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
