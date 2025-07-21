package defpackage;

import android.content.Context;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes4.dex */
public abstract class nm9 {
    static final /* synthetic */ iv3[] a = {zt6.i(new PropertyReference1Impl(nm9.class, "youTabDataStore", "getYouTabDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final hp6 b = PreferenceDataStoreDelegateKt.b("you_tab", null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ba1 b(Context context) {
        return (ba1) b.getValue(context, a[0]);
    }
}
