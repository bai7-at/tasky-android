package defpackage;

/* loaded from: classes3.dex */
public abstract class kyf {
    private static final gw9 a = new jyf();

    public static int a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
