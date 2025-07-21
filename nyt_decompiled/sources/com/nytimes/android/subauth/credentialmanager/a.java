package com.nytimes.android.subauth.credentialmanager;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import defpackage.e77;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a extends Fragment {
    public static final C0420a Companion = new C0420a(null);
    private static e77 a;

    /* renamed from: com.nytimes.android.subauth.credentialmanager.a$a, reason: collision with other inner class name */
    public static final class C0420a {
        public /* synthetic */ C0420a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(e77 e77Var) {
            a.a = e77Var;
        }

        private C0420a() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        e77 e77Var = a;
        if (e77Var != null) {
            e77Var.e(this, i, i2, intent);
        }
    }
}
