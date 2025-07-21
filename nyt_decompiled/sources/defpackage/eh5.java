package defpackage;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import com.nytimes.android.ads.sectionfront.SectionFrontAdsViewModel;
import com.nytimes.android.bestsellers.BookCategoryRepository;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.media.util.AudioFileVerifier;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;
import com.nytimes.android.sectionfront.adapter.viewholder.FlexFrameAdViewHolder;
import com.nytimes.android.sectionfront.adapter.viewholder.LedePhonePackageVerticalOrNoImageViewHolder;
import com.nytimes.android.sectionfront.adapter.viewholder.b;
import com.nytimes.android.sectionfront.adapter.viewholder.c;
import com.nytimes.android.sectionfront.adapter.viewholder.e;
import com.nytimes.android.sectionfront.adapter.viewholder.g;
import com.nytimes.android.sectionfront.adapter.viewholder.h;
import com.nytimes.android.sectionfront.adapter.viewholder.i;
import com.nytimes.android.sectionfront.presenter.FooterBinder;

/* loaded from: classes4.dex */
public final class eh5 extends gf7 {
    private final pr o;
    private final FooterBinder p;
    private final RecentlyViewedManager q;
    private final hb5 r;
    private final yi7 s;
    private final pr t;
    private final com.nytimes.android.media.common.a u;
    private final AudioFileVerifier v;
    private final BookCategoryRepository w;
    private final FeedStore x;
    private final mi4 y;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SectionAdapterItemType.values().length];
            try {
                iArr[SectionAdapterItemType.ARTICLE_LEDE_HORIZONTAL_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SectionAdapterItemType.ARTICLE_LEDE_VERTICAL_OR_NO_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SectionAdapterItemType.ARTICLE_LEDE_PACKAGE_HORIZONTAL_IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SectionAdapterItemType.ARTICLE_LEDE_PACKAGE_VERTICAL_OR_NO_IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SectionAdapterItemType.DAILY_BRIEFING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SectionAdapterItemType.PHOTOSPOT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SectionAdapterItemType.ARTICLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SectionAdapterItemType.SAVED_GET_MORE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SectionAdapterItemType.BEST_SELLERS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SectionAdapterItemType.VIDEO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SectionAdapterItemType.VIDEO_LEDE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SectionAdapterItemType.AUDIO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SectionAdapterItemType.FLEX_FRAME_AD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public eh5(android.app.Activity r19, com.nytimes.android.utils.NetworkStatus r20, defpackage.cb2 r21, defpackage.pr r22, com.nytimes.android.sectionfront.presenter.FooterBinder r23, com.nytimes.android.recentlyviewed.RecentlyViewedManager r24, defpackage.hb5 r25, defpackage.yi7 r26, defpackage.pr r27, com.nytimes.android.media.common.a r28, com.nytimes.android.media.util.AudioFileVerifier r29, com.nytimes.android.bestsellers.BookCategoryRepository r30, com.nytimes.android.latestfeed.feed.FeedStore r31, defpackage.mi4 r32, androidx.fragment.app.Fragment r33) {
        /*
            r18 = this;
            r6 = r18
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r5 = r31
            r4 = r32
            java.lang.String r0 = "activity"
            r1 = r19
            defpackage.zq3.h(r1, r0)
            java.lang.String r0 = "networkStatus"
            r2 = r20
            defpackage.zq3.h(r2, r0)
            java.lang.String r0 = "featureFlagUtil"
            r3 = r21
            defpackage.zq3.h(r3, r0)
            java.lang.String r0 = "articleSummaryBinder"
            defpackage.zq3.h(r7, r0)
            java.lang.String r0 = "footerBinder"
            defpackage.zq3.h(r8, r0)
            java.lang.String r0 = "recentlyViewedManager"
            defpackage.zq3.h(r9, r0)
            java.lang.String r0 = "mediaControl"
            defpackage.zq3.h(r10, r0)
            java.lang.String r0 = "selectionManager"
            defpackage.zq3.h(r11, r0)
            java.lang.String r0 = "summaryBinder"
            defpackage.zq3.h(r12, r0)
            java.lang.String r0 = "assetToMediaItem"
            defpackage.zq3.h(r13, r0)
            java.lang.String r0 = "audioVerifier"
            defpackage.zq3.h(r14, r0)
            java.lang.String r0 = "bookStore"
            defpackage.zq3.h(r15, r0)
            java.lang.String r0 = "feedStore"
            defpackage.zq3.h(r5, r0)
            java.lang.String r0 = "factory"
            defpackage.zq3.h(r4, r0)
            java.lang.String r0 = "fragment"
            r1 = r33
            defpackage.zq3.h(r1, r0)
            android.view.LayoutInflater r1 = r33.getLayoutInflater()
            java.lang.String r0 = "getLayoutInflater(...)"
            defpackage.zq3.g(r1, r0)
            r16 = 0
            r0 = r18
            r17 = r1
            r1 = r19
            r3 = r16
            r4 = r21
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r6.o = r7
            r6.p = r8
            r6.q = r9
            r6.r = r10
            r6.s = r11
            r6.t = r12
            r6.u = r13
            r6.v = r14
            r6.w = r15
            r0 = r31
            r6.x = r0
            r0 = r32
            r6.y = r0
            r0 = 1
            r6.I(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh5.<init>(android.app.Activity, com.nytimes.android.utils.NetworkStatus, cb2, pr, com.nytimes.android.sectionfront.presenter.FooterBinder, com.nytimes.android.recentlyviewed.RecentlyViewedManager, hb5, yi7, pr, com.nytimes.android.media.common.a, com.nytimes.android.media.util.AudioFileVerifier, com.nytimes.android.bestsellers.BookCategoryRepository, com.nytimes.android.latestfeed.feed.FeedStore, mi4, androidx.fragment.app.Fragment):void");
    }

    private final b e0(ViewGroup viewGroup) {
        return new b(O().inflate(hi6.row_section_front, viewGroup, false), this.s, this.q, this.p, this.o);
    }

    private final com.nytimes.android.sectionfront.adapter.viewholder.a f0(ViewGroup viewGroup, int i) {
        com.nytimes.android.sectionfront.adapter.viewholder.a p73Var;
        Configuration configuration;
        if (a.a[SectionAdapterItemType.values()[i].ordinal()] == 13) {
            configuration = N();
            View inflate = O().inflate(hi6.row_section_front_flexframe_advertisement, viewGroup, false);
            zq3.g(inflate, "inflate(...)");
            p73Var = new FlexFrameAdViewHolder(inflate, M());
        } else {
            p73Var = new p73(O().inflate(hi6.row_section_blank_header, viewGroup, false));
            configuration = null;
        }
        Y(configuration);
        return p73Var;
    }

    private final c g0(ViewGroup viewGroup) {
        return new c(O().inflate(hi6.row_section_front_daily_briefing, viewGroup, false), L(), this.q, this.p);
    }

    private final e i0(ViewGroup viewGroup) {
        return new e(O().inflate(hi6.row_section_front_lede_image, viewGroup, false), L(), this.o, this.p, Q(), this.q, this.r, this.x, this.y);
    }

    private final g j0(ViewGroup viewGroup) {
        return new g(O().inflate(hi6.row_section_front_pkg_lede_horizontal, viewGroup, false), L(), this.o, this.p, Q(), this.q, this.r, this.x, this.y);
    }

    private final LedePhonePackageVerticalOrNoImageViewHolder k0(ViewGroup viewGroup) {
        return new LedePhonePackageVerticalOrNoImageViewHolder(O().inflate(hi6.row_section_front_lede_vertical_image, viewGroup, false), this.s, this.q, this.p, this.o);
    }

    private final c24 l0(ViewGroup viewGroup) {
        return new c24(O().inflate(hi6.row_section_front, viewGroup, false), this.s, this.q, this.p, this.o);
    }

    private final i n0(ViewGroup viewGroup) {
        return new i(O().inflate(hi6.sf_audio_view_holder, viewGroup, false), this.p, this.t, this.u, this.v, this.q);
    }

    private final h o0(View view) {
        return new h(view, this.t, this.q, this.r, this.x, this.y);
    }

    @Override // defpackage.gf7, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: T */
    public void z(com.nytimes.android.sectionfront.adapter.viewholder.a aVar, int i) {
        zq3.h(aVar, "viewHolder");
        if (aVar instanceof sa0) {
            ((sa0) aVar).j0();
        } else {
            super.z(aVar, i);
        }
    }

    public final void h0(SectionFrontAdsViewModel sectionFrontAdsViewModel, s57 s57Var) {
        zq3.h(sectionFrontAdsViewModel, "viewModel");
        Z(sectionFrontAdsViewModel);
        this.f = s57Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public com.nytimes.android.sectionfront.adapter.viewholder.a B(ViewGroup viewGroup, int i) {
        com.nytimes.android.sectionfront.adapter.viewholder.a q97Var;
        zq3.h(viewGroup, "viewGroup");
        switch (a.a[SectionAdapterItemType.values()[i].ordinal()]) {
            case 1:
                return i0(viewGroup);
            case 2:
                return l0(viewGroup);
            case 3:
                return j0(viewGroup);
            case 4:
                return k0(viewGroup);
            case 5:
                return g0(viewGroup);
            case 6:
            case 7:
                return e0(viewGroup);
            case 8:
                q97Var = new q97(O().inflate(hi6.row_saved_get_more_buttonless, viewGroup, false));
                break;
            case 9:
                q97Var = new sa0(O().inflate(hi6.books_button_sf, viewGroup, false), this.w);
                break;
            case 10:
            case 11:
                return o0(O().inflate(hi6.sf_video_view_holder, viewGroup, false));
            case 12:
                return n0(viewGroup);
            default:
                return f0(viewGroup, i);
        }
        return q97Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int o(int i) {
        re7 P = P(i);
        zq3.e(P);
        return P.a.ordinal();
    }
}
