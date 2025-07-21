package defpackage;

import com.google.android.gms.common.Feature;

/* loaded from: classes3.dex */
public abstract class i7f {
    public static final Feature a;
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("ADS_ID", 2L);
        a = feature;
        Feature feature2 = new Feature("MAKE_REQUEST_WITH_SIGNALS", 1L);
        b = feature2;
        c = new Feature[]{feature, feature2};
    }
}
