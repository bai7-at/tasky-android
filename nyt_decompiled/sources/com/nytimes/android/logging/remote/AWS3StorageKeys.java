package com.nytimes.android.logging.remote;

import android.util.Base64;
import com.nytimes.android.logging.NYTLogger;
import defpackage.yj0;
import defpackage.zq3;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class AWS3StorageKeys {
    public static final a Companion = new a(null);
    private String a = "";

    public static final class AWSStorageKeysException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AWSStorageKeysException(String str) {
            super(str);
            zq3.h(str, "message");
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final String a() {
        return this.a;
    }

    public final void b(String str, String str2) {
        zq3.h(str, "accessKey");
        zq3.h(str2, "secretKey");
        if (str.length() != 20) {
            throw new AWSStorageKeysException("Error: Invalid AWS3 Access Key Length!");
        }
        try {
            byte[] bytes = (str + str2).getBytes(yj0.b);
            zq3.g(bytes, "getBytes(...)");
            byte[] encode = Base64.encode(bytes, 0);
            zq3.g(encode, "encode(...)");
            Charset charset = StandardCharsets.UTF_8;
            zq3.g(charset, "UTF_8");
            this.a = new String(encode, charset);
        } catch (Throwable th) {
            NYTLogger.i(th, "Unable to encode AWS3 access key and secret key into base64.", new Object[0]);
        }
    }
}
