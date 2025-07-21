package io.embrace.android.embracesdk.comms.delivery;

import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class CachedSession {
    public static final Companion Companion = new Companion(null);
    private static final String V2_PREFIX = "v2";
    private final String filename;
    private final String sessionId;
    private final long timestampMs;
    private final boolean v2Payload;

    public static final class Companion {
        private Companion() {
        }

        private final String getV1FileNameForSession(String str, long j) {
            return "last_session." + j + '.' + str + ".json";
        }

        private final String getV2FileNameForSession(String str, long j) {
            return "last_session." + j + '.' + str + ".v2.json";
        }

        private final boolean isV2Payload(String str) {
            return h.v(str, "v2.json", false, 2, null);
        }

        public final CachedSession create(String str, long j, boolean z) {
            zq3.h(str, "sessionId");
            return new CachedSession(str, j, z ? getV2FileNameForSession(str, j) : getV1FileNameForSession(str, j), z, null);
        }

        public final CachedSession fromFilename(String str) {
            zq3.h(str, "filename");
            List E0 = h.E0(str, new char[]{'.'}, false, 0, 6, null);
            if (E0.size() != 4 && E0.size() != 5) {
                return null;
            }
            boolean isV2Payload = isV2Payload(str);
            if (isV2Payload) {
                E0 = i.P0(E0, 4);
            }
            Long n = h.n((String) E0.get(1));
            if (n == null) {
                return null;
            }
            return CachedSession.Companion.create((String) E0.get(2), n.longValue(), isV2Payload);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private CachedSession(String str, long j, String str2, boolean z) {
        this.sessionId = str;
        this.timestampMs = j;
        this.filename = str2;
        this.v2Payload = z;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }

    public final boolean getV2Payload() {
        return this.v2Payload;
    }

    public /* synthetic */ CachedSession(String str, long j, String str2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, z);
    }
}
