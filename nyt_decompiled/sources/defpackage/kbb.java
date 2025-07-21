package defpackage;

import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class kbb {
    private static final ClassLoader a = kbb.class.getClassLoader();

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
