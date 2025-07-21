package defpackage;

/* loaded from: classes5.dex */
public abstract class x06 {
    public static int a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
