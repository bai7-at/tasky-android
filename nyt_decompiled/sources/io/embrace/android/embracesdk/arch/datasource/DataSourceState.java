package io.embrace.android.embracesdk.arch.datasource;

import defpackage.c04;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.SessionType;
import io.embrace.android.embracesdk.arch.datasource.DataSource;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class DataSourceState<T extends DataSource<?>> {
    private final qs2 configGate;
    private SessionType currentSessionType;
    private T dataSource;
    private final SessionType disabledSessionType;
    private final c04 enabledDataSource$delegate;

    public DataSourceState(qs2 qs2Var, qs2 qs2Var2, SessionType sessionType, SessionType sessionType2) {
        zq3.h(qs2Var, "factory");
        zq3.h(qs2Var2, "configGate");
        this.configGate = qs2Var2;
        this.currentSessionType = sessionType;
        this.disabledSessionType = sessionType2;
        this.enabledDataSource$delegate = c.a(qs2Var);
        updateDataSource();
    }

    private final T getEnabledDataSource() {
        return (T) this.enabledDataSource$delegate.getValue();
    }

    private final void updateDataSource() {
        T t;
        SessionType sessionType = this.currentSessionType;
        boolean z = (sessionType == null || sessionType == this.disabledSessionType || !((Boolean) this.configGate.mo865invoke()).booleanValue()) ? false : true;
        T t2 = null;
        if (z && this.dataSource == null) {
            T enabledDataSource = getEnabledDataSource();
            if (enabledDataSource != null) {
                enabledDataSource.enableDataCapture();
                ww8 ww8Var = ww8.a;
                t2 = enabledDataSource;
            }
            this.dataSource = t2;
            return;
        }
        if (z || (t = this.dataSource) == null) {
            return;
        }
        if (t != null) {
            t.disableDataCapture();
        }
        this.dataSource = null;
    }

    public final T getDataSource() {
        return this.dataSource;
    }

    public final void onConfigChange() {
        updateDataSource();
    }

    public final void onSessionTypeChange(SessionType sessionType) {
        this.currentSessionType = sessionType;
        updateDataSource();
        T enabledDataSource = getEnabledDataSource();
        if (enabledDataSource != null) {
            enabledDataSource.resetDataCaptureLimits();
        }
    }

    public /* synthetic */ DataSourceState(qs2 qs2Var, qs2 qs2Var2, SessionType sessionType, SessionType sessionType2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qs2Var, (i & 2) != 0 ? new qs2() { // from class: io.embrace.android.embracesdk.arch.datasource.DataSourceState.1
            /* renamed from: invoke, reason: collision with other method in class */
            public final boolean m864invoke() {
                return true;
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Boolean.valueOf(m864invoke());
            }
        } : qs2Var2, (i & 4) != 0 ? null : sessionType, (i & 8) != 0 ? null : sessionType2);
    }
}
