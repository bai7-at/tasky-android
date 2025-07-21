package defpackage;

/* loaded from: classes5.dex */
public final class wm5 implements al0 {
    private final Class a;
    private final String b;

    public wm5(Class cls, String str) {
        zq3.h(cls, "jClass");
        zq3.h(str, "moduleName");
        this.a = cls;
        this.b = str;
    }

    @Override // defpackage.al0
    public Class a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof wm5) && zq3.c(a(), ((wm5) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
