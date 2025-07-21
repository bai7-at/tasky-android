package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class Response {
    private final Object value;

    public Response(Object obj) {
        zq3.h(obj, "value");
        this.value = obj;
    }

    public static /* synthetic */ Response copy$default(Response response, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = response.value;
        }
        return response.copy(obj);
    }

    public final Object component1() {
        return this.value;
    }

    public final Response copy(Object obj) {
        zq3.h(obj, "value");
        return new Response(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Response) && zq3.c(this.value, ((Response) obj).value);
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "Response(value=" + this.value + ')';
    }
}
