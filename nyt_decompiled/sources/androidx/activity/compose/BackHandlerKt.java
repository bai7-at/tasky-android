package androidx.activity.compose;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.ce5;
import defpackage.d44;
import defpackage.fe5;
import defpackage.gt2;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;

/* loaded from: classes.dex */
public abstract class BackHandlerKt {

    public static final class a extends ce5 {
        final /* synthetic */ x08 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, x08 x08Var) {
            super(z);
            this.a = x08Var;
        }

        @Override // defpackage.ce5
        public void handleOnBackPressed() {
            BackHandlerKt.b(this.a).mo865invoke();
        }
    }

    public static final void a(final boolean z, final qs2 qs2Var, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(qs2Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                z = true;
            }
            x08 o = y.o(qs2Var, h, (i3 >> 3) & 14);
            h.z(-3687241);
            Object A = h.A();
            Composer.a aVar = Composer.a;
            if (A == aVar.a()) {
                A = new a(z, o);
                h.q(A);
            }
            h.R();
            final a aVar2 = (a) A;
            Boolean valueOf = Boolean.valueOf(z);
            h.z(-3686552);
            boolean S = h.S(valueOf) | h.S(aVar2);
            Object A2 = h.A();
            if (S || A2 == aVar.a()) {
                A2 = new qs2() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m14invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m14invoke() {
                        BackHandlerKt.a.this.setEnabled(z);
                    }
                };
                h.q(A2);
            }
            h.R();
            py1.h((qs2) A2, h, 0);
            fe5 a2 = LocalOnBackPressedDispatcherOwner.a.a(h, 6);
            if (a2 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            final OnBackPressedDispatcher onBackPressedDispatcher = a2.getOnBackPressedDispatcher();
            final d44 d44Var = (d44) h.m(AndroidCompositionLocals_androidKt.i());
            py1.b(d44Var, onBackPressedDispatcher, new ss2() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$2

                public static final class a implements ms1 {
                    final /* synthetic */ BackHandlerKt.a a;

                    public a(BackHandlerKt.a aVar) {
                        this.a = aVar;
                    }

                    @Override // defpackage.ms1
                    public void dispose() {
                        this.a.remove();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ms1 invoke(ns1 ns1Var) {
                    OnBackPressedDispatcher.this.h(d44Var, aVar2);
                    return new a(aVar2);
                }
            }, h, 72);
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i5) {
                BackHandlerKt.a(z, qs2Var, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qs2 b(x08 x08Var) {
        return (qs2) x08Var.getValue();
    }
}
