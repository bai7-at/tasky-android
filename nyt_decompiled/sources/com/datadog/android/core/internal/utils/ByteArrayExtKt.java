package com.datadog.android.core.internal.utils;

import com.datadog.android.api.InternalLogger;
import defpackage.bj3;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public abstract class ByteArrayExtKt {
    public static final boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3, InternalLogger internalLogger) {
        zq3.h(bArr, "<this>");
        zq3.h(bArr2, "dest");
        zq3.h(internalLogger, "internalLogger");
        if (i2 + i3 > bArr2.length) {
            InternalLogger.b.a(internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.utils.ByteArrayExtKt$copyTo$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Cannot copy ByteArray, dest doesn't have enough space";
                }
            }, null, false, null, 56, null);
            return false;
        }
        if (i + i3 > bArr.length) {
            InternalLogger.b.a(internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.utils.ByteArrayExtKt$copyTo$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Cannot copy ByteArray, src doesn't have enough data";
                }
            }, null, false, null, 56, null);
            return false;
        }
        System.arraycopy(bArr, i, bArr2, i2, i3);
        return true;
    }

    public static final byte[] b(Collection collection, byte[] bArr, byte[] bArr2, byte[] bArr3, InternalLogger internalLogger) {
        zq3.h(collection, "<this>");
        zq3.h(bArr, "separator");
        zq3.h(bArr2, "prefix");
        zq3.h(bArr3, "suffix");
        zq3.h(internalLogger, "internalLogger");
        Iterator it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += ((byte[]) it2.next()).length;
        }
        byte[] bArr4 = new byte[bArr2.length + i + (collection.isEmpty() ? 0 : (collection.size() - 1) * bArr.length) + bArr3.length];
        a(bArr2, 0, bArr4, 0, bArr2.length, internalLogger);
        int length = bArr2.length;
        for (bj3 bj3Var : i.g1(collection)) {
            a((byte[]) bj3Var.b(), 0, bArr4, length, ((byte[]) bj3Var.b()).length, internalLogger);
            length += ((byte[]) bj3Var.b()).length;
            if (bj3Var.a() != collection.size() - 1) {
                a(bArr, 0, bArr4, length, bArr.length, internalLogger);
                length += bArr.length;
            }
        }
        a(bArr3, 0, bArr4, length, bArr3.length, internalLogger);
        return bArr4;
    }

    public static /* synthetic */ byte[] c(Collection collection, byte[] bArr, byte[] bArr2, byte[] bArr3, InternalLogger internalLogger, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr2 = new byte[0];
        }
        if ((i & 4) != 0) {
            bArr3 = new byte[0];
        }
        return b(collection, bArr, bArr2, bArr3, internalLogger);
    }
}
