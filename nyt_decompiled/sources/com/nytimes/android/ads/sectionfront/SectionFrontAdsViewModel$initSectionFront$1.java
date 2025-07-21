package com.nytimes.android.ads.sectionfront;

import androidx.lifecycle.r;
import com.nytimes.android.ads.AdConfig;
import com.nytimes.android.ads.models.CommonAdKeys;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.by0;
import defpackage.du8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.r57;
import defpackage.s55;
import defpackage.ss2;
import defpackage.tx1;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.Locale;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.ads.sectionfront.SectionFrontAdsViewModel$initSectionFront$1", f = "SectionFrontAdsViewModel.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SectionFrontAdsViewModel$initSectionFront$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $sectionFrontName;
    int label;
    final /* synthetic */ SectionFrontAdsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SectionFrontAdsViewModel$initSectionFront$1(SectionFrontAdsViewModel sectionFrontAdsViewModel, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = sectionFrontAdsViewModel;
        this.$sectionFrontName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ss2 ss2Var, Object obj) {
        ss2Var.invoke(obj);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SectionFrontAdsViewModel$initSectionFront$1(this.this$0, this.$sectionFrontName, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ET2Scope eT2Scope;
        r57 r57Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            eT2Scope = this.this$0.b;
            s55.l lVar = new s55.l(this.$sectionFrontName);
            this.label = 1;
            if (eT2Scope.g(lVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        r57Var = this.this$0.c;
        Observable f = r57Var.f(this.$sectionFrontName);
        final SectionFrontAdsViewModel sectionFrontAdsViewModel = this.this$0;
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.ads.sectionfront.SectionFrontAdsViewModel$initSectionFront$1.1
            {
                super(1);
            }

            public final void b(SectionFront sectionFront) {
                AdConfig adConfig;
                AdConfig adConfig2;
                ET2Scope eT2Scope2;
                String str;
                PageContext i2;
                StringBuilder sb = new StringBuilder();
                String sectionName = sectionFront.getSectionName();
                if (sectionName != null) {
                    sb.append("/" + sectionName);
                }
                String subsectionName = sectionFront.getSubsectionName();
                if (subsectionName != null) {
                    sb.append("/" + subsectionName);
                }
                sb.append("/sectionfront");
                adConfig = SectionFrontAdsViewModel.this.e;
                String sb2 = sb.toString();
                zq3.g(sb2, "toString(...)");
                String lowerCase = sb2.toLowerCase(Locale.ROOT);
                zq3.g(lowerCase, "toLowerCase(...)");
                adConfig.a(lowerCase);
                adConfig2 = SectionFrontAdsViewModel.this.e;
                String key = CommonAdKeys.PAGE_VIEW_ID.getKey();
                eT2Scope2 = SectionFrontAdsViewModel.this.b;
                tx1 c = eT2Scope2.c();
                if (c == null || (i2 = c.i()) == null || (str = i2.g()) == null) {
                    str = "";
                }
                adConfig2.c(t.n(du8.a(key, str)));
                String uri = sectionFront.getUri();
                if (uri == null) {
                    uri = sectionFront.getQueryId();
                }
                if (uri != null) {
                    SectionFrontAdsViewModel sectionFrontAdsViewModel2 = SectionFrontAdsViewModel.this;
                    BuildersKt__Builders_commonKt.launch$default(r.a(sectionFrontAdsViewModel2), null, null, new SectionFrontAdsViewModel$initSectionFront$1$1$3$1(sectionFrontAdsViewModel2, uri, null), 3, null);
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                b((SectionFront) obj2);
                return ww8.a;
            }
        };
        f.subscribe(new Consumer() { // from class: com.nytimes.android.ads.sectionfront.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                SectionFrontAdsViewModel$initSectionFront$1.c(ss2.this, obj2);
            }
        });
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SectionFrontAdsViewModel$initSectionFront$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
