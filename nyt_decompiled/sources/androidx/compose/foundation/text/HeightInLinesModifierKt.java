package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ak8;
import defpackage.bu1;
import defpackage.fi8;
import defpackage.fm1;
import defpackage.hn3;
import defpackage.it2;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;

/* loaded from: classes.dex */
public abstract class HeightInLinesModifierKt {
    public static final Modifier a(Modifier modifier, final j jVar, final int i, final int i2) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), new it2() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            private static final Object b(x08 x08Var) {
                return x08Var.getValue();
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i3) {
                composer.z(408240218);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(408240218, i3, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
                }
                HeightInLinesModifierKt.b(i, i2);
                if (i == 1 && i2 == Integer.MAX_VALUE) {
                    Modifier.a aVar = Modifier.a;
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                    composer.R();
                    return aVar;
                }
                fm1 fm1Var = (fm1) composer.m(CompositionLocalsKt.e());
                e.b bVar = (e.b) composer.m(CompositionLocalsKt.g());
                LayoutDirection layoutDirection = (LayoutDirection) composer.m(CompositionLocalsKt.j());
                j jVar2 = jVar;
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
                    int i4 = q != null ? q.i() : l.b.b();
                    m r = jVar3.r();
                    A2 = bVar.a(n, s, i4, r != null ? r.m() : m.b.a());
                    composer.q(A2);
                }
                composer.R();
                x08 x08Var = (x08) A2;
                Object[] objArr = {fm1Var, bVar, jVar, layoutDirection, b(x08Var)};
                composer.z(-568225417);
                boolean z = false;
                for (int i5 = 0; i5 < 5; i5++) {
                    z |= composer.S(objArr[i5]);
                }
                Object A3 = composer.A();
                if (z || A3 == Composer.a.a()) {
                    A3 = Integer.valueOf(hn3.f(fi8.a(jVar3, fm1Var, bVar, fi8.c(), 1)));
                    composer.q(A3);
                }
                composer.R();
                int intValue = ((Number) A3).intValue();
                Object[] objArr2 = {fm1Var, bVar, jVar, layoutDirection, b(x08Var)};
                composer.z(-568225417);
                boolean z2 = false;
                for (int i6 = 0; i6 < 5; i6++) {
                    z2 |= composer.S(objArr2[i6]);
                }
                Object A4 = composer.A();
                if (z2 || A4 == Composer.a.a()) {
                    A4 = Integer.valueOf(hn3.f(fi8.a(jVar3, fm1Var, bVar, fi8.c() + '\n' + fi8.c(), 2)));
                    composer.q(A4);
                }
                composer.R();
                int intValue2 = ((Number) A4).intValue() - intValue;
                int i7 = i;
                Integer valueOf = i7 == 1 ? null : Integer.valueOf(((i7 - 1) * intValue2) + intValue);
                int i8 = i2;
                Integer valueOf2 = i8 != Integer.MAX_VALUE ? Integer.valueOf(intValue + (intValue2 * (i8 - 1))) : null;
                Modifier j = SizeKt.j(Modifier.a, valueOf != null ? fm1Var.v(valueOf.intValue()) : bu1.b.c(), valueOf2 != null ? fm1Var.v(valueOf2.intValue()) : bu1.b.c());
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return j;
            }
        });
    }

    public static final void b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException(("both minLines " + i + " and maxLines " + i2 + " must be greater than zero").toString());
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException(("minLines " + i + " must be less than or equal to maxLines " + i2).toString());
    }
}
