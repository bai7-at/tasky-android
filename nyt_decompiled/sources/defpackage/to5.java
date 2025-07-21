package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.nytimes.android.api.cms.Tag;

/* loaded from: classes.dex */
public abstract class to5 {
    public static f59 a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static f59 b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(to5.class.getClassLoader());
            return a(bundle2.getParcelable(Tag.A));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void c(Bundle bundle, String str, f59 f59Var) {
        if (f59Var == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(Tag.A, d(f59Var));
        bundle.putParcelable(str, bundle2);
    }

    public static Parcelable d(f59 f59Var) {
        return new ParcelImpl(f59Var);
    }
}
