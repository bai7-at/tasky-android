package defpackage;

import android.content.Context;

/* loaded from: classes4.dex */
public final class ri9 extends j57 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri9(Context context, String str) {
        super(context, str);
        zq3.h(context, "appContext");
        zq3.h(str, "debugDetails");
    }

    @Override // defpackage.j57
    public String b() {
        String string = a().getString(fm6.send_word_suggestion_action_header);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.j57
    public String c() {
        String string = a().getString(fm6.suggestion_email_template_sb);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.j57
    public String d() {
        String string = a().getString(fm6.suggestion_email_recipient_sb);
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // defpackage.j57
    public String f(String str) {
        zq3.h(str, "disambiguationString");
        String string = a().getString(fm6.suggestion_email_subject_sb, str);
        zq3.g(string, "getString(...)");
        return string;
    }
}
