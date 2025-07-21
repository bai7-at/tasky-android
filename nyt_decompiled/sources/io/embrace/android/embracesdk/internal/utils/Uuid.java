package io.embrace.android.embracesdk.internal.utils;

import defpackage.zq3;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class Uuid {
    public static final Uuid INSTANCE = new Uuid();

    private Uuid() {
    }

    public static final String getEmbUuid() {
        return getEmbUuid$default(null, 1, null);
    }

    public static /* synthetic */ String getEmbUuid$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return getEmbUuid(str);
    }

    public static final String getEmbUuid(String str) {
        if (str == null) {
            str = UUID.randomUUID().toString();
            zq3.g(str, "UUID.randomUUID().toString()");
        }
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        char[] charArray = str.toCharArray();
        zq3.g(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (c != '-') {
                if (c != ' ') {
                    switch (c) {
                        case 'a':
                            sb.append('A');
                            break;
                        case 'b':
                            sb.append('B');
                            break;
                        case 'c':
                            sb.append('C');
                            break;
                        case 'd':
                            sb.append('D');
                            break;
                        case 'e':
                            sb.append('E');
                            break;
                        case 'f':
                            sb.append('F');
                            break;
                        default:
                            sb.append(c);
                            break;
                    }
                } else {
                    sb.append('0');
                }
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "sb.toString()");
        return sb2;
    }
}
