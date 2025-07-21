package defpackage;

/* loaded from: classes3.dex */
public final class o8e {
    private final String a;
    private final String b;

    private o8e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static o8e a(String str, String str2) {
        v9e.a(str, "Name is null or empty");
        v9e.a(str2, "Version is null or empty");
        return new o8e(str, str2);
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }
}
