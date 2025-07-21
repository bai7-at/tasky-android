package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class DomainLocalConfig {
    private final String domain;
    private final Integer limit;

    /* JADX WARN: Multi-variable type inference failed */
    public DomainLocalConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String getDomain() {
        return this.domain;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public DomainLocalConfig(@bt3(name = "domain_name") String str, @bt3(name = "domain_limit") Integer num) {
        this.domain = str;
        this.limit = num;
    }

    public /* synthetic */ DomainLocalConfig(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
