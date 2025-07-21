package androidx.compose.ui.semantics;

import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import defpackage.gt2;
import defpackage.jj7;
import defpackage.n27;
import defpackage.ww8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class SemanticsProperties {
    public static final SemanticsProperties a = new SemanticsProperties();
    private static final SemanticsPropertyKey b = jj7.b("ContentDescription", new gt2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List list2) {
            List a1;
            if (list == null || (a1 = i.a1(list)) == null) {
                return list2;
            }
            a1.addAll(list2);
            return a1;
        }
    });
    private static final SemanticsPropertyKey c = jj7.a("StateDescription");
    private static final SemanticsPropertyKey d = jj7.a("ProgressBarRangeInfo");
    private static final SemanticsPropertyKey e = jj7.b("PaneTitle", new gt2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });
    private static final SemanticsPropertyKey f = jj7.a("SelectableGroup");
    private static final SemanticsPropertyKey g = jj7.a("CollectionInfo");
    private static final SemanticsPropertyKey h = jj7.a("CollectionItemInfo");
    private static final SemanticsPropertyKey i = jj7.a("Heading");
    private static final SemanticsPropertyKey j = jj7.a(BucketLifecycleConfiguration.DISABLED);
    private static final SemanticsPropertyKey k = jj7.a("LiveRegion");
    private static final SemanticsPropertyKey l = jj7.a("Focused");
    private static final SemanticsPropertyKey m = jj7.a("IsTraversalGroup");
    private static final SemanticsPropertyKey n = new SemanticsPropertyKey("InvisibleToUser", new gt2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ww8 invoke(ww8 ww8Var, ww8 ww8Var2) {
            return ww8Var;
        }
    });
    private static final SemanticsPropertyKey o = jj7.b("TraversalIndex", new gt2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        public final Float b(Float f2, float f3) {
            return f2;
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((Float) obj, ((Number) obj2).floatValue());
        }
    });
    private static final SemanticsPropertyKey p = jj7.a("HorizontalScrollAxisRange");
    private static final SemanticsPropertyKey q = jj7.a("VerticalScrollAxisRange");
    private static final SemanticsPropertyKey r = jj7.b("IsPopup", new gt2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ww8 invoke(ww8 ww8Var, ww8 ww8Var2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });
    private static final SemanticsPropertyKey s = jj7.b("IsDialog", new gt2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ww8 invoke(ww8 ww8Var, ww8 ww8Var2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });
    private static final SemanticsPropertyKey t = jj7.b("Role", new gt2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        public final n27 b(n27 n27Var, int i2) {
            return n27Var;
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((n27) obj, ((n27) obj2).n());
        }
    });
    private static final SemanticsPropertyKey u = new SemanticsPropertyKey("TestTag", false, new gt2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    });
    private static final SemanticsPropertyKey v = jj7.b("Text", new gt2() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List list2) {
            List a1;
            if (list == null || (a1 = i.a1(list)) == null) {
                return list2;
            }
            a1.addAll(list2);
            return a1;
        }
    });
    private static final SemanticsPropertyKey w = new SemanticsPropertyKey("TextSubstitution", null, 2, null);
    private static final SemanticsPropertyKey x = new SemanticsPropertyKey("IsShowingTextSubstitution", null, 2, null);
    private static final SemanticsPropertyKey y = jj7.a("EditableText");
    private static final SemanticsPropertyKey z = jj7.a("TextSelectionRange");
    private static final SemanticsPropertyKey A = jj7.a("ImeAction");
    private static final SemanticsPropertyKey B = jj7.a("Selected");
    private static final SemanticsPropertyKey C = jj7.a("ToggleableState");
    private static final SemanticsPropertyKey D = jj7.a("Password");
    private static final SemanticsPropertyKey E = jj7.a("Error");
    private static final SemanticsPropertyKey F = new SemanticsPropertyKey("IndexForKey", null, 2, null);
    public static final int G = 8;

    private SemanticsProperties() {
    }

    public final SemanticsPropertyKey A() {
        return z;
    }

    public final SemanticsPropertyKey B() {
        return w;
    }

    public final SemanticsPropertyKey C() {
        return C;
    }

    public final SemanticsPropertyKey D() {
        return o;
    }

    public final SemanticsPropertyKey E() {
        return q;
    }

    public final SemanticsPropertyKey a() {
        return g;
    }

    public final SemanticsPropertyKey b() {
        return h;
    }

    public final SemanticsPropertyKey c() {
        return b;
    }

    public final SemanticsPropertyKey d() {
        return j;
    }

    public final SemanticsPropertyKey e() {
        return y;
    }

    public final SemanticsPropertyKey f() {
        return E;
    }

    public final SemanticsPropertyKey g() {
        return l;
    }

    public final SemanticsPropertyKey h() {
        return i;
    }

    public final SemanticsPropertyKey i() {
        return p;
    }

    public final SemanticsPropertyKey j() {
        return A;
    }

    public final SemanticsPropertyKey k() {
        return F;
    }

    public final SemanticsPropertyKey l() {
        return n;
    }

    public final SemanticsPropertyKey m() {
        return s;
    }

    public final SemanticsPropertyKey n() {
        return r;
    }

    public final SemanticsPropertyKey o() {
        return x;
    }

    public final SemanticsPropertyKey p() {
        return m;
    }

    public final SemanticsPropertyKey q() {
        return k;
    }

    public final SemanticsPropertyKey r() {
        return e;
    }

    public final SemanticsPropertyKey s() {
        return D;
    }

    public final SemanticsPropertyKey t() {
        return d;
    }

    public final SemanticsPropertyKey u() {
        return t;
    }

    public final SemanticsPropertyKey v() {
        return f;
    }

    public final SemanticsPropertyKey w() {
        return B;
    }

    public final SemanticsPropertyKey x() {
        return c;
    }

    public final SemanticsPropertyKey y() {
        return u;
    }

    public final SemanticsPropertyKey z() {
        return v;
    }
}
