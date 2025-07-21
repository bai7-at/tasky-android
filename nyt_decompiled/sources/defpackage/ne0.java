package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ne0 extends Binder {
    private static final int b;
    private final ImmutableList a;

    static {
        b = z19.a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public ne0(List list) {
        this.a = ImmutableList.t(list);
    }

    public static ImmutableList a(IBinder iBinder) {
        int readInt;
        ImmutableList.a p = ImmutableList.p();
        int i = 0;
        int i2 = 1;
        while (i2 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            p.a((Bundle) ur.e(obtain2.readBundle()));
                            i++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i2 = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return p.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    protected boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.a.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < b) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) this.a.get(readInt));
            readInt++;
        }
        parcel2.writeInt(readInt < size ? 2 : 0);
        return true;
    }
}
