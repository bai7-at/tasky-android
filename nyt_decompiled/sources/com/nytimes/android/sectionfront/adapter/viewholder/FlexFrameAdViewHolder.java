package com.nytimes.android.sectionfront.adapter.viewholder;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import androidx.compose.ui.platform.ComposeView;
import com.nytimes.android.ads.sectionfront.SectionFrontAdsViewModel;
import com.nytimes.android.ads.ui.compose.AdWrapperUiKt;
import defpackage.d8;
import defpackage.gt2;
import defpackage.nk2;
import defpackage.pg6;
import defpackage.re7;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zr0;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class FlexFrameAdViewHolder extends a {
    private final SectionFrontAdsViewModel L;
    private final ComposeView M;
    private int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexFrameAdViewHolder(View view, SectionFrontAdsViewModel sectionFrontAdsViewModel) {
        super(view);
        zq3.h(view, "itemView");
        this.L = sectionFrontAdsViewModel;
        View findViewById = view.findViewById(pg6.sectionFront_inlineAd_rootView);
        zq3.g(findViewById, "findViewById(...)");
        this.M = (ComposeView) findViewById;
        this.N = -1;
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    protected void W(re7 re7Var) {
        final Flow j;
        zq3.h(re7Var, "sectionAdapterItem");
        if (re7Var instanceof nk2) {
            int n = ((nk2) re7Var).n();
            this.N = n;
            SectionFrontAdsViewModel sectionFrontAdsViewModel = this.L;
            if (sectionFrontAdsViewModel == null || (j = sectionFrontAdsViewModel.j(n)) == null) {
                return;
            }
            this.M.setContent(zr0.c(-437415152, true, new gt2() { // from class: com.nytimes.android.sectionfront.adapter.viewholder.FlexFrameAdViewHolder$bindItem$1$1
                {
                    super(2);
                }

                private static final d8 b(x08 x08Var) {
                    return (d8) x08Var.getValue();
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 11) == 2 && composer.i()) {
                        composer.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(-437415152, i, -1, "com.nytimes.android.sectionfront.adapter.viewholder.FlexFrameAdViewHolder.bindItem.<anonymous>.<anonymous> (FlexFrameAdViewHolder.kt:29)");
                    }
                    AdWrapperUiKt.f(b(y.a(Flow.this, d8.b.b, null, composer, (d8.b.c << 3) | 8, 2)), null, false, false, composer, d8.a, 14);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }));
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void d0() {
        this.M.f();
    }
}
