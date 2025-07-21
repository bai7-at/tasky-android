package com.nytimes.android.external.cache3;

import defpackage.e16;
import defpackage.i64;

/* loaded from: classes4.dex */
public abstract class CacheLoader {

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }

    protected CacheLoader() {
    }

    public abstract Object a(Object obj);

    public i64 b(Object obj, Object obj2) {
        e16.d(obj);
        e16.d(obj2);
        return a.b(a(obj));
    }
}
