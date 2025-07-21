package kotlin.sequences;

import defpackage.ak7;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.xu0;
import defpackage.zq3;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class SequencesKt__SequencesKt extends f {

    public static final class a implements ak7 {
        final /* synthetic */ Iterator a;

        public a(Iterator it2) {
            this.a = it2;
        }

        @Override // defpackage.ak7
        public Iterator iterator() {
            return this.a;
        }
    }

    public static ak7 c(Iterator it2) {
        zq3.h(it2, "<this>");
        return d.d(new a(it2));
    }

    public static ak7 d(ak7 ak7Var) {
        zq3.h(ak7Var, "<this>");
        return ak7Var instanceof xu0 ? ak7Var : new xu0(ak7Var);
    }

    public static ak7 e() {
        return kotlin.sequences.a.a;
    }

    public static ak7 f(final Object obj, ss2 ss2Var) {
        zq3.h(ss2Var, "nextFunction");
        return obj == null ? kotlin.sequences.a.a : new b(new qs2() { // from class: kotlin.sequences.SequencesKt__SequencesKt$generateSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                return obj;
            }
        }, ss2Var);
    }

    public static ak7 g(Object... objArr) {
        zq3.h(objArr, "elements");
        return kotlin.collections.d.R(objArr);
    }
}
