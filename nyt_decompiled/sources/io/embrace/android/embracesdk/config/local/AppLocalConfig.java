package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class AppLocalConfig {
    private final Boolean reportDiskUsage;

    /* JADX WARN: Multi-variable type inference failed */
    public AppLocalConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean getReportDiskUsage() {
        return this.reportDiskUsage;
    }

    public AppLocalConfig(@bt3(name = "report_disk_usage") Boolean bool) {
        this.reportDiskUsage = bool;
    }

    public /* synthetic */ AppLocalConfig(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
