package com.google.android.gms.common.api.internal;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes2.dex */
final class e0 {
    private final ApiKey a;
    private final Feature b;

    /* synthetic */ e0(ApiKey apiKey, Feature feature, zabr zabrVar) {
        this.a = apiKey;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof e0)) {
            e0 e0Var = (e0) obj;
            if (Objects.equal(this.a, e0Var.a) && Objects.equal(this.b, e0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(TransferTable.COLUMN_KEY, this.a).add("feature", this.b).toString();
    }
}
