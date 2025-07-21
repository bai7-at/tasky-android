package io.embrace.android.embracesdk.internal.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class SessionPayload {
    private final InternalError internalError;
    private final Map<String, String> sharedLibSymbolMapping;
    private final List<Span> spanSnapshots;
    private final List<Span> spans;

    public SessionPayload() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionPayload copy$default(SessionPayload sessionPayload, List list, List list2, InternalError internalError, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sessionPayload.spans;
        }
        if ((i & 2) != 0) {
            list2 = sessionPayload.spanSnapshots;
        }
        if ((i & 4) != 0) {
            internalError = sessionPayload.internalError;
        }
        if ((i & 8) != 0) {
            map = sessionPayload.sharedLibSymbolMapping;
        }
        return sessionPayload.copy(list, list2, internalError, map);
    }

    public final List<Span> component1() {
        return this.spans;
    }

    public final List<Span> component2() {
        return this.spanSnapshots;
    }

    public final InternalError component3() {
        return this.internalError;
    }

    public final Map<String, String> component4() {
        return this.sharedLibSymbolMapping;
    }

    public final SessionPayload copy(@bt3(name = "spans") List<Span> list, @bt3(name = "span_snapshots") List<Span> list2, @bt3(name = "internal_error") InternalError internalError, @bt3(name = "shared_lib_symbol_mapping") Map<String, String> map) {
        return new SessionPayload(list, list2, internalError, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionPayload)) {
            return false;
        }
        SessionPayload sessionPayload = (SessionPayload) obj;
        return zq3.c(this.spans, sessionPayload.spans) && zq3.c(this.spanSnapshots, sessionPayload.spanSnapshots) && zq3.c(this.internalError, sessionPayload.internalError) && zq3.c(this.sharedLibSymbolMapping, sessionPayload.sharedLibSymbolMapping);
    }

    public final InternalError getInternalError() {
        return this.internalError;
    }

    public final Map<String, String> getSharedLibSymbolMapping() {
        return this.sharedLibSymbolMapping;
    }

    public final List<Span> getSpanSnapshots() {
        return this.spanSnapshots;
    }

    public final List<Span> getSpans() {
        return this.spans;
    }

    public int hashCode() {
        List<Span> list = this.spans;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Span> list2 = this.spanSnapshots;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        InternalError internalError = this.internalError;
        int hashCode3 = (hashCode2 + (internalError != null ? internalError.hashCode() : 0)) * 31;
        Map<String, String> map = this.sharedLibSymbolMapping;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "SessionPayload(spans=" + this.spans + ", spanSnapshots=" + this.spanSnapshots + ", internalError=" + this.internalError + ", sharedLibSymbolMapping=" + this.sharedLibSymbolMapping + ")";
    }

    public SessionPayload(@bt3(name = "spans") List<Span> list, @bt3(name = "span_snapshots") List<Span> list2, @bt3(name = "internal_error") InternalError internalError, @bt3(name = "shared_lib_symbol_mapping") Map<String, String> map) {
        this.spans = list;
        this.spanSnapshots = list2;
        this.internalError = internalError;
        this.sharedLibSymbolMapping = map;
    }

    public /* synthetic */ SessionPayload(List list, List list2, InternalError internalError, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : internalError, (i & 8) != 0 ? null : map);
    }
}
