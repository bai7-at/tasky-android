package defpackage;

/* loaded from: classes3.dex */
public abstract class j3f {
    public static j3f b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new e3f(cls.getSimpleName()) : new g3f(cls.getSimpleName());
    }

    public abstract void a(String str);
}
