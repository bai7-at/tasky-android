package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class cq9 implements IInterface {
    private final IBinder a;
    private final String b = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    protected cq9(IBinder iBinder, String str) {
        this.a = iBinder;
    }

    protected final Parcel O() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    protected final void Q1(int i, Parcel parcel) {
        try {
            this.a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
