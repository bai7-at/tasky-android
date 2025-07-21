package defpackage;

import android.webkit.WebView;
import com.nytimes.android.ads.model.AdEventName;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class oj7 extends mc0 {
    public static final a Companion = new a(null);
    public static final int c = 8;
    private final i7 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdEventName.values().length];
            try {
                iArr[AdEventName.AdRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdEventName.AdFetchNoFill.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdEventName.AdFetchSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdEventName.AdFetchError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj7(i7 i7Var) {
        super("sendDataDogLog");
        zq3.h(i7Var, "performanceTracker");
        this.b = i7Var;
    }

    private final BridgeCommandResult c(int i, AdEventName adEventName, k6 k6Var) {
        int i2 = b.a[adEventName.ordinal()];
        if (i2 == 1) {
            this.b.t(k6Var.e(), Boolean.valueOf(k6Var.d()), k6Var.c(), k6Var.a(), k6Var.b(), k6Var.f(), k6Var.g());
        } else if (i2 == 2) {
            this.b.o(k6Var.e(), k6Var.g(), k6Var.f());
        } else if (i2 == 3) {
            this.b.n(k6Var.e(), k6Var.g(), k6Var.f());
        } else if (i2 == 4) {
            this.b.m(k6Var.e(), k6Var.g(), k6Var.f());
        }
        return BridgeCommandResult.Companion.c(i, t.i());
    }

    private final BridgeCommandResult d(int i, String str, Map map) {
        AdEventName adEventName;
        AdEventName[] values = AdEventName.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                adEventName = null;
                break;
            }
            adEventName = values[i2];
            if (h.w(adEventName.name(), str, true)) {
                break;
            }
            i2++;
        }
        if (adEventName != null) {
            return c(i, adEventName, k6.Companion.a(map));
        }
        return BridgeCommandResult.a.b(BridgeCommandResult.Companion, i, "Unsupported Event Name: " + str, null, 4, null);
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        return d(i, nc0Var.j("eventName"), nc0Var.g("options"));
    }
}
