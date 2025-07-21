package androidx.datastore.preferences.core;

import defpackage.ba1;
import defpackage.da1;
import defpackage.lf2;
import defpackage.qs2;
import defpackage.rx6;
import defpackage.w16;
import defpackage.zq3;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class PreferenceDataStoreFactory {
    public static final PreferenceDataStoreFactory a = new PreferenceDataStoreFactory();

    private PreferenceDataStoreFactory() {
    }

    public final ba1 a(rx6 rx6Var, List list, CoroutineScope coroutineScope, final qs2 qs2Var) {
        zq3.h(list, "migrations");
        zq3.h(coroutineScope, "scope");
        zq3.h(qs2Var, "produceFile");
        return new PreferenceDataStore(da1.a.a(w16.a, rx6Var, list, coroutineScope, new qs2() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final File mo865invoke() {
                File file = (File) qs2.this.mo865invoke();
                String n = lf2.n(file);
                w16 w16Var = w16.a;
                if (zq3.c(n, w16Var.f())) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: " + w16Var.f()).toString());
            }
        }));
    }
}
