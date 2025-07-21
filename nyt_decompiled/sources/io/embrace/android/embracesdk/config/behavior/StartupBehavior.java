package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.local.StartupMomentLocalConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class StartupBehavior extends MergedConfigBehavior<StartupMomentLocalConfig, ww8> {
    public static final boolean AUTOMATICALLY_END_DEFAULT = true;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartupBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var) {
        super(behaviorThresholdCheck, qs2Var, new qs2() { // from class: io.embrace.android.embracesdk.config.behavior.StartupBehavior.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ww8 mo865invoke() {
                return null;
            }
        });
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "localSupplier");
    }

    public final boolean isAutomaticEndEnabled() {
        Boolean automaticallyEnd;
        StartupMomentLocalConfig local = getLocal();
        if (local == null || (automaticallyEnd = local.getAutomaticallyEnd()) == null) {
            return true;
        }
        return automaticallyEnd.booleanValue();
    }
}
