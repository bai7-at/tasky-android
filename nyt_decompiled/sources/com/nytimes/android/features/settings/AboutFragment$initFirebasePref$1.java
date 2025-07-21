package com.nytimes.android.features.settings;

import android.content.ClipboardManager;
import android.content.Context;
import androidx.preference.Preference;
import com.nytimes.android.features.settings.AboutFragment$initFirebasePref$1;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xk6;
import defpackage.xx0;
import defpackage.zm8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

@fc1(c = "com.nytimes.android.features.settings.AboutFragment$initFirebasePref$1", f = "AboutFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AboutFragment$initFirebasePref$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Preference $firebaseIdPref;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AboutFragment this$0;

    /* renamed from: com.nytimes.android.features.settings.AboutFragment$initFirebasePref$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends Lambda implements ss2 {
        final /* synthetic */ Preference $firebaseIdPref;
        final /* synthetic */ String $firebaseInstanceId;
        final /* synthetic */ AboutFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Preference preference, AboutFragment aboutFragment, String str) {
            super(1);
            this.$firebaseIdPref = preference;
            this.this$0 = aboutFragment;
            this.$firebaseInstanceId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(ClipboardManager clipboardManager, AboutFragment aboutFragment, String str, Preference preference) {
            zq3.h(clipboardManager, "$this_withClipboardManager");
            zq3.h(aboutFragment, "this$0");
            zq3.h(str, "$firebaseInstanceId");
            zq3.h(preference, "it");
            String string = aboutFragment.getString(xk6.settings_firebase_id_title);
            zq3.g(string, "getString(...)");
            xx0.a(clipboardManager, string, str);
            zm8.f(aboutFragment.getContext(), xk6.copied_to_clipboard, 0);
            return true;
        }

        public final void c(final ClipboardManager clipboardManager) {
            zq3.h(clipboardManager, "$this$withClipboardManager");
            Preference preference = this.$firebaseIdPref;
            final AboutFragment aboutFragment = this.this$0;
            final String str = this.$firebaseInstanceId;
            preference.y0(new Preference.d() { // from class: com.nytimes.android.features.settings.b
                @Override // androidx.preference.Preference.d
                public final boolean a(Preference preference2) {
                    boolean d;
                    d = AboutFragment$initFirebasePref$1.AnonymousClass1.d(clipboardManager, aboutFragment, str, preference2);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AboutFragment$initFirebasePref$1(Preference preference, AboutFragment aboutFragment, by0 by0Var) {
        super(2, by0Var);
        this.$firebaseIdPref = preference;
        this.this$0 = aboutFragment;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(String str, by0 by0Var) {
        return ((AboutFragment$initFirebasePref$1) create(str, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AboutFragment$initFirebasePref$1 aboutFragment$initFirebasePref$1 = new AboutFragment$initFirebasePref$1(this.$firebaseIdPref, this.this$0, by0Var);
        aboutFragment$initFirebasePref$1.L$0 = obj;
        return aboutFragment$initFirebasePref$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        String str = (String) this.L$0;
        this.$firebaseIdPref.C0(str);
        Context context = this.this$0.getContext();
        if (context != null) {
            xx0.b(context, new AnonymousClass1(this.$firebaseIdPref, this.this$0, str));
        }
        return ww8.a;
    }
}
