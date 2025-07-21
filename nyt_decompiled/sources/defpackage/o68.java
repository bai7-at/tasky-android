package defpackage;

import com.nytimes.android.subauth.core.database.DatabaseManager;
import com.nytimes.android.subauth.core.database.SubauthDatabase;
import com.nytimes.android.subauth.core.nytuser.NYTUserImpl;

/* loaded from: classes4.dex */
public abstract class o68 implements ba2 {
    public static DatabaseManager a(h68 h68Var, SubauthDatabase subauthDatabase, NYTUserImpl nYTUserImpl) {
        return (DatabaseManager) g16.e(h68Var.g(subauthDatabase, nYTUserImpl));
    }
}
