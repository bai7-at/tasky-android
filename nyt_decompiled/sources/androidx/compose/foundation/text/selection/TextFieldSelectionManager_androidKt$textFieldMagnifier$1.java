package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.j;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bu1;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.fu1;
import defpackage.hn3;
import defpackage.in3;
import defpackage.it2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1 extends Lambda implements it2 {
    final /* synthetic */ TextFieldSelectionManager $manager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager_androidKt$textFieldMagnifier$1(TextFieldSelectionManager textFieldSelectionManager) {
        super(3);
        this.$manager = textFieldSelectionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(sy4 sy4Var) {
        return ((hn3) sy4Var.getValue()).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(sy4 sy4Var, long j) {
        sy4Var.setValue(hn3.b(j));
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        composer.z(1980580247);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1980580247, i, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:45)");
        }
        final fm1 fm1Var = (fm1) composer.m(CompositionLocalsKt.e());
        composer.z(-492369756);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(hn3.b(hn3.b.a()), null, 2, null);
            composer.q(A);
        }
        composer.R();
        final sy4 sy4Var = (sy4) A;
        final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
        qs2 qs2Var = new qs2() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final long b() {
                return TextFieldSelectionManagerKt.b(TextFieldSelectionManager.this, TextFieldSelectionManager_androidKt$textFieldMagnifier$1.d(sy4Var));
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return fd5.d(b());
            }
        };
        composer.z(-233457119);
        boolean S = composer.S(sy4Var) | composer.S(fm1Var);
        Object A2 = composer.A();
        if (S || A2 == aVar.a()) {
            A2 = new ss2() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Modifier invoke(final qs2 qs2Var2) {
                    Modifier d;
                    Modifier.a aVar2 = Modifier.a;
                    ss2 ss2Var = new ss2() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.1
                        {
                            super(1);
                        }

                        public final long b(fm1 fm1Var2) {
                            return ((fd5) qs2.this.mo865invoke()).x();
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return fd5.d(b((fm1) obj));
                        }
                    };
                    final fm1 fm1Var2 = fm1.this;
                    final sy4 sy4Var2 = sy4Var;
                    d = Magnifier_androidKt.d(aVar2, ss2Var, (r23 & 2) != 0 ? null : null, (r23 & 4) != 0 ? null : new ss2() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(long j) {
                            sy4 sy4Var3 = sy4Var2;
                            fm1 fm1Var3 = fm1.this;
                            TextFieldSelectionManager_androidKt$textFieldMagnifier$1.g(sy4Var3, in3.a(fm1Var3.l0(fu1.h(j)), fm1Var3.l0(fu1.g(j))));
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b(((fu1) obj).k());
                            return ww8.a;
                        }
                    }, (r23 & 8) != 0 ? Float.NaN : 0.0f, (r23 & 16) != 0 ? false : true, (r23 & 32) != 0 ? fu1.b.a() : 0L, (r23 & 64) != 0 ? bu1.b.c() : 0.0f, (r23 & 128) != 0 ? bu1.b.c() : 0.0f, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0, (r23 & 512) == 0 ? j.a.a() : null);
                    return d;
                }
            };
            composer.q(A2);
        }
        composer.R();
        Modifier d = SelectionMagnifierKt.d(modifier, qs2Var, (ss2) A2);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return d;
    }
}
