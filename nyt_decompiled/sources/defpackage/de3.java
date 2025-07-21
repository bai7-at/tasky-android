package defpackage;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface de3 extends IInterface {
    public static final String v = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    public static abstract class a extends Binder implements de3 {

        /* renamed from: de3$a$a, reason: collision with other inner class name */
        private static class C0477a implements de3 {
            private IBinder a;

            C0477a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // defpackage.de3
            public void e6(String str, int i, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(de3.v);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    b.b(obtain, notification, 0);
                    this.a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static de3 O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(de3.v);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof de3)) ? new C0477a(iBinder) : (de3) queryLocalInterface;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }
    }

    void e6(String str, int i, String str2, Notification notification);
}
