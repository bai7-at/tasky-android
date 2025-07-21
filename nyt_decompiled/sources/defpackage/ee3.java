package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public interface ee3 extends IInterface {

    public static abstract class a extends tka implements ee3 {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static ee3 O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof ee3 ? (ee3) queryLocalInterface : new nka(iBinder);
        }
    }
}
