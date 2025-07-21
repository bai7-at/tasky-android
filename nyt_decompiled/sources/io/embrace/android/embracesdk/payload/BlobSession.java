package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class BlobSession {
    private final String sessionId;

    /* JADX WARN: Multi-variable type inference failed */
    public BlobSession() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BlobSession copy$default(BlobSession blobSession, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blobSession.sessionId;
        }
        return blobSession.copy(str);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final BlobSession copy(@bt3(name = "si") String str) {
        return new BlobSession(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BlobSession) && zq3.c(this.sessionId, ((BlobSession) obj).sessionId);
        }
        return true;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        String str = this.sessionId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "BlobSession(sessionId=" + this.sessionId + ")";
    }

    public BlobSession(@bt3(name = "si") String str) {
        this.sessionId = str;
    }

    public /* synthetic */ BlobSession(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
