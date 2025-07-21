package com.nytimes.android.readerhybrid;

import com.nytimes.android.api.cms.ArticleAsset;
import com.nytimes.android.hybrid.HybridConfig;
import com.nytimes.android.hybrid.bridge.NativeBridge;
import defpackage.bc3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ld3;
import defpackage.ww8;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.readerhybrid.HybridConfigManager$getBridgeSupportedHtml$2", f = "HybridConfigManager.kt", l = {41, 45}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HybridConfigManager$getBridgeSupportedHtml$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ ArticleAsset $asset;
    final /* synthetic */ String $html;
    final /* synthetic */ NativeBridge $nativeBridge;
    final /* synthetic */ String $pageViewId;
    final /* synthetic */ WebViewType $webViewType;
    Object L$0;
    int label;
    final /* synthetic */ HybridConfigManager this$0;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WebViewType.values().length];
            try {
                iArr[WebViewType.EMBEDDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebViewType.HYBRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebViewType.WEB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridConfigManager$getBridgeSupportedHtml$2(HybridConfigManager hybridConfigManager, String str, ArticleAsset articleAsset, String str2, WebViewType webViewType, NativeBridge nativeBridge, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = hybridConfigManager;
        this.$pageViewId = str;
        this.$asset = articleAsset;
        this.$html = str2;
        this.$webViewType = webViewType;
        this.$nativeBridge = nativeBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new HybridConfigManager$getBridgeSupportedHtml$2(this.this$0, this.$pageViewId, this.$asset, this.$html, this.$webViewType, this.$nativeBridge, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HybridConfigBuilder hybridConfigBuilder;
        bc3 bc3Var;
        ld3 ld3Var;
        String str;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            hybridConfigBuilder = this.this$0.b;
            String str2 = this.$pageViewId;
            ArticleAsset articleAsset = this.$asset;
            this.label = 1;
            obj = hybridConfigBuilder.b(str2, articleAsset, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                f.b(obj);
                return str + obj;
            }
            f.b(obj);
        }
        bc3Var = this.this$0.a;
        String a2 = bc3Var.a(this.$html, (HybridConfig) obj);
        int i2 = a.a[this.$webViewType.ordinal()];
        if (i2 == 1) {
            return this.$nativeBridge.e(a2);
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return a2;
            }
            throw new NoWhenBranchMatchedException();
        }
        ld3Var = this.this$0.c;
        this.L$0 = a2;
        this.label = 2;
        Object a3 = ld3Var.a(this);
        if (a3 == h) {
            return h;
        }
        obj = a3;
        str = a2;
        return str + obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((HybridConfigManager$getBridgeSupportedHtml$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
