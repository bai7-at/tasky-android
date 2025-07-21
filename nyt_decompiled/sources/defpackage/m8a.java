package defpackage;

import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
final class m8a extends wu9 {
    public m8a(pfe pfeVar, long j, long j2) {
        super(new qu9(), new l8a(pfeVar, null), j, 0L, j + 1, 0L, j2, 188L, NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
    }

    static /* bridge */ /* synthetic */ int h(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
