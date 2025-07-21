package com.nytimes.android.feedback.providers;

import android.content.Context;
import defpackage.al6;
import defpackage.c04;
import defpackage.ed2;
import defpackage.qs2;
import defpackage.rb8;
import defpackage.zm2;
import defpackage.zq3;
import java.util.Locale;
import kotlin.c;

/* loaded from: classes4.dex */
public final class FeedbackResourceProviderImpl implements ed2 {
    private final Context a;
    private final zm2 b;
    private final c04 c;

    public FeedbackResourceProviderImpl(Context context, zm2 zm2Var) {
        zq3.h(context, "context");
        zq3.h(zm2Var, "fontScaleManager");
        this.a = context;
        this.b = zm2Var;
        this.c = L(al6.feedback_na);
    }

    private final c04 L(final int i) {
        return c.a(new qs2() { // from class: com.nytimes.android.feedback.providers.FeedbackResourceProviderImpl$load$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return FeedbackResourceProviderImpl.this.K().getString(i);
            }
        });
    }

    @Override // defpackage.ed2
    public String A() {
        String string = this.a.getString(al6.feedback_email_tag_ab_tests);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String B() {
        String string = this.a.getString(al6.feedback_label_user_account);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String C() {
        String string = this.a.getString(al6.feedback_label_os_version);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public rb8 D() {
        String string = this.a.getString(al6.feedback_status_display_subscribed);
        zq3.g(string, "getString(...)");
        String string2 = this.a.getString(al6.feedback_status_tag_subscribed);
        zq3.g(string2, "getString(...)");
        return new rb8(string, string2);
    }

    @Override // defpackage.ed2
    public String E() {
        String string = this.a.getString(al6.feedback_web_user_agent);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String F() {
        String string = this.a.getString(al6.feedback_tag_status);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String G() {
        String string = this.a.getString(al6.feedback_tag_android_app);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String H() {
        String string = this.a.getString(al6.feedback_email_tag_remote_ts);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String I() {
        String string = this.a.getString(al6.feedback_email_tag_push);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public float J() {
        return this.b.d(this.a);
    }

    public final Context K() {
        return this.a;
    }

    @Override // defpackage.ed2
    public String a() {
        String string = this.a.getString(al6.feedback_tag_device);
        zq3.g(string, "getString(...)");
        if (string.length() <= 0) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        String valueOf = String.valueOf(string.charAt(0));
        zq3.f(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        zq3.g(upperCase, "toUpperCase(...)");
        sb.append((Object) upperCase);
        String substring = string.substring(1);
        zq3.g(substring, "substring(...)");
        sb.append(substring);
        return sb.toString();
    }

    @Override // defpackage.ed2
    public String b() {
        String string = this.a.getString(al6.feedback_tag_os_version);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String c() {
        String string = this.a.getString(al6.feedback_email_tag_embraceId);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String d() {
        String string = this.a.getString(al6.feedback_email_tag_memory);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String e() {
        String string = this.a.getString(al6.feedback_email_tag_date);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String f() {
        return (String) this.c.getValue();
    }

    @Override // defpackage.ed2
    public String g() {
        String string = this.a.getString(al6.feedback_label_status);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String h() {
        String string = this.a.getString(al6.feedback_label_app_version);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String i() {
        String string = this.a.getString(al6.feedback_email_tag_cuid);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public rb8 j() {
        String string = this.a.getString(al6.feedback_status_display_unregistered);
        zq3.g(string, "getString(...)");
        String string2 = this.a.getString(al6.feedback_status_tag_unregistered);
        zq3.g(string2, "getString(...)");
        return new rb8(string, string2);
    }

    @Override // defpackage.ed2
    public rb8 k() {
        String string = this.a.getString(al6.feedback_status_display_registered);
        zq3.g(string, "getString(...)");
        String string2 = this.a.getString(al6.feedback_status_tag_registered);
        zq3.g(string2, "getString(...)");
        return new rb8(string, string2);
    }

    @Override // defpackage.ed2
    public String l() {
        String string = this.a.getString(al6.feedback_tag_app_version);
        zq3.g(string, "getString(...)");
        if (string.length() <= 0) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        String valueOf = String.valueOf(string.charAt(0));
        zq3.f(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        zq3.g(upperCase, "toUpperCase(...)");
        sb.append((Object) upperCase);
        String substring = string.substring(1);
        zq3.g(substring, "substring(...)");
        sb.append(substring);
        return sb.toString();
    }

    @Override // defpackage.ed2
    public String m() {
        String string = this.a.getString(al6.feedback_email_tag_logId);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String n() {
        String string = this.a.getString(al6.feedback_tag_build_number);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String o() {
        String string = this.a.getString(al6.feedback_email_tag_disk);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String p() {
        String string = this.a.getString(al6.feedback_email_tag_fpc);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public rb8 q() {
        String string = this.a.getString(al6.feedback_status_display_subscribed_unlinked);
        zq3.g(string, "getString(...)");
        String string2 = this.a.getString(al6.feedback_status_tag_subscribed_unlinked);
        zq3.g(string2, "getString(...)");
        return new rb8(string, string2);
    }

    @Override // defpackage.ed2
    public String r() {
        String string = this.a.getString(al6.feedback_email_tag_text_size);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String s() {
        String string = this.a.getString(al6.feedback_email_tag_remote_source);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String t() {
        String string = this.a.getString(al6.feedback_email_tag_csid);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String u() {
        String string = this.a.getString(al6.feedback_tag_os_version);
        zq3.g(string, "getString(...)");
        if (string.length() <= 0) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        String valueOf = String.valueOf(string.charAt(0));
        zq3.f(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        zq3.g(upperCase, "toUpperCase(...)");
        sb.append((Object) upperCase);
        String substring = string.substring(1);
        zq3.g(substring, "substring(...)");
        sb.append(substring);
        return sb.toString();
    }

    @Override // defpackage.ed2
    public rb8 v() {
        String string = this.a.getString(al6.feedback_status_display_unknown);
        zq3.g(string, "getString(...)");
        String string2 = this.a.getString(al6.feedback_status_tag_unknown);
        zq3.g(string2, "getString(...)");
        return new rb8(string, string2);
    }

    @Override // defpackage.ed2
    public String w() {
        String string = this.a.getString(al6.feedback_tag_device);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String x() {
        String string = this.a.getString(al6.feedback_tag_app_version);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String y() {
        String string = this.a.getString(al6.feedback_email_tag_account);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.ed2
    public String z() {
        String string = this.a.getString(al6.feedback_tag_android);
        zq3.g(string, "getString(...)");
        return string;
    }
}
