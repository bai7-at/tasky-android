package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ak8;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.hn3;
import defpackage.it2;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.x08;

/* loaded from: classes.dex */
public abstract class TextFieldSizeKt {
    public static final Modifier a(Modifier modifier, final j jVar) {
        return ComposedModifierKt.b(modifier, null, new it2() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1
            {
                super(3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Object c(x08 x08Var) {
                return x08Var.getValue();
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.z(1582736677);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1582736677, i, -1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:38)");
                }
                fm1 fm1Var = (fm1) composer.m(CompositionLocalsKt.e());
                e.b bVar = (e.b) composer.m(CompositionLocalsKt.g());
                LayoutDirection layoutDirection = (LayoutDirection) composer.m(CompositionLocalsKt.j());
                j jVar2 = j.this;
                composer.z(511388516);
                boolean S = composer.S(jVar2) | composer.S(layoutDirection);
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = ak8.d(jVar2, layoutDirection);
                    composer.q(A);
                }
                composer.R();
                j jVar3 = (j) A;
                composer.z(511388516);
                boolean S2 = composer.S(bVar) | composer.S(jVar3);
                Object A2 = composer.A();
                if (S2 || A2 == Composer.a.a()) {
                    e n = jVar3.n();
                    o s = jVar3.s();
                    if (s == null) {
                        s = o.b.f();
                    }
                    l q = jVar3.q();
                    int i2 = q != null ? q.i() : l.b.b();
                    m r = jVar3.r();
                    A2 = bVar.a(n, s, i2, r != null ? r.m() : m.b.a());
                    composer.q(A2);
                }
                composer.R();
                x08 x08Var = (x08) A2;
                j jVar4 = j.this;
                composer.z(-492369756);
                Object A3 = composer.A();
                if (A3 == Composer.a.a()) {
                    A3 = new d(layoutDirection, fm1Var, bVar, jVar4, c(x08Var));
                    composer.q(A3);
                }
                composer.R();
                final d dVar = (d) A3;
                dVar.c(layoutDirection, fm1Var, bVar, jVar3, c(x08Var));
                Modifier a = androidx.compose.ui.layout.d.a(Modifier.a, new it2() { // from class: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1.1
                    {
                        super(3);
                    }

                    public final sg4 b(f fVar, qg4 qg4Var, long j) {
                        SizeKt.b(Modifier.a, 0.0f, 0.0f, 3, null);
                        long b = d.this.b();
                        final androidx.compose.ui.layout.l W = qg4Var.W(fv0.e(j, uo6.m(hn3.g(b), fv0.p(j), fv0.n(j)), 0, uo6.m(hn3.f(b), fv0.o(j), fv0.m(j)), 0, 10, null));
                        return f.J(fVar, W.F0(), W.v0(), null, new ss2() { // from class: androidx.compose.foundation.text.TextFieldSizeKt.textFieldMinSize.1.1.1
                            {
                                super(1);
                            }

                            public final void b(l.a aVar) {
                                l.a.j(aVar, androidx.compose.ui.layout.l.this, 0, 0, 0.0f, 4, null);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((l.a) obj);
                                return ww8.a;
                            }
                        }, 4, null);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return b((f) obj, (qg4) obj2, ((fv0) obj3).t());
                    }
                });
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return a;
            }
        }, 1, null);
    }
}
