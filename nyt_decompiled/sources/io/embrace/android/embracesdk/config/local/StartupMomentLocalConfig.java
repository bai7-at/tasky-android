package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class StartupMomentLocalConfig {
    private final Boolean automaticallyEnd;

    /* JADX WARN: Multi-variable type inference failed */
    public StartupMomentLocalConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean getAutomaticallyEnd() {
        return this.automaticallyEnd;
    }

    public StartupMomentLocalConfig(@bt3(name = "automatically_end") Boolean bool) {
        this.automaticallyEnd = bool;
    }

    public /* synthetic */ StartupMomentLocalConfig(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
