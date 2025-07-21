package io.embrace.android.embracesdk.injection;

import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.datasource.DataSource;
import io.embrace.android.embracesdk.arch.datasource.DataSourceState;
import java.util.List;

/* loaded from: classes5.dex */
final class DataSourceDelegate<S extends DataSource<?>> implements hp6 {
    private final DataSourceState<S> value;

    public DataSourceDelegate(qs2 qs2Var, List<DataSourceState<?>> list) {
        zq3.h(qs2Var, "provider");
        zq3.h(list, "values");
        DataSourceState<S> dataSourceState = (DataSourceState) qs2Var.mo865invoke();
        this.value = dataSourceState;
        list.add(dataSourceState);
    }

    @Override // defpackage.hp6
    public DataSourceState<S> getValue(Object obj, iv3 iv3Var) {
        zq3.h(iv3Var, "property");
        return this.value;
    }
}
