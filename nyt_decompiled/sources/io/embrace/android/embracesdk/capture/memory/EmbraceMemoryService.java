package io.embrace.android.embracesdk.capture.memory;

import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.datasource.DataSourceState;
import io.embrace.android.embracesdk.injection.DataSourceModule;
import io.embrace.android.embracesdk.internal.clock.Clock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbraceMemoryService implements MemoryService {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_CAPTURED_MEMORY_WARNINGS = 100;
    private final Clock clock;
    private final qs2 dataSourceModuleProvider;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceMemoryService(Clock clock, qs2 qs2Var) {
        zq3.h(clock, "clock");
        zq3.h(qs2Var, "dataSourceModuleProvider");
        this.clock = clock;
        this.dataSourceModuleProvider = qs2Var;
    }

    @Override // io.embrace.android.embracesdk.capture.memory.MemoryService
    public void onMemoryWarning() {
        DataSourceState<MemoryWarningDataSource> memoryWarningDataSource;
        MemoryWarningDataSource dataSource;
        DataSourceModule dataSourceModule = (DataSourceModule) this.dataSourceModuleProvider.mo865invoke();
        if (dataSourceModule == null || (memoryWarningDataSource = dataSourceModule.getMemoryWarningDataSource()) == null || (dataSource = memoryWarningDataSource.getDataSource()) == null) {
            return;
        }
        dataSource.onMemoryWarning(this.clock.now());
    }
}
