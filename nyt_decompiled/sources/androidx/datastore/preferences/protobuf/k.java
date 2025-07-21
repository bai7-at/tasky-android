package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class k {
    static final Class a = c();

    public static l a() {
        if (a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return l.e;
    }

    private static final l b(String str) {
        return (l) a.getDeclaredMethod(str, null).invoke(null, null);
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
