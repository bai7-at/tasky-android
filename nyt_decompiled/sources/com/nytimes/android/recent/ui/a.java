package com.nytimes.android.recent.ui;

import defpackage.lk6;
import defpackage.ml6;
import defpackage.wh6;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class a {
    private final int a;
    private final int b;
    private final int c;

    /* renamed from: com.nytimes.android.recent.ui.a$a, reason: collision with other inner class name */
    public static final class C0382a extends a {
        public static final C0382a d = new C0382a();

        private C0382a() {
            super(ml6.forced_logout_title, lk6.recents_not_logged_in_message, wh6.recents_login_view, null);
        }
    }

    public /* synthetic */ a(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    private a(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
