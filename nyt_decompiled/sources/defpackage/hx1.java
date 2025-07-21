package defpackage;

import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory;
import com.nytimes.android.performancetrackerclientphoenix.event.base.BasePerformanceTracker;
import defpackage.fx1;
import defpackage.oa4;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.Severity;
import kotlin.Result;
import kotlin.collections.t;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class hx1 extends BasePerformanceTracker implements fx1 {
    private final fx1.a d;
    private final so1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx1(fx1.a aVar, cr5 cr5Var, AppEventFactory appEventFactory, so1 so1Var, CoroutineScope coroutineScope) {
        super(cr5Var, appEventFactory, coroutineScope);
        zq3.h(aVar, "eCommEventListenerManager");
        zq3.h(cr5Var, "performanceTracker");
        zq3.h(appEventFactory, "appEventFactory");
        zq3.h(so1Var, "deviceConfig");
        zq3.h(coroutineScope, "scope");
        this.d = aVar;
        this.e = so1Var;
    }

    @Override // defpackage.fx1
    public void b(oa4.b bVar) {
        zq3.h(bVar, "response");
        k(new AppEvent.Auth.Error.UnableToSignIn(bVar.a().c()));
    }

    @Override // defpackage.fx1
    public void c(oa4.b bVar) {
        zq3.h(bVar, "response");
        k(new AppEvent.Auth.Error.UnableToCreateAccount(bVar.a().c()));
    }

    public final void l() {
        this.d.a(this);
    }

    public final void m(Object obj) {
        if (Result.h(obj)) {
            if (Result.g(obj)) {
                obj = null;
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                k(new AppEvent.ProductDetail.ProductDetailStatus(booleanValue));
                if (booleanValue) {
                    return;
                }
                Embrace.getInstance().logMessage("Product Detail API is Not Supported", Severity.WARNING, t.f(du8.a("googlePlayServicesVersion", Long.valueOf(this.e.f()))));
            }
        }
    }
}
