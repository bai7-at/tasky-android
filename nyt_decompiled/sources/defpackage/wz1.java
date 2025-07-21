package defpackage;

import android.text.Editable;

/* loaded from: classes.dex */
final class wz1 extends Editable.Factory {
    private static final Object a = new Object();
    private static volatile Editable.Factory b;
    private static Class c;

    private wz1() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, wz1.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (b == null) {
            synchronized (a) {
                try {
                    if (b == null) {
                        b = new wz1();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? ly7.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
