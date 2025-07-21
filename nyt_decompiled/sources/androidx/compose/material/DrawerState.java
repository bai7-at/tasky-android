package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverKt;
import defpackage.by0;
import defpackage.ea7;
import defpackage.eu8;
import defpackage.fa7;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class DrawerState {
    public static final Companion c = new Companion(null);
    private final AnchoredDraggableState a;
    private fm1 b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ea7 a(final ss2 ss2Var) {
            return SaverKt.a(new gt2() { // from class: androidx.compose.material.DrawerState$Companion$Saver$1
                @Override // defpackage.gt2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final DrawerValue invoke(fa7 fa7Var, DrawerState drawerState) {
                    return drawerState.d();
                }
            }, new ss2() { // from class: androidx.compose.material.DrawerState$Companion$Saver$2
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final DrawerState invoke(DrawerValue drawerValue) {
                    return new DrawerState(drawerValue, ss2.this);
                }
            });
        }

        private Companion() {
        }
    }

    public DrawerState(DrawerValue drawerValue, ss2 ss2Var) {
        eu8 eu8Var;
        eu8Var = DrawerKt.d;
        this.a = new AnchoredDraggableState(drawerValue, new ss2() { // from class: androidx.compose.material.DrawerState$anchoredDraggableState$1
            {
                super(1);
            }

            public final Float b(float f) {
                fm1 f2;
                float f3;
                f2 = DrawerState.this.f();
                f3 = DrawerKt.b;
                return Float.valueOf(f2.f1(f3));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).floatValue());
            }
        }, new qs2() { // from class: androidx.compose.material.DrawerState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float mo865invoke() {
                fm1 f;
                float f2;
                f = DrawerState.this.f();
                f2 = DrawerKt.c;
                return Float.valueOf(f.f1(f2));
            }
        }, eu8Var, ss2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fm1 f() {
        fm1 fm1Var = this.b;
        if (fm1Var != null) {
            return fm1Var;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    public final Object b(by0 by0Var) {
        Object g = AnchoredDraggableKt.g(this.a, DrawerValue.Closed, 0.0f, by0Var, 2, null);
        return g == kotlin.coroutines.intrinsics.a.h() ? g : ww8.a;
    }

    public final AnchoredDraggableState c() {
        return this.a;
    }

    public final DrawerValue d() {
        return (DrawerValue) this.a.r();
    }

    public final boolean e() {
        return d() == DrawerValue.Open;
    }

    public final float g() {
        return this.a.z();
    }

    public final void h(fm1 fm1Var) {
        this.b = fm1Var;
    }
}
