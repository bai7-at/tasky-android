package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzag;
import java.util.List;

/* loaded from: classes2.dex */
final class s {
    private String a = null;
    private long b = -1;
    private zzag c = zzag.q();
    private zzag d = zzag.q();

    s() {
    }

    final s a(long j) {
        this.b = j;
        return this;
    }

    final s b(List list) {
        Preconditions.checkNotNull(list);
        this.d = zzag.p(list);
        return this;
    }

    final s c(List list) {
        Preconditions.checkNotNull(list);
        this.c = zzag.p(list);
        return this;
    }

    final s d(String str) {
        this.a = str;
        return this;
    }

    final c e() {
        if (this.a == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.c.isEmpty() && this.d.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new c(this.a, this.b, this.c, this.d, null);
    }
}
