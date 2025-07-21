package defpackage;

/* loaded from: classes3.dex */
public class fe8 implements wl0 {
    private static fe8 a;

    private fe8() {
    }

    public static fe8 a() {
        if (a == null) {
            a = new fe8();
        }
        return a;
    }

    @Override // defpackage.wl0
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
