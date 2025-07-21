package com.datadog.android.core.internal;

import com.datadog.android.api.InternalLogger;
import defpackage.j73;
import defpackage.k47;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.yj0;
import defpackage.zq3;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class Sha256HashGenerator implements j73 {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // defpackage.j73
    public String a(String str) {
        zq3.h(str, "input");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(yj0.b);
            zq3.g(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            zq3.g(digest, "hashBytes");
            return d.q0(digest, "", null, null, 0, null, new ss2() { // from class: com.datadog.android.core.internal.Sha256HashGenerator$generate$1
                public final CharSequence b(byte b) {
                    String format = String.format(Locale.US, "%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).byteValue());
                }
            }, 30, null);
        } catch (NoSuchAlgorithmException e) {
            InternalLogger.b.a(k47.a(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.Sha256HashGenerator$generate$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Cannot generate SHA-256 hash.";
                }
            }, e, false, null, 48, null);
            return null;
        }
    }
}
