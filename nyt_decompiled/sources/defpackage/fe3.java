package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface fe3 extends IInterface {

    public static abstract class a extends Binder implements fe3 {

        /* renamed from: fe3$a$a, reason: collision with other inner class name */
        private static class C0483a implements fe3 {
            public static fe3 b;
            private IBinder a;

            C0483a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // defpackage.fe3
            public int J0(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(1, obtain, obtain2, 0) && a.Q1() != null) {
                        int J0 = a.Q1().J0(bundle);
                        obtain2.recycle();
                        obtain.recycle();
                        return J0;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public static fe3 O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof fe3)) ? new C0483a(iBinder) : (fe3) queryLocalInterface;
        }

        public static fe3 Q1() {
            return C0483a.b;
        }
    }

    int J0(Bundle bundle);
}
