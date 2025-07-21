package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class a41 {
    public byte[] a(List list) {
        ArrayList<? extends Parcelable> i = pe0.i(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(QueryKeys.TIME_ON_VIEW_IN_MINUTES, i);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
