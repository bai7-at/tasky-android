package com.google.android.gms.internal.pal;

import defpackage.g0a;
import defpackage.i0a;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class zzagc extends zzagf implements Serializable, g0a {
    public static final zzagc a = new zzagc(0);

    public zzagc(long j) {
        super(j);
    }

    public static zzagc a(long j) {
        return j == 0 ? a : new zzagc(j);
    }

    public static zzagc b(long j) {
        return new zzagc(i0a.a(j, 3600000));
    }

    public static zzagc c(long j) {
        return new zzagc(i0a.a(j, NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT));
    }
}
