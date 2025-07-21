package defpackage;

import com.google.android.gms.common.Feature;

/* loaded from: classes3.dex */
public abstract class gia {
    public static final Feature a;
    public static final Feature b;
    private static final Feature c;
    private static final Feature d;
    public static final Feature e;
    public static final Feature f;
    private static final Feature g;
    public static final Feature[] h;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 4L);
        a = feature;
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2L);
        b = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1L);
        c = feature3;
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1L);
        d = feature4;
        Feature feature5 = new Feature("auth_api_credentials_save_password", 3L);
        e = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 3L);
        f = feature6;
        Feature feature7 = new Feature("auth_api_credentials_save_account_linking_token", 2L);
        g = feature7;
        h = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7};
    }
}
