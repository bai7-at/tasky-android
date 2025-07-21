package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public abstract class p8f {
    private static final ClassLoader a = p8f.class.getClassLoader();

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
