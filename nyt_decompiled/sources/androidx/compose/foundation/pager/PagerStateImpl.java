package androidx.compose.foundation.pager;

import androidx.compose.runtime.b0;
import androidx.compose.runtime.saveable.ListSaverKt;
import defpackage.ea7;
import defpackage.fa7;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class PagerStateImpl extends PagerState {
    public static final a I = new a(null);
    private static final ea7 J = ListSaverKt.a(new gt2() { // from class: androidx.compose.foundation.pager.PagerStateImpl$Companion$Saver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(fa7 fa7Var, PagerStateImpl pagerStateImpl) {
            return i.o(Integer.valueOf(pagerStateImpl.w()), Float.valueOf(pagerStateImpl.x()), Integer.valueOf(pagerStateImpl.E()));
        }
    }, new ss2() { // from class: androidx.compose.foundation.pager.PagerStateImpl$Companion$Saver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PagerStateImpl invoke(final List list) {
            Object obj = list.get(0);
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            zq3.f(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new PagerStateImpl(intValue, ((Float) obj2).floatValue(), new qs2() { // from class: androidx.compose.foundation.pager.PagerStateImpl$Companion$Saver$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Integer mo865invoke() {
                    Object obj3 = list.get(2);
                    zq3.f(obj3, "null cannot be cast to non-null type kotlin.Int");
                    return (Integer) obj3;
                }
            });
        }
    });
    private sy4 H;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ea7 a() {
            return PagerStateImpl.J;
        }

        private a() {
        }
    }

    public PagerStateImpl(int i, float f, qs2 qs2Var) {
        super(i, f);
        this.H = b0.e(qs2Var, null, 2, null);
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public int E() {
        return ((Number) ((qs2) this.H.getValue()).mo865invoke()).intValue();
    }

    public final sy4 q0() {
        return this.H;
    }
}
