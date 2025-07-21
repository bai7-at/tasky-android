package io.embrace.android.embracesdk.spans;

import com.facebook.AuthenticationTokenClaims;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.annotation.BetaApi;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
@BetaApi
/* loaded from: classes5.dex */
public final class EmbraceSpanEvent {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_EVENT_ATTRIBUTE_COUNT = 10;
    public static final int MAX_EVENT_NAME_LENGTH = 100;
    private final Map<String, String> attributes;
    private final String name;
    private final long timestampNanos;

    public static final class Companion {
        private Companion() {
        }

        public final EmbraceSpanEvent create(String str, long j, Map<String, String> map) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            if (!inputsValid$embrace_android_sdk_release(str, map)) {
                return null;
            }
            long millisToNanos = ClockKt.millisToNanos(j);
            if (map == null) {
                map = t.i();
            }
            return new EmbraceSpanEvent(str, millisToNanos, map);
        }

        public final boolean inputsValid$embrace_android_sdk_release(String str, Map<String, String> map) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            return str.length() <= 100 && (map == null || map.size() <= 10);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceSpanEvent(@bt3(name = "name") String str, @bt3(name = "time_unix_nano") long j, @bt3(name = "attributes") Map<String, String> map) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(map, "attributes");
        this.name = str;
        this.timestampNanos = j;
        this.attributes = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmbraceSpanEvent copy$default(EmbraceSpanEvent embraceSpanEvent, String str, long j, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = embraceSpanEvent.name;
        }
        if ((i & 2) != 0) {
            j = embraceSpanEvent.timestampNanos;
        }
        if ((i & 4) != 0) {
            map = embraceSpanEvent.attributes;
        }
        return embraceSpanEvent.copy(str, j, map);
    }

    public final String component1() {
        return this.name;
    }

    public final long component2() {
        return this.timestampNanos;
    }

    public final Map<String, String> component3() {
        return this.attributes;
    }

    public final EmbraceSpanEvent copy(@bt3(name = "name") String str, @bt3(name = "time_unix_nano") long j, @bt3(name = "attributes") Map<String, String> map) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(map, "attributes");
        return new EmbraceSpanEvent(str, j, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbraceSpanEvent)) {
            return false;
        }
        EmbraceSpanEvent embraceSpanEvent = (EmbraceSpanEvent) obj;
        return zq3.c(this.name, embraceSpanEvent.name) && this.timestampNanos == embraceSpanEvent.timestampNanos && zq3.c(this.attributes, embraceSpanEvent.attributes);
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final String getName() {
        return this.name;
    }

    public final long getTimestampNanos() {
        return this.timestampNanos;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.timestampNanos)) * 31;
        Map<String, String> map = this.attributes;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "EmbraceSpanEvent(name=" + this.name + ", timestampNanos=" + this.timestampNanos + ", attributes=" + this.attributes + ")";
    }
}
