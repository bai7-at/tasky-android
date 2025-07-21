package com.nytimes.android.ads.network;

import com.nytimes.android.ads.a;
import com.nytimes.android.ads.network.api.AlsApi;
import defpackage.bc;
import defpackage.by0;
import defpackage.qb;
import defpackage.zq3;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes2.dex */
public final class AlsRepositoryImpl implements bc {
    private final AlsApi a;
    private final a b;
    private final qb c;
    private final MutableSharedFlow d;

    public static final class AlsFailedException extends Throwable {
        public AlsFailedException(String str) {
            super(str);
        }
    }

    public AlsRepositoryImpl(AlsApi alsApi, a aVar, qb qbVar, MutableSharedFlow mutableSharedFlow) {
        zq3.h(alsApi, "api");
        zq3.h(aVar, "adClient");
        zq3.h(qbVar, "store");
        zq3.h(mutableSharedFlow, "alsEventSharedFlow");
        this.a = alsApi;
        this.b = aVar;
        this.c = qbVar;
        this.d = mutableSharedFlow;
    }

    @Override // defpackage.bc
    public Object a(String str, String str2, String str3, by0 by0Var) {
        return FlowKt.m911catch(FlowKt.flow(new AlsRepositoryImpl$fetchAlsTargeting$2(this, str, str2, str3, null)), new AlsRepositoryImpl$fetchAlsTargeting$3(this, str, null));
    }
}
