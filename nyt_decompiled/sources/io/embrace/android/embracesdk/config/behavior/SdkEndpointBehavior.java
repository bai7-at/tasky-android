package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.local.BaseUrlLocalConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SdkEndpointBehavior extends MergedConfigBehavior<BaseUrlLocalConfig, ww8> {
    public static final String CONFIG_DEFAULT = "config.emb-api.com";
    public static final Companion Companion = new Companion(null);
    public static final String DATA_DEFAULT = "data.emb-api.com";
    public static final String DATA_DEV_DEFAULT = "data-dev.emb-api.com";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkEndpointBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var) {
        super(behaviorThresholdCheck, qs2Var, null, 4, null);
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "localSupplier");
    }

    public final String getConfig(String str) {
        String config;
        zq3.h(str, "appId");
        BaseUrlLocalConfig local = getLocal();
        if (local != null && (config = local.getConfig()) != null) {
            return config;
        }
        return "https://a-" + str + ".config.emb-api.com";
    }

    public final String getData(String str) {
        String data;
        zq3.h(str, "appId");
        BaseUrlLocalConfig local = getLocal();
        if (local != null && (data = local.getData()) != null) {
            return data;
        }
        return "https://a-" + str + ".data.emb-api.com";
    }

    public final String getDataDev(String str) {
        String dataDev;
        zq3.h(str, "appId");
        BaseUrlLocalConfig local = getLocal();
        if (local != null && (dataDev = local.getDataDev()) != null) {
            return dataDev;
        }
        return "https://a-" + str + ".data-dev.emb-api.com";
    }
}
