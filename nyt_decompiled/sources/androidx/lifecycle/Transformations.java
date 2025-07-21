package androidx.lifecycle;

import defpackage.lt2;
import defpackage.ss2;
import defpackage.st2;
import defpackage.vc5;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes.dex */
public abstract class Transformations {

    static final class a implements vc5, st2 {
        private final /* synthetic */ ss2 a;

        a(ss2 ss2Var) {
            zq3.h(ss2Var, "function");
            this.a = ss2Var;
        }

        @Override // defpackage.vc5
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        @Override // defpackage.st2
        public final lt2 b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof vc5) && (obj instanceof st2)) {
                return zq3.c(b(), ((st2) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public static final LiveData a(LiveData liveData) {
        zq3.h(liveData, "<this>");
        final j jVar = new j();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        if (liveData.i()) {
            jVar.p(liveData.f());
            ref$BooleanRef.element = false;
        }
        jVar.q(liveData, new a(new ss2() { // from class: androidx.lifecycle.Transformations$distinctUntilChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m117invoke(obj);
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m117invoke(Object obj) {
                Object f = j.this.f();
                if (ref$BooleanRef.element || ((f == null && obj != null) || !(f == null || zq3.c(f, obj)))) {
                    ref$BooleanRef.element = false;
                    j.this.p(obj);
                }
            }
        }));
        return jVar;
    }

    public static final LiveData b(LiveData liveData, final ss2 ss2Var) {
        zq3.h(liveData, "<this>");
        zq3.h(ss2Var, "transform");
        final j jVar = new j();
        jVar.q(liveData, new a(new ss2() { // from class: androidx.lifecycle.Transformations$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m118invoke(obj);
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m118invoke(Object obj) {
                j.this.p(ss2Var.invoke(obj));
            }
        }));
        return jVar;
    }
}
