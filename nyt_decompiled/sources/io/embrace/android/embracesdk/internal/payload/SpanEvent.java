package io.embrace.android.embracesdk.internal.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class SpanEvent {
    private final List<Attribute> attributes;
    private final String name;
    private final Long timeUnixNano;

    public SpanEvent() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpanEvent copy$default(SpanEvent spanEvent, String str, Long l, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spanEvent.name;
        }
        if ((i & 2) != 0) {
            l = spanEvent.timeUnixNano;
        }
        if ((i & 4) != 0) {
            list = spanEvent.attributes;
        }
        return spanEvent.copy(str, l, list);
    }

    public final String component1() {
        return this.name;
    }

    public final Long component2() {
        return this.timeUnixNano;
    }

    public final List<Attribute> component3() {
        return this.attributes;
    }

    public final SpanEvent copy(@bt3(name = "name") String str, @bt3(name = "time_unix_nano") Long l, @bt3(name = "attributes") List<Attribute> list) {
        return new SpanEvent(str, l, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanEvent)) {
            return false;
        }
        SpanEvent spanEvent = (SpanEvent) obj;
        return zq3.c(this.name, spanEvent.name) && zq3.c(this.timeUnixNano, spanEvent.timeUnixNano) && zq3.c(this.attributes, spanEvent.attributes);
    }

    public final List<Attribute> getAttributes() {
        return this.attributes;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getTimeUnixNano() {
        return this.timeUnixNano;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.timeUnixNano;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        List<Attribute> list = this.attributes;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SpanEvent(name=" + this.name + ", timeUnixNano=" + this.timeUnixNano + ", attributes=" + this.attributes + ")";
    }

    public SpanEvent(@bt3(name = "name") String str, @bt3(name = "time_unix_nano") Long l, @bt3(name = "attributes") List<Attribute> list) {
        this.name = str;
        this.timeUnixNano = l;
        this.attributes = list;
    }

    public /* synthetic */ SpanEvent(String str, Long l, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : list);
    }
}
