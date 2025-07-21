package io.embrace.android.embracesdk.injection;

import io.embrace.android.embracesdk.arch.datasource.DataSourceState;
import io.embrace.android.embracesdk.capture.aei.AeiDataSource;
import io.embrace.android.embracesdk.capture.connectivity.NetworkStatusDataSource;
import io.embrace.android.embracesdk.capture.crumbs.BreadcrumbDataSource;
import io.embrace.android.embracesdk.capture.crumbs.PushNotificationDataSource;
import io.embrace.android.embracesdk.capture.crumbs.TapDataSource;
import io.embrace.android.embracesdk.capture.crumbs.ViewDataSource;
import io.embrace.android.embracesdk.capture.crumbs.WebViewUrlDataSource;
import io.embrace.android.embracesdk.capture.memory.MemoryWarningDataSource;
import io.embrace.android.embracesdk.capture.powersave.LowPowerDataSource;
import io.embrace.android.embracesdk.capture.session.SessionPropertiesDataSource;
import java.util.List;

/* loaded from: classes5.dex */
public interface DataSourceModule {
    DataSourceState<AeiDataSource> getApplicationExitInfoDataSource();

    DataSourceState<BreadcrumbDataSource> getBreadcrumbDataSource();

    List<DataSourceState<?>> getDataSources();

    DataSourceState<LowPowerDataSource> getLowPowerDataSource();

    DataSourceState<MemoryWarningDataSource> getMemoryWarningDataSource();

    DataSourceState<NetworkStatusDataSource> getNetworkStatusDataSource();

    DataSourceState<PushNotificationDataSource> getPushNotificationDataSource();

    DataSourceState<SessionPropertiesDataSource> getSessionPropertiesDataSource();

    DataSourceState<TapDataSource> getTapDataSource();

    DataSourceState<ViewDataSource> getViewDataSource();

    DataSourceState<WebViewUrlDataSource> getWebViewUrlDataSource();
}
