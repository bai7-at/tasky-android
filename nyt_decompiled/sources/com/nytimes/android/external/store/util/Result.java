package com.nytimes.android.external.store.util;

/* loaded from: classes4.dex */
public final class Result {
    private final Source a;
    private final Object b;

    public enum Source {
        CACHE,
        NETWORK
    }

    private Result(Source source, Object obj) {
        this.a = source;
        this.b = obj;
    }

    public static Result a(Object obj) {
        return new Result(Source.CACHE, obj);
    }

    public static Result b(Object obj) {
        return new Result(Source.NETWORK, obj);
    }

    public Object c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Result.class != obj.getClass()) {
            return false;
        }
        Result result = (Result) obj;
        Source source = this.a;
        if (source != null && !source.equals(result.a)) {
            return false;
        }
        if (this.a == null && result.a != null) {
            return false;
        }
        Object obj2 = this.b;
        return obj2 != null ? obj2.equals(result.b) : result.b == null;
    }

    public int hashCode() {
        Source source = this.a;
        int hashCode = (source != null ? source.hashCode() : 0) * 31;
        Object obj = this.b;
        return obj != null ? hashCode + obj.hashCode() : hashCode;
    }
}
