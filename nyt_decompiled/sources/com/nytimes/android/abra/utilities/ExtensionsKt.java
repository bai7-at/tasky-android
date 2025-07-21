package com.nytimes.android.abra.utilities;

import defpackage.sd0;
import defpackage.ss2;
import defpackage.wd5;
import defpackage.zq3;
import java.io.ByteArrayInputStream;
import okio.ByteString;

/* loaded from: classes2.dex */
public final class ExtensionsKt {
    public static final sd0 bufferedSource(ByteString byteString) {
        zq3.h(byteString, "<this>");
        return wd5.d(wd5.l(new ByteArrayInputStream(byteString.J())));
    }

    public static final <T, R> R maybe(T t, ss2 ss2Var) {
        zq3.h(ss2Var, "block");
        try {
            return (R) ss2Var.invoke(t);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Boolean toExactBoolean(String str) {
        zq3.h(str, "<this>");
        if (zq3.c(str, "true")) {
            return Boolean.TRUE;
        }
        if (zq3.c(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }
}
