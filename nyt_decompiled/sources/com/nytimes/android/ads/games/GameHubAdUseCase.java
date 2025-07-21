package com.nytimes.android.ads.games;

import android.content.Context;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.ads.AdConfig;
import com.nytimes.android.ads.usecase.FetchAdUseCase;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class GameHubAdUseCase {
    public static final a Companion = new a(null);
    private final FetchAdUseCase a;
    private final AbraManager b;
    private final AdConfig.Builder c;
    private final ET2Scope d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public GameHubAdUseCase(FetchAdUseCase fetchAdUseCase, AbraManager abraManager, AdConfig.Builder builder, ET2Scope eT2Scope) {
        zq3.h(fetchAdUseCase, "fetchAdUseCase");
        zq3.h(abraManager, "abraManager");
        zq3.h(builder, "adConfigBuilder");
        zq3.h(eT2Scope, "et2Scope");
        this.a = fetchAdUseCase;
        this.b = abraManager;
        this.c = builder;
        this.d = eT2Scope;
    }

    public final Flow e(Context context) {
        zq3.h(context, "context");
        return FlowKt.flow(new GameHubAdUseCase$invoke$1(this, context, null));
    }
}
