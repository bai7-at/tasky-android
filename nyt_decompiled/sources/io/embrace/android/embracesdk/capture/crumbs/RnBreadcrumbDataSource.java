package io.embrace.android.embracesdk.capture.crumbs;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.DataCaptureService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.RnActionBreadcrumb;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class RnBreadcrumbDataSource implements DataCaptureService<List<? extends RnActionBreadcrumb>> {
    private final ConfigService configService;
    private final InternalEmbraceLogger logger;
    private final BreadcrumbDataStore<RnActionBreadcrumb> store;

    public RnBreadcrumbDataSource(ConfigService configService, InternalEmbraceLogger internalEmbraceLogger, BreadcrumbDataStore<RnActionBreadcrumb> breadcrumbDataStore) {
        zq3.h(configService, "configService");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(breadcrumbDataStore, "store");
        this.configService = configService;
        this.logger = internalEmbraceLogger;
        this.store = breadcrumbDataStore;
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        this.store.cleanCollections();
    }

    @Override // io.embrace.android.embracesdk.arch.DataCaptureService
    public List<? extends RnActionBreadcrumb> getCapturedData() {
        return this.store.getCapturedData();
    }

    public final void logRnAction(String str, long j, long j2, Map<String, ? extends Object> map, int i, String str2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(map, "properties");
        zq3.h(str2, "output");
        RnActionBreadcrumb.Companion companion = RnActionBreadcrumb.Companion;
        if (!companion.validateRnBreadcrumbOutputName(str2)) {
            this.logger.log("RN Action output is invalid, the valid values are " + companion.getValidRnBreadcrumbOutputName(), InternalEmbraceLogger.Severity.WARNING, null, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.logger.log("RN Action name must not be blank", InternalEmbraceLogger.Severity.WARNING, null, false);
            return;
        }
        try {
            this.store.tryAddBreadcrumb(new RnActionBreadcrumb(str, j, j2, map, i, str2));
        } catch (Exception e) {
            this.logger.log("Failed to log RN Action breadcrumb with name " + str, InternalEmbraceLogger.Severity.DEBUG, e, true);
        }
    }

    public /* synthetic */ RnBreadcrumbDataSource(final ConfigService configService, InternalEmbraceLogger internalEmbraceLogger, BreadcrumbDataStore breadcrumbDataStore, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(configService, internalEmbraceLogger, (i & 4) != 0 ? new BreadcrumbDataStore(new qs2() { // from class: io.embrace.android.embracesdk.capture.crumbs.RnBreadcrumbDataSource.1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Integer.valueOf(invoke());
            }

            public final int invoke() {
                return ConfigService.this.getBreadcrumbBehavior().getCustomBreadcrumbLimit();
            }
        }) : breadcrumbDataStore);
    }
}
