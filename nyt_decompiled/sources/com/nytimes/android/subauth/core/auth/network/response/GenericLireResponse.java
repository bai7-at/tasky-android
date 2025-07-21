package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class GenericLireResponse {
    private final GenericLireResponseMeta a;

    public GenericLireResponse(GenericLireResponseMeta genericLireResponseMeta) {
        this.a = genericLireResponseMeta;
    }

    public final GenericLireResponseMeta a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericLireResponse) && zq3.c(this.a, ((GenericLireResponse) obj).a);
    }

    public int hashCode() {
        GenericLireResponseMeta genericLireResponseMeta = this.a;
        if (genericLireResponseMeta == null) {
            return 0;
        }
        return genericLireResponseMeta.hashCode();
    }

    public String toString() {
        return "GenericLireResponse(meta=" + this.a + ")";
    }

    public /* synthetic */ GenericLireResponse(GenericLireResponseMeta genericLireResponseMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : genericLireResponseMeta);
    }
}
