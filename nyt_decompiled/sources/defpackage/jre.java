package defpackage;

/* loaded from: classes3.dex */
public final class jre {
    private final String a;
    private final Object b;

    protected jre(String str, Object obj, int i) {
        this.a = str;
        this.b = obj;
    }

    public static jre a(String str, boolean z) {
        return new jre(str, Boolean.valueOf(z), 1);
    }

    public final Object b() {
        oue a = rwe.a();
        if (a != null) {
            return a.zza(this.a, ((Boolean) this.b).booleanValue());
        }
        rwe.b();
        return this.b;
    }
}
