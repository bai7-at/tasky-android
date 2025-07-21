package io.embrace.android.embracesdk.capture.crumbs;

import android.app.Activity;
import android.os.Bundle;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.datasource.DataSourceState;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.injection.DataSourceModule;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.Breadcrumbs;
import io.embrace.android.embracesdk.payload.PushNotificationBreadcrumb;
import io.embrace.android.embracesdk.payload.TapBreadcrumb;
import io.embrace.android.embracesdk.session.MemoryCleanerListener;
import io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class EmbraceBreadcrumbService implements BreadcrumbService, ActivityLifecycleListener, MemoryCleanerListener {
    private final Clock clock;
    private final ConfigService configService;
    private final qs2 dataSourceModuleProvider;
    private final RnBreadcrumbDataSource rnBreadcrumbDataSource;

    public EmbraceBreadcrumbService(Clock clock, ConfigService configService, qs2 qs2Var, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(clock, "clock");
        zq3.h(configService, "configService");
        zq3.h(qs2Var, "dataSourceModuleProvider");
        zq3.h(internalEmbraceLogger, "logger");
        this.clock = clock;
        this.configService = configService;
        this.dataSourceModuleProvider = qs2Var;
        this.rnBreadcrumbDataSource = new RnBreadcrumbDataSource(configService, internalEmbraceLogger, null, 4, null);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void applicationStartupComplete() {
        ActivityLifecycleListener.DefaultImpls.applicationStartupComplete(this);
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        this.rnBreadcrumbDataSource.cleanCollections();
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.BreadcrumbService
    public boolean endView(String str) {
        DataSourceState<ViewDataSource> viewDataSource;
        ViewDataSource dataSource;
        DataSourceModule dataSourceModule = (DataSourceModule) this.dataSourceModuleProvider.mo865invoke();
        if (dataSourceModule == null || (viewDataSource = dataSourceModule.getViewDataSource()) == null || (dataSource = viewDataSource.getDataSource()) == null) {
            return false;
        }
        return dataSource.endView(str);
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.BreadcrumbService
    public Breadcrumbs flushBreadcrumbs() {
        Breadcrumbs breadcrumbs = getBreadcrumbs();
        cleanCollections();
        return breadcrumbs;
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.BreadcrumbService
    public Breadcrumbs getBreadcrumbs() {
        return new Breadcrumbs(this.rnBreadcrumbDataSource.getCapturedData());
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.BreadcrumbService
    public void logCustom(String str, long j) {
        DataSourceState<BreadcrumbDataSource> breadcrumbDataSource;
        BreadcrumbDataSource dataSource;
        zq3.h(str, "message");
        DataSourceModule dataSourceModule = (DataSourceModule) this.dataSourceModuleProvider.mo865invoke();
        if (dataSourceModule == null || (breadcrumbDataSource = dataSourceModule.getBreadcrumbDataSource()) == null || (dataSource = breadcrumbDataSource.getDataSource()) == null) {
            return;
        }
        dataSource.logCustom(str, j);
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.BreadcrumbService
    public void logPushNotification(String str, String str2, String str3, String str4, Integer num, int i, PushNotificationBreadcrumb.NotificationType notificationType) {
        DataSourceState<PushNotificationDataSource> pushNotificationDataSource;
        PushNotificationDataSource dataSource;
        zq3.h(notificationType, TransferTable.COLUMN_TYPE);
        DataSourceModule dataSourceModule = (DataSourceModule) this.dataSourceModuleProvider.mo865invoke();
        if (dataSourceModule == null || (pushNotificationDataSource = dataSourceModule.getPushNotificationDataSource()) == null || (dataSource = pushNotificationDataSource.getDataSource()) == null) {
            return;
        }
        dataSource.logPushNotification(str, str2, str3, str4, num, notificationType);
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.BreadcrumbService
    public void logRnAction(String str, long j, long j2, Map<String, ? extends Object> map, int i, String str2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(map, "properties");
        zq3.h(str2, "output");
        this.rnBreadcrumbDataSource.logRnAction(str, j, j2, map, i, str2);
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.BreadcrumbService
    public void logTap(Pair<Float, Float> pair, String str, long j, TapBreadcrumb.TapBreadcrumbType tapBreadcrumbType) {
        DataSourceState<TapDataSource> tapDataSource;
        TapDataSource dataSource;
        zq3.h(pair, "point");
        zq3.h(str, "element");
        zq3.h(tapBreadcrumbType, TransferTable.COLUMN_TYPE);
        DataSourceModule dataSourceModule = (DataSourceModule) this.dataSourceModuleProvider.mo865invoke();
        if (dataSourceModule == null || (tapDataSource = dataSourceModule.getTapDataSource()) == null || (dataSource = tapDataSource.getDataSource()) == null) {
            return;
        }
        dataSource.logTap(pair, str, j, tapBreadcrumbType);
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.BreadcrumbService
    public void logView(String str, long j) {
        DataSourceState<ViewDataSource> viewDataSource;
        ViewDataSource dataSource;
        DataSourceModule dataSourceModule = (DataSourceModule) this.dataSourceModuleProvider.mo865invoke();
        if (dataSourceModule == null || (viewDataSource = dataSourceModule.getViewDataSource()) == null || (dataSource = viewDataSource.getDataSource()) == null) {
            return;
        }
        dataSource.changeView(str, false);
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.BreadcrumbService
    public void logWebView(String str, long j) {
        DataSourceState<WebViewUrlDataSource> webViewUrlDataSource;
        WebViewUrlDataSource dataSource;
        DataSourceModule dataSourceModule = (DataSourceModule) this.dataSourceModuleProvider.mo865invoke();
        if (dataSourceModule == null || (webViewUrlDataSource = dataSourceModule.getWebViewUrlDataSource()) == null || (dataSource = webViewUrlDataSource.getDataSource()) == null) {
            return;
        }
        dataSource.logWebView(str, j);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onActivityCreated(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onView(Activity activity) {
        zq3.h(activity, "activity");
        if (this.configService.getBreadcrumbBehavior().isActivityBreadcrumbCaptureEnabled()) {
            logView(activity.getClass().getName(), this.clock.now());
        }
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onViewClose(Activity activity) {
        DataSourceModule dataSourceModule;
        DataSourceState<ViewDataSource> viewDataSource;
        ViewDataSource dataSource;
        zq3.h(activity, "activity");
        if (!this.configService.getBreadcrumbBehavior().isActivityBreadcrumbCaptureEnabled() || (dataSourceModule = (DataSourceModule) this.dataSourceModuleProvider.mo865invoke()) == null || (viewDataSource = dataSourceModule.getViewDataSource()) == null || (dataSource = viewDataSource.getDataSource()) == null) {
            return;
        }
        dataSource.onViewClose();
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.BreadcrumbService
    public boolean startView(String str) {
        DataSourceState<ViewDataSource> viewDataSource;
        ViewDataSource dataSource;
        DataSourceModule dataSourceModule = (DataSourceModule) this.dataSourceModuleProvider.mo865invoke();
        if (dataSourceModule == null || (viewDataSource = dataSourceModule.getViewDataSource()) == null || (dataSource = viewDataSource.getDataSource()) == null) {
            return false;
        }
        return dataSource.startView(str);
    }
}
