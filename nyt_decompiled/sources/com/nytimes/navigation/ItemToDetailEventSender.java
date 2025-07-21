package com.nytimes.navigation;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.navigation.NavigationSource;
import defpackage.ai0;
import defpackage.du8;
import defpackage.e52;
import defpackage.qs2;
import defpackage.s42;
import defpackage.u32;
import defpackage.ue4;
import defpackage.y25;
import defpackage.y32;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class ItemToDetailEventSender {
    private final ET2Scope a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[NavigationSource.values().length];
            try {
                iArr[NavigationSource.FOLLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationSource.SECTION_FRONT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigationSource.SAVED_SECTION_FRONT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NavigationSource.SAVED_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_SAVES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_RECENTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NavigationSource.GIFT_HUB.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_SHUFFLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_COLUMN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[NavigationSource.XPN_PANEL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[NavigationSource.XPN_CTA.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_NEWSQUIZ.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_FLASHBACK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_FILTER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[NavigationSource.YOU_TAB_BOOKS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            a = iArr;
        }
    }

    public ItemToDetailEventSender(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
    }

    private final void b(y25 y25Var, String str, String str2, String str3, String str4, qs2 qs2Var) {
        ET2Scope eT2Scope = this.a;
        e52.e eVar = new e52.e();
        String f = y25Var.f();
        String g = y25Var.g();
        eT2Scope.a(eVar, new s42(str3, y25Var.i(), str2, null, null, null, null, new y32(f, y25Var.p(), y25Var.q(), g, y25Var.d(), null, 32, null), y25Var.h(), 120, null), new u32(null, str, str4, 1, null), qs2Var);
    }

    static /* synthetic */ void c(ItemToDetailEventSender itemToDetailEventSender, y25 y25Var, String str, String str2, String str3, String str4, qs2 qs2Var, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = "asset tap";
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = "tap";
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            qs2Var = new qs2() { // from class: com.nytimes.navigation.ItemToDetailEventSender$sendTapAssetEvent$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Void mo865invoke() {
                    return null;
                }
            };
        }
        itemToDetailEventSender.b(y25Var, str, str5, str6, str7, qs2Var);
    }

    public final void a(final y25 y25Var) {
        zq3.h(y25Var, "item");
        switch (a.a[y25Var.n().ordinal()]) {
            case 1:
                c(this, y25Var, "for you", null, null, null, new qs2() { // from class: com.nytimes.navigation.ItemToDetailEventSender$sendArticleEvents$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ue4 mo865invoke() {
                        return new ue4(du8.a("algos", y25.this.a()));
                    }
                }, 28, null);
                break;
            case 2:
            case 3:
                c(this, y25Var, "section front", null, null, null, null, 60, null);
                break;
            case 4:
                c(this, y25Var, "about", null, null, null, null, 60, null);
                break;
            case 5:
                c(this, y25Var, "saves hub", "card-list", null, null, null, 56, null);
                break;
            case 6:
                c(this, y25Var, "RV hub", "card-list", null, null, null, 56, null);
                break;
            case 7:
                b(y25Var, "gift hub", "gift-hub", "gift-hub-article", "url-click", new qs2() { // from class: com.nytimes.navigation.ItemToDetailEventSender$sendArticleEvents$2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ue4 mo865invoke() {
                        return new ue4(du8.a("item", new y32(null, y25.this.p(), y25.this.q(), null, null, null, 57, null)));
                    }
                });
                break;
            case 8:
                c(this, y25Var, "interests hub", "shuffle-interest-view", "asset tap", null, new qs2() { // from class: com.nytimes.navigation.ItemToDetailEventSender$sendArticleEvents$3
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ue4 mo865invoke() {
                        String p = y25.this.p();
                        String q = y25.this.q();
                        Integer k = y25.this.k();
                        return new ue4(du8.a("card", new ai0(p, q, k != null ? k.intValue() : 0, null, null, 24, null)), du8.a("algos", y25.this.a()));
                    }
                }, 16, null);
                break;
            case 9:
                c(this, y25Var, "interests hub", "column-interest-view", "asset tap", null, new qs2() { // from class: com.nytimes.navigation.ItemToDetailEventSender$sendArticleEvents$4
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ue4 mo865invoke() {
                        return new ue4(du8.a("item", new y32(null, y25.this.p(), y25.this.q(), null, null, null, 57, null)));
                    }
                }, 16, null);
                break;
            case 10:
                String h = y25Var.h();
                c(this, y25Var, h != null ? h : "xpn panel", null, null, null, new qs2() { // from class: com.nytimes.navigation.ItemToDetailEventSender$sendArticleEvents$5
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ue4 mo865invoke() {
                        return new ue4(du8.a("block", y25.this.b()), du8.a("algos", y25.this.a()), du8.a("card", y25.this.c()));
                    }
                }, 28, null);
                break;
            case 11:
                String h2 = y25Var.h();
                String str = h2 != null ? h2 : "xpn panel";
                String j = y25Var.j();
                zq3.e(j);
                c(this, y25Var, str, null, j, null, new qs2() { // from class: com.nytimes.navigation.ItemToDetailEventSender$sendArticleEvents$6
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ue4 mo865invoke() {
                        return new ue4(du8.a("block", y25.this.b()));
                    }
                }, 20, null);
                break;
            case 12:
            case 13:
                c(this, y25Var, "interests hub", "column-interest-view", "asset tap", null, null, 48, null);
                break;
            case 14:
                c(this, y25Var, "you tab", "column-interest-view", "asset tap", null, null, 48, null);
                break;
            case 15:
                c(this, y25Var, "interests hub", "column-interest-view", "asset tap", null, null, 48, null);
                break;
        }
    }
}
