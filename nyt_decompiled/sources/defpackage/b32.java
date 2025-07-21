package defpackage;

import com.google.android.datatransport.Priority;

/* loaded from: classes2.dex */
public abstract class b32 {
    public static b32 d(Object obj) {
        return new m10(null, obj, Priority.DEFAULT);
    }

    public static b32 e(Object obj) {
        return new m10(null, obj, Priority.VERY_LOW);
    }

    public static b32 f(Object obj) {
        return new m10(null, obj, Priority.HIGHEST);
    }

    public abstract Integer a();

    public abstract Object b();

    public abstract Priority c();
}
