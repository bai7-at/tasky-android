package defpackage;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import com.nytimes.android.ads.sectionfront.SectionFrontAdsViewModel;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.media.util.AudioFileVerifier;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;
import com.nytimes.android.sectionfront.adapter.viewholder.FlexFrameAdViewHolder;
import com.nytimes.android.sectionfront.adapter.viewholder.LedeGridPackageHorizontalImageViewHolder;
import com.nytimes.android.sectionfront.adapter.viewholder.LedeGridPackageVerticalOrNoImageViewHolder;
import com.nytimes.android.sectionfront.adapter.viewholder.b;
import com.nytimes.android.sectionfront.adapter.viewholder.c;
import com.nytimes.android.sectionfront.adapter.viewholder.d;
import com.nytimes.android.sectionfront.adapter.viewholder.e;
import com.nytimes.android.sectionfront.adapter.viewholder.i;
import com.nytimes.android.sectionfront.presenter.FooterBinder;

/* loaded from: classes4.dex */
public final class dx4 extends dh7 {
    private boolean A;
    private final pr q;
    private final FooterBinder r;
    private final RecentlyViewedManager s;
    private final hb5 t;
    private final yi7 u;
    private final pr v;
    private final com.nytimes.android.media.common.a w;
    private final AudioFileVerifier x;
    private final FeedStore y;
    private final mi4 z;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SectionAdapterItemType.values().length];
            try {
                iArr[SectionAdapterItemType.PHOTOSPOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SectionAdapterItemType.ARTICLE_LEDE_HORIZONTAL_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SectionAdapterItemType.ARTICLE_LEDE_VERTICAL_OR_NO_IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SectionAdapterItemType.ARTICLE_LEDE_PACKAGE_HORIZONTAL_IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SectionAdapterItemType.ARTICLE_LEDE_PACKAGE_VERTICAL_OR_NO_IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SectionAdapterItemType.DAILY_BRIEFING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SectionAdapterItemType.SAVED_GET_MORE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SectionAdapterItemType.VIDEO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SectionAdapterItemType.ARTICLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SectionAdapterItemType.FLEX_FRAME_AD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SectionAdapterItemType.AUDIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dx4(android.app.Activity r19, com.nytimes.android.utils.NetworkStatus r20, defpackage.cb2 r21, defpackage.pr r22, com.nytimes.android.sectionfront.presenter.FooterBinder r23, com.nytimes.android.recentlyviewed.RecentlyViewedManager r24, defpackage.hb5 r25, defpackage.yi7 r26, defpackage.pr r27, com.nytimes.android.media.common.a r28, com.nytimes.android.media.util.AudioFileVerifier r29, com.nytimes.android.latestfeed.feed.FeedStore r30, defpackage.mi4 r31, boolean r32, androidx.fragment.app.Fragment r33) {
        /*
            r18 = this;
            r7 = r18
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            r6 = r30
            r5 = r31
            java.lang.String r0 = "activity"
            r1 = r19
            defpackage.zq3.h(r1, r0)
            java.lang.String r0 = "networkStatus"
            r2 = r20
            defpackage.zq3.h(r2, r0)
            java.lang.String r0 = "featureFlagUtil"
            r4 = r21
            defpackage.zq3.h(r4, r0)
            java.lang.String r0 = "articleSummaryBinder"
            defpackage.zq3.h(r8, r0)
            java.lang.String r0 = "footerBinder"
            defpackage.zq3.h(r9, r0)
            java.lang.String r0 = "recentlyViewedManager"
            defpackage.zq3.h(r10, r0)
            java.lang.String r0 = "mediaControl"
            defpackage.zq3.h(r11, r0)
            java.lang.String r0 = "selectionManager"
            defpackage.zq3.h(r12, r0)
            java.lang.String r0 = "summaryBinder"
            defpackage.zq3.h(r13, r0)
            java.lang.String r0 = "assetToMediaItem"
            defpackage.zq3.h(r14, r0)
            java.lang.String r0 = "audioVerifier"
            defpackage.zq3.h(r15, r0)
            java.lang.String r0 = "feedStore"
            defpackage.zq3.h(r6, r0)
            java.lang.String r0 = "factory"
            defpackage.zq3.h(r5, r0)
            java.lang.String r0 = "fragment"
            r3 = r33
            defpackage.zq3.h(r3, r0)
            qf7 r16 = new qf7
            r16.<init>()
            android.view.LayoutInflater r3 = r33.getLayoutInflater()
            java.lang.String r0 = "getLayoutInflater(...)"
            defpackage.zq3.g(r3, r0)
            r0 = r18
            r17 = r3
            r3 = r16
            r5 = r32
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.q = r8
            r7.r = r9
            r7.s = r10
            r7.t = r11
            r7.u = r12
            r7.v = r13
            r7.w = r14
            r7.x = r15
            r0 = r30
            r7.y = r0
            r0 = r31
            r7.z = r0
            r0 = 1
            r7.I(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx4.<init>(android.app.Activity, com.nytimes.android.utils.NetworkStatus, cb2, pr, com.nytimes.android.sectionfront.presenter.FooterBinder, com.nytimes.android.recentlyviewed.RecentlyViewedManager, hb5, yi7, pr, com.nytimes.android.media.common.a, com.nytimes.android.media.util.AudioFileVerifier, com.nytimes.android.latestfeed.feed.FeedStore, mi4, boolean, androidx.fragment.app.Fragment):void");
    }

    private final b h0(ViewGroup viewGroup) {
        return new b(O().inflate(hi6.row_section_front, viewGroup, false), this.u, this.s, this.r, this.q);
    }

    private final d i0(ViewGroup viewGroup) {
        return new d(O().inflate(hi6.row_section_front_photospot, viewGroup, false), L(), this.A, this.q, this.r, Q(), this.s, this.t, this.y, this.z);
    }

    private final LedeGridPackageHorizontalImageViewHolder k0(ViewGroup viewGroup) {
        return new LedeGridPackageHorizontalImageViewHolder(O().inflate(hi6.row_section_front_pkg_lede_horizontal, viewGroup, false), L(), this.q, this.r, Q(), this.s, this.t, this.y, this.z);
    }

    private final LedeGridPackageVerticalOrNoImageViewHolder l0(ViewGroup viewGroup) {
        return new LedeGridPackageVerticalOrNoImageViewHolder(O().inflate(hi6.row_section_front_pkg_lede_vertical, viewGroup, false), L(), this.u, this.s, this.r, this.q);
    }

    private final e m0(ViewGroup viewGroup) {
        return new e(O().inflate(hi6.row_section_front_lede_image, viewGroup, false), L(), this.q, this.r, Q(), this.s, this.t, this.y, this.z);
    }

    private final c24 n0(ViewGroup viewGroup) {
        return new c24(O().inflate(hi6.row_section_front, viewGroup, false), this.u, this.s, this.r, this.q);
    }

    private final i p0(ViewGroup viewGroup) {
        return new i(O().inflate(hi6.sf_audio_view_holder, viewGroup, false), this.r, this.v, this.w, this.x, this.s);
    }

    public final void j0(qf7 qf7Var, SectionFrontAdsViewModel sectionFrontAdsViewModel, s57 s57Var, boolean z) {
        zq3.h(qf7Var, "config");
        zq3.h(sectionFrontAdsViewModel, "viewModel");
        zq3.h(s57Var, "scrollStateListener");
        g0(qf7Var);
        Z(sectionFrontAdsViewModel);
        this.f = s57Var;
        this.A = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public com.nytimes.android.sectionfront.adapter.viewholder.a B(ViewGroup viewGroup, int i) {
        com.nytimes.android.sectionfront.adapter.viewholder.a i0;
        zq3.h(viewGroup, "viewGroup");
        Configuration configuration = null;
        switch (a.a[SectionAdapterItemType.values()[i].ordinal()]) {
            case 1:
                i0 = i0(viewGroup);
                break;
            case 2:
                i0 = m0(viewGroup);
                break;
            case 3:
                i0 = n0(viewGroup);
                break;
            case 4:
                i0 = k0(viewGroup);
                break;
            case 5:
                i0 = l0(viewGroup);
                break;
            case 6:
                i0 = new c(O().inflate(hi6.row_section_front_daily_briefing, viewGroup, false), L(), this.s, this.r);
                break;
            case 7:
                i0 = new q97(O().inflate(hi6.row_saved_get_more, viewGroup, false));
                break;
            case 8:
            case 9:
                i0 = h0(viewGroup);
                break;
            case 10:
                configuration = N();
                View inflate = O().inflate(hi6.row_tablet_section_front_flexframe_advertisement, viewGroup, false);
                zq3.g(inflate, "inflate(...)");
                i0 = new FlexFrameAdViewHolder(inflate, M());
                break;
            case 11:
                i0 = p0(viewGroup);
                break;
            default:
                i0 = new p73(O().inflate(hi6.row_section_blank_header, viewGroup, false));
                break;
        }
        i0.a.setLayoutParams(e0(i));
        Y(configuration);
        return i0;
    }
}
