package com.nytimes.subauth.ui.ui.dialogs;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.it2;
import defpackage.j98;
import defpackage.k48;
import defpackage.m37;
import defpackage.mm6;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class ComposableSingletons$DeleteAccountDialogsKt {
    public static final ComposableSingletons$DeleteAccountDialogsKt a = new ComposableSingletons$DeleteAccountDialogsKt();
    public static it2 b = zr0.c(-525305484, false, new it2() { // from class: com.nytimes.subauth.ui.ui.dialogs.ComposableSingletons$DeleteAccountDialogsKt$lambda-1$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$TextButton");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-525305484, i, -1, "com.nytimes.subauth.ui.ui.dialogs.ComposableSingletons$DeleteAccountDialogsKt.lambda-1.<anonymous> (DeleteAccountDialogs.kt:194)");
            }
            String upperCase = k48.b(mm6.subauth_account_delete_cta_nevermind, composer, 0).toUpperCase(Locale.ROOT);
            zq3.g(upperCase, "toUpperCase(...)");
            TextKt.e(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, j98.a.c(composer, 8).f(), composer, 0, 0, 32766);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 c = zr0.c(977720477, false, new it2() { // from class: com.nytimes.subauth.ui.ui.dialogs.ComposableSingletons$DeleteAccountDialogsKt$lambda-2$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$TextButton");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(977720477, i, -1, "com.nytimes.subauth.ui.ui.dialogs.ComposableSingletons$DeleteAccountDialogsKt.lambda-2.<anonymous> (DeleteAccountDialogs.kt:204)");
            }
            String upperCase = k48.b(mm6.subauth_account_delete_cta_delete_account, composer, 0).toUpperCase(Locale.ROOT);
            zq3.g(upperCase, "toUpperCase(...)");
            TextKt.e(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, j98.a.c(composer, 8).f(), composer, 0, 0, 32766);
            if (b.G()) {
                b.R();
            }
        }
    });
    public static it2 d = zr0.c(-981392811, false, new it2() { // from class: com.nytimes.subauth.ui.ui.dialogs.ComposableSingletons$DeleteAccountDialogsKt$lambda-3$1
        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
            return ww8.a;
        }

        public final void invoke(m37 m37Var, Composer composer, int i) {
            zq3.h(m37Var, "$this$TextButton");
            if ((i & 81) == 16 && composer.i()) {
                composer.K();
                return;
            }
            if (b.G()) {
                b.S(-981392811, i, -1, "com.nytimes.subauth.ui.ui.dialogs.ComposableSingletons$DeleteAccountDialogsKt.lambda-3.<anonymous> (DeleteAccountDialogs.kt:223)");
            }
            String upperCase = k48.b(mm6.subauth_error_dialog_dismiss_label, composer, 0).toUpperCase(Locale.ROOT);
            zq3.g(upperCase, "toUpperCase(...)");
            TextKt.e(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, j98.a.c(composer, 8).f(), composer, 0, 0, 32766);
            if (b.G()) {
                b.R();
            }
        }
    });

    public final it2 a() {
        return b;
    }

    public final it2 b() {
        return c;
    }

    public final it2 c() {
        return d;
    }
}
