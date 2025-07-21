package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface ce3 extends IInterface {

    public static abstract class a extends hn9 implements ce3 {

        /* renamed from: ce3$a$a, reason: collision with other inner class name */
        public static class C0131a extends fn9 implements ce3 {
            C0131a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // defpackage.ce3
            public final Bundle w1(Bundle bundle) {
                Parcel O = O();
                jn9.b(O, bundle);
                Parcel Q1 = Q1(O);
                Bundle bundle2 = (Bundle) jn9.a(Q1, Bundle.CREATOR);
                Q1.recycle();
                return bundle2;
            }
        }

        public static ce3 O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return queryLocalInterface instanceof ce3 ? (ce3) queryLocalInterface : new C0131a(iBinder);
        }
    }

    Bundle w1(Bundle bundle);
}
