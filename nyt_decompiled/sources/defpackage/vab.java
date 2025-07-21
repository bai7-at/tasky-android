package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.comscore.streaming.ContentDistributionModel;

/* loaded from: classes3.dex */
public final class vab extends t0f implements hzc {
    vab(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // defpackage.hzc
    public final Bundle A2(int i, String str, String str2, Bundle bundle) {
        Parcel O = O();
        O.writeInt(3);
        O.writeString(str);
        O.writeString(str2);
        p8f.b(O, bundle);
        Parcel Q1 = Q1(2, O);
        Bundle bundle2 = (Bundle) p8f.a(Q1, Bundle.CREATOR);
        Q1.recycle();
        return bundle2;
    }

    @Override // defpackage.hzc
    public final Bundle D1(int i, String str, String str2, String str3) {
        Parcel O = O();
        O.writeInt(3);
        O.writeString(str);
        O.writeString(str2);
        O.writeString(str3);
        Parcel Q1 = Q1(4, O);
        Bundle bundle = (Bundle) p8f.a(Q1, Bundle.CREATOR);
        Q1.recycle();
        return bundle;
    }

    @Override // defpackage.hzc
    public final int S5(int i, String str, String str2, Bundle bundle) {
        Parcel O = O();
        O.writeInt(i);
        O.writeString(str);
        O.writeString(str2);
        p8f.b(O, bundle);
        Parcel Q1 = Q1(10, O);
        int readInt = Q1.readInt();
        Q1.recycle();
        return readInt;
    }

    @Override // defpackage.hzc
    public final Bundle T3(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel O = O();
        O.writeInt(i);
        O.writeString(str);
        O.writeString(str2);
        p8f.b(O, bundle);
        p8f.b(O, bundle2);
        Parcel Q1 = Q1(ContentDistributionModel.TV_AND_ONLINE, O);
        Bundle bundle3 = (Bundle) p8f.a(Q1, Bundle.CREATOR);
        Q1.recycle();
        return bundle3;
    }

    @Override // defpackage.hzc
    public final Bundle T4(int i, String str, String str2, String str3, String str4) {
        Parcel O = O();
        O.writeInt(3);
        O.writeString(str);
        O.writeString(str2);
        O.writeString(str3);
        O.writeString(null);
        Parcel Q1 = Q1(3, O);
        Bundle bundle = (Bundle) p8f.a(Q1, Bundle.CREATOR);
        Q1.recycle();
        return bundle;
    }

    @Override // defpackage.hzc
    public final int c1(int i, String str, String str2) {
        Parcel O = O();
        O.writeInt(i);
        O.writeString(str);
        O.writeString(str2);
        Parcel Q1 = Q1(1, O);
        int readInt = Q1.readInt();
        Q1.recycle();
        return readInt;
    }

    @Override // defpackage.hzc
    public final Bundle k3(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel O = O();
        O.writeInt(i);
        O.writeString(str);
        O.writeString(str2);
        O.writeString(str3);
        p8f.b(O, bundle);
        Parcel Q1 = Q1(11, O);
        Bundle bundle2 = (Bundle) p8f.a(Q1, Bundle.CREATOR);
        Q1.recycle();
        return bundle2;
    }

    @Override // defpackage.hzc
    public final Bundle m6(int i, String str, String str2, Bundle bundle) {
        Parcel O = O();
        O.writeInt(9);
        O.writeString(str);
        O.writeString(str2);
        p8f.b(O, bundle);
        Parcel Q1 = Q1(ContentDistributionModel.EXCLUSIVELY_ONLINE, O);
        Bundle bundle2 = (Bundle) p8f.a(Q1, Bundle.CREATOR);
        Q1.recycle();
        return bundle2;
    }

    @Override // defpackage.hzc
    public final Bundle x2(int i, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel O = O();
        O.writeInt(i);
        O.writeString(str);
        O.writeString(str2);
        O.writeString(str3);
        O.writeString(null);
        p8f.b(O, bundle);
        Parcel Q1 = Q1(8, O);
        Bundle bundle2 = (Bundle) p8f.a(Q1, Bundle.CREATOR);
        Q1.recycle();
        return bundle2;
    }
}
