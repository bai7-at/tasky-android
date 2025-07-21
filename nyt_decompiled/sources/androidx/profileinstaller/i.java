package androidx.profileinstaller;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class i {
    static final byte[] a = {48, 49, 53, 0};
    static final byte[] b = {48, 49, 48, 0};
    static final byte[] c = {48, 48, 57, 0};
    static final byte[] d = {48, 48, 53, 0};
    static final byte[] e = {48, 48, 49, 0};
    static final byte[] f = {48, 48, 49, 0};
    static final byte[] g = {48, 48, 50, 0};

    static String a(byte[] bArr) {
        return (Arrays.equals(bArr, e) || Arrays.equals(bArr, d)) ? ":" : "!";
    }
}
