package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class DeleteAccountResponseMeta {
    private final List a;

    public DeleteAccountResponseMeta(List list) {
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteAccountResponseMeta) && zq3.c(this.a, ((DeleteAccountResponseMeta) obj).a);
    }

    public int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "DeleteAccountResponseMeta(errors=" + this.a + ")";
    }

    public /* synthetic */ DeleteAccountResponseMeta(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
