package com.nytimes.android.internal.auth.signing.util;

import android.util.Base64;
import defpackage.c04;
import defpackage.cs7;
import defpackage.q31;
import defpackage.qs2;
import defpackage.xv3;
import defpackage.yj0;
import defpackage.zq3;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;
import kotlin.c;
import kotlin.collections.d;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class RSASigner implements cs7 {
    private final c04 a;

    public RSASigner(final qs2 qs2Var) {
        zq3.h(qs2Var, "keyHolderProvider");
        this.a = c.a(new qs2() { // from class: com.nytimes.android.internal.auth.signing.util.RSASigner$privateKey$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PrivateKey mo865invoke() {
                xv3 xv3Var = (xv3) qs2.this.mo865invoke();
                if (xv3Var instanceof xv3.a) {
                    return ((xv3.a) xv3Var).a();
                }
                throw new IllegalStateException("unable to load samizdat key");
            }
        });
    }

    private final String b(long j, String str, String[] strArr) {
        int e0 = d.e0(strArr);
        if (e0 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i = e0 - 1;
        String str2 = strArr[e0];
        while (i >= 0) {
            int i2 = i - 1;
            str2 = strArr[i] + "\n" + str2 + "\n";
            i = i2;
        }
        return j + "\n" + str + "\n" + ((Object) str2);
    }

    private final PrivateKey d() {
        return (PrivateKey) this.a.getValue();
    }

    private final boolean e(String[] strArr) {
        if (strArr.length == 0) {
            return false;
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (!(str == null || h.d0(str))) {
                return true;
            }
        }
        return false;
    }

    private final boolean f(long j) {
        return j > 0;
    }

    @Override // defpackage.cs7
    public String a(String str, long j, String... strArr) {
        zq3.h(str, "url");
        zq3.h(strArr, "attributes");
        String path = new URL(str).getPath();
        if (!f(j) || !e(strArr)) {
            throw new IllegalStateException("Could not sign request because either the timestamp was invalid, app type was not provided, or app version was not provided");
        }
        byte[] bytes = b(j, path, strArr).getBytes(yj0.b);
        zq3.g(bytes, "getBytes(...)");
        return h.F(c(q31.a.a(d(), bytes)), "\n", "", false, 4, null);
    }

    public final String c(byte[] bArr) {
        zq3.h(bArr, "str");
        byte[] encode = Base64.encode(bArr, 2);
        zq3.e(encode);
        Charset charset = StandardCharsets.UTF_8;
        zq3.g(charset, "UTF_8");
        return new String(encode, charset);
    }
}
