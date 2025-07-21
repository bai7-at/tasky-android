package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.e;

/* loaded from: classes2.dex */
public abstract class ClientInfo {

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        ClientType(int i) {
            this.value = i;
        }
    }

    public static abstract class a {
        public abstract ClientInfo a();

        public abstract a b(com.google.android.datatransport.cct.internal.a aVar);

        public abstract a c(ClientType clientType);
    }

    public static a a() {
        return new e.b();
    }

    public abstract com.google.android.datatransport.cct.internal.a b();

    public abstract ClientType c();
}
