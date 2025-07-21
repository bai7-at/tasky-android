package com.facebook.appevents;

import com.facebook.AccessToken;
import defpackage.g29;
import defpackage.w92;
import defpackage.zq3;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class AccessTokenAppIdPair implements Serializable {
    public static final a a = new a(null);
    private static final long serialVersionUID = 1;
    private final String accessTokenString;
    private final String applicationId;

    public static final class SerializationProxyV1 implements Serializable {
        public static final a a = new a(null);
        private static final long serialVersionUID = -2488473066578201069L;
        private final String accessTokenString;
        private final String appId;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public SerializationProxyV1(String str, String str2) {
            zq3.h(str2, "appId");
            this.accessTokenString = str;
            this.appId = str2;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new AccessTokenAppIdPair(this.accessTokenString, this.appId);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AccessTokenAppIdPair(String str, String str2) {
        zq3.h(str2, "applicationId");
        this.applicationId = str2;
        this.accessTokenString = g29.Y(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new SerializationProxyV1(this.accessTokenString, this.applicationId);
    }

    public final String a() {
        return this.accessTokenString;
    }

    public final String b() {
        return this.applicationId;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        g29 g29Var = g29.a;
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        return g29.e(accessTokenAppIdPair.accessTokenString, this.accessTokenString) && g29.e(accessTokenAppIdPair.applicationId, this.applicationId);
    }

    public int hashCode() {
        String str = this.accessTokenString;
        return this.applicationId.hashCode() ^ (str == null ? 0 : str.hashCode());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessTokenAppIdPair(AccessToken accessToken) {
        this(accessToken.m(), w92.m());
        zq3.h(accessToken, "accessToken");
    }
}
