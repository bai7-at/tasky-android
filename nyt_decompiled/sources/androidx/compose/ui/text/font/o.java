package androidx.compose.ui.text.font;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.WindowState;
import com.nytimes.android.comments.comments.mvi.ViewingCommentsActivityKt;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class o implements Comparable {
    public static final a b = new a(null);
    private static final o c;
    private static final o d;
    private static final o e;
    private static final o f;
    private static final o g;
    private static final o h;
    private static final o i;
    private static final o j;
    private static final o k;
    private static final o l;
    private static final o m;
    private static final o n;
    private static final o r;
    private static final o s;
    private static final o t;
    private static final o u;
    private static final o w;
    private static final o x;
    private static final List y;
    private final int a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a() {
            return o.u;
        }

        public final o b() {
            return o.w;
        }

        public final o c() {
            return o.m;
        }

        public final o d() {
            return o.n;
        }

        public final o e() {
            return o.s;
        }

        public final o f() {
            return o.r;
        }

        public final o g() {
            return o.t;
        }

        public final o h() {
            return o.e;
        }

        public final o i() {
            return o.f;
        }

        public final o j() {
            return o.g;
        }

        public final o k() {
            return o.h;
        }

        public final o l() {
            return o.i;
        }

        private a() {
        }
    }

    static {
        o oVar = new o(100);
        c = oVar;
        o oVar2 = new o(200);
        d = oVar2;
        o oVar3 = new o(ContentFeedType.OTHER);
        e = oVar3;
        o oVar4 = new o(WindowState.NORMAL);
        f = oVar4;
        o oVar5 = new o(500);
        g = oVar5;
        o oVar6 = new o(600);
        h = oVar6;
        o oVar7 = new o(ViewingCommentsActivityKt.ANIMATION_TRANSITION_DURATION_MILLIS);
        i = oVar7;
        o oVar8 = new o(800);
        j = oVar8;
        o oVar9 = new o(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS);
        k = oVar9;
        l = oVar;
        m = oVar2;
        n = oVar3;
        r = oVar4;
        s = oVar5;
        t = oVar6;
        u = oVar7;
        w = oVar8;
        x = oVar9;
        y = kotlin.collections.i.o(oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9);
    }

    public o(int i2) {
        this.a = i2;
        if (1 > i2 || i2 >= 1001) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i2).toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.a == ((o) obj).a;
    }

    public int hashCode() {
        return this.a;
    }

    @Override // java.lang.Comparable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int compareTo(o oVar) {
        return zq3.j(this.a, oVar.a);
    }

    public final int p() {
        return this.a;
    }

    public String toString() {
        return "FontWeight(weight=" + this.a + ')';
    }
}
