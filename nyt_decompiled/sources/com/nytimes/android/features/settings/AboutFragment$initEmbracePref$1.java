package com.nytimes.android.features.settings;

import android.content.ClipboardManager;
import androidx.preference.Preference;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xk6;
import defpackage.xx0;
import defpackage.zm8;
import defpackage.zq3;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
final class AboutFragment$initEmbracePref$1 extends Lambda implements ss2 {
    final /* synthetic */ Preference $embracePref;
    final /* synthetic */ String $identifier;
    final /* synthetic */ AboutFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AboutFragment$initEmbracePref$1(Preference preference, AboutFragment aboutFragment, String str) {
        super(1);
        this.$embracePref = preference;
        this.this$0 = aboutFragment;
        this.$identifier = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(ClipboardManager clipboardManager, AboutFragment aboutFragment, String str, Preference preference) {
        zq3.h(clipboardManager, "$this_withClipboardManager");
        zq3.h(aboutFragment, "this$0");
        zq3.h(str, "$identifier");
        zq3.h(preference, "it");
        String string = aboutFragment.getString(xk6.settings_embrace_id_title);
        zq3.g(string, "getString(...)");
        xx0.a(clipboardManager, string, str);
        zm8.f(aboutFragment.getContext(), xk6.copied_to_clipboard, 0);
        return true;
    }

    public final void c(final ClipboardManager clipboardManager) {
        zq3.h(clipboardManager, "$this$withClipboardManager");
        Preference preference = this.$embracePref;
        final AboutFragment aboutFragment = this.this$0;
        final String str = this.$identifier;
        preference.y0(new Preference.d() { // from class: com.nytimes.android.features.settings.a
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference2) {
                boolean d;
                d = AboutFragment$initEmbracePref$1.d(clipboardManager, aboutFragment, str, preference2);
                return d;
            }
        });
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        c((ClipboardManager) obj);
        return ww8.a;
    }
}
