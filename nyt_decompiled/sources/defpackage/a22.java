package defpackage;

/* loaded from: classes4.dex */
public abstract class a22 {
    public static Object a(Object obj, Class cls) {
        if (obj instanceof gx2) {
            return cls.cast(obj);
        }
        if (obj instanceof hx2) {
            return a(((hx2) obj).generatedComponent(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), gx2.class, hx2.class));
    }
}
