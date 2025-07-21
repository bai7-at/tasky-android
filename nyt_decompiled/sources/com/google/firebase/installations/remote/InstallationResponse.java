package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.a;

/* loaded from: classes3.dex */
public abstract class InstallationResponse {

    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    public static abstract class a {
        public abstract InstallationResponse a();

        public abstract a b(TokenResult tokenResult);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(ResponseCode responseCode);

        public abstract a f(String str);
    }

    public static a a() {
        return new a.b();
    }

    public abstract TokenResult b();

    public abstract String c();

    public abstract String d();

    public abstract ResponseCode e();

    public abstract String f();
}
