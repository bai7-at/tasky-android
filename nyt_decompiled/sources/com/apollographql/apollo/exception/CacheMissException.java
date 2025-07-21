package com.apollographql.apollo.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class CacheMissException extends ApolloException {
    public static final a a = new a(null);
    private final String fieldName;
    private final String key;
    private final boolean stale;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
