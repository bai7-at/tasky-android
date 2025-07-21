package androidx.datastore.preferences.core;

import defpackage.ba1;
import defpackage.by0;
import defpackage.gt2;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class PreferenceDataStore implements ba1 {
    private final ba1 a;

    public PreferenceDataStore(ba1 ba1Var) {
        zq3.h(ba1Var, "delegate");
        this.a = ba1Var;
    }

    @Override // defpackage.ba1
    public Object a(gt2 gt2Var, by0 by0Var) {
        return this.a.a(new PreferenceDataStore$updateData$2(gt2Var, null), by0Var);
    }

    @Override // defpackage.ba1
    public Flow getData() {
        return this.a.getData();
    }
}
