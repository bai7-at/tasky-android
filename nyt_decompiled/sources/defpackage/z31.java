package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.chartbeat.androidsdk.QueryKeys;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class z31 {
    public ImmutableList a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return pe0.d(y31.i0, (ArrayList) ur.e(readBundle.getParcelableArrayList(QueryKeys.TIME_ON_VIEW_IN_MINUTES)));
    }
}
