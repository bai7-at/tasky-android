package com.nytimes.android.features.you.youtab;

import com.comscore.streaming.ContentType;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.interests.db.Interest;
import defpackage.ai0;
import defpackage.du8;
import defpackage.e52;
import defpackage.lm9;
import defpackage.qs2;
import defpackage.s42;
import defpackage.u32;
import defpackage.ue4;
import defpackage.y32;
import defpackage.zq3;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class YouEventSender {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final ET2Scope a;

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
            int[] iArr = new int[SortOrder.values().length];
            try {
                iArr[SortOrder.YOUR_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SortOrder.MOST_RECENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public YouEventSender(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
    }

    private final String a(SortOrder sortOrder) {
        int i = b.a[sortOrder.ordinal()];
        if (i == 1) {
            return "your-order";
        }
        if (i == 2) {
            return "recently-updated";
        }
        throw new NoWhenBranchMatchedException();
    }

    public void A(int i) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("topics tap", String.valueOf(i), "step-1-what-to-see-view", null, null, null, null, new y32("interests-hub", null, null, null, null, null, 62, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void B() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("log-in-screen", "log-in-to-access-your-you-tab", "log-in-view", null, null, null, null, null, "you tab", 248, null), null, null, 12, null);
    }

    public void C(int i, String str) {
        zq3.h(str, "interestURL");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("remove interest tap", str, "interest-edit-menu", null, null, null, null, new y32("interests-hub", null, str, "you tab", null, null, 50, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void D(int i, String str) {
        zq3.h(str, "interestURL");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("reorder interests tap", String.valueOf(i), "interest-edit-menu", null, null, null, null, new y32("interests-hub", null, str, "you tab", null, null, 50, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void E() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("reordering interests view", "interests-hub", null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void F() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("save add menu tap", null, "add-interests-view", null, null, null, null, new y32("interests-hub", null, null, "you tab", null, null, 54, null), "you tab", ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void G() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("save reordering tap", null, "reorder-interest-view", null, null, null, null, new y32("interests-hub", null, null, "you tab", null, null, 54, null), "you tab", ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void H() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("hub tap", null, "hub-menu", null, null, null, null, new y32("save-hub", null, null, "you-tab", null, null, 54, null), "you tab", ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void I(int i, String str) {
        zq3.h(str, "interestURL");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("select interest menu tap", String.valueOf(i), "add-interests-view", null, null, null, null, new y32("interests-hub", null, str, "you tab", null, null, 50, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void J() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("app-settings", "app-gear", "top-of-tab", null, null, null, null, new y32("clicked-settings-gear", null, null, "app-settings", null, null, 54, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void K() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("log-in-screen", "log-in-to-access-your-you-tab", "log-in-view", null, null, null, null, new y32("clicked-settings-gear", null, null, "app-settings", null, null, 54, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void L(final Interest.PersonalizedItem personalizedItem, final int i) {
        zq3.h(personalizedItem, "item");
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("shuffle interest", "you tab", null, null, null, null, null, null, "you tab", 252, null), null, new qs2() { // from class: com.nytimes.android.features.you.youtab.YouEventSender$sendShuffleAssetImpression$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ue4 mo865invoke() {
                return new ue4(du8.a("card", new ai0(Interest.PersonalizedItem.this.b().j(), Interest.PersonalizedItem.this.b().k(), i, null, null, 24, null)), du8.a("algos", lm9.a(Interest.PersonalizedItem.this.c())));
            }
        }, 4, null);
    }

    public void M() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("shuffle interest", "you tab", null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void N(SortOrder sortOrder) {
        zq3.h(sortOrder, "sort");
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("interests-sort-by", a(sortOrder), "your-interests", null, null, null, null, null, "you tab", 248, null), null, null, 12, null);
    }

    public void O(SortOrder sortOrder) {
        zq3.h(sortOrder, "sort");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("interests-sort-by", a(sortOrder), "your-interests", null, null, null, null, new y32("tapped-sort-by", null, null, "sort-by-dropdown", null, null, 54, null), "you tab", 120, null), new u32(null, "you tab", null, 5, null), null, 8, null);
    }

    public void P(SortOrder sortOrder, SortOrder sortOrder2) {
        zq3.h(sortOrder, "previousSort");
        zq3.h(sortOrder2, "newSort");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("interests-sort-by", a(sortOrder), "your-interests", null, null, null, null, new y32(a(sortOrder2), null, null, "select-sort-method", null, null, 54, null), "you tab", 120, null), new u32(null, "you tab", null, 5, null), null, 8, null);
    }

    public void Q() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("news interest", "take_past_quizzes", null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void R(int i, String str) {
        zq3.h(str, "interestURL");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("kebab tap", String.valueOf(i), "interests-list", null, null, null, null, new y32("interests-hub", null, str, "you tab", null, null, 50, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void S(int i) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("updated-interest-dot", String.valueOf(i), null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void b() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("add interests view", "interests-hub", null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void c() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("account-webview", "account-name", "top-of-tab", null, null, null, null, new y32("add-your-name", null, null, "add-account-name", null, null, 54, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void d() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("news interest", "begin", null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void e(int i, String str) {
        zq3.h(str, "url");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("asset tap", String.valueOf(i), "column-interest-view", null, null, null, null, new y32("interests-hub", null, str, "begin", null, null, 50, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void f(int i) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("book interest", String.valueOf(i), null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void g(int i) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("column interest", String.valueOf(i), null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void h() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("log-in-screen", "log-in-to-access-your-you-tab", "log-in-view", null, null, null, null, new y32("create-one", null, null, "create-account", null, null, 54, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void i(int i, String str) {
        zq3.h(str, "interestURL");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("deselect interest menu tap", String.valueOf(i), "add-interests-view", null, null, null, null, new y32("interests-hub", null, str, "you tab", null, null, 50, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void j(int i) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("filter interest", String.valueOf(i), null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void k(int i, String str) {
        zq3.h(str, "filterName");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("filter tap", String.valueOf(i), "column-interest-view", null, null, null, null, new y32("interests-hub", null, null, str, null, null, 54, null), "you tab", 120, null), new u32(null, "you tab", null, 5, null), null, 8, null);
    }

    public void l() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("flashback interest", "take_the_quiz", null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void m() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("flashback interest", "take_past_quizzes", null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void n() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("hub tap", null, "hub-menu", null, null, null, null, new y32("rv-hub", null, null, "you-tab", null, null, 54, null), "you tab", ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void o() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("log-in-screen", "log-in-to-access-your-you-tab", "log-in-view", null, null, null, null, new y32("log-in", null, null, "log-in", null, null, 54, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void p() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("account-webview", "account-name", "top-of-tab", null, null, null, null, new y32("account-name", null, null, "account-settings", null, null, 54, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void q(int i) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("newly-added-label", String.valueOf(i), null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void r() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("menu button tap", null, "you-view", null, null, null, null, new y32("interests-hub", null, null, "you tab", null, null, 54, null), "you tab", ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void s() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("dismiss add menu tap", null, "add-interests-view", null, null, null, null, new y32("interests-hub", null, null, "you tab", null, null, 54, null), "you tab", ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void t() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("dismiss reordering menu tap", null, "reorder-interest-view", null, null, null, null, new y32("interests-hub", null, null, "you tab", null, null, 54, null), "you tab", ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void u() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("closes tap", null, "step-1-what-to-see-view", null, null, null, null, new y32("interests-hub", null, null, null, null, null, 62, null), "you tab", ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void v() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("add-interest-tooltip", "interests-hub", null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void w(List list, List list2) {
        zq3.h(list, "selectedInterestsIds");
        zq3.h(list2, "sectionTitles");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("finish tap", list.toString(), "step-2-results-view", null, null, null, null, new y32("interests-hub", null, null, list2.toString(), null, null, 54, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }

    public void x() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("what-to-see-1-view", "interests-hub", null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void y() {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42("results-2-view", "interests-hub", null, null, null, null, null, null, "you tab", 252, null), null, null, 12, null);
    }

    public void z(List list) {
        zq3.h(list, "selectedTopics");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("view results tap", list.toString(), "step-1-what-to-see-view", null, null, null, null, new y32("interests-hub", null, null, null, null, null, 62, null), "you tab", 120, null), new u32(null, "interests hub", null, 5, null), null, 8, null);
    }
}
