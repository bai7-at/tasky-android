package defpackage;

import androidx.fragment.app.Fragment;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.features.settings.SettingsPageEventSender;

/* loaded from: classes4.dex */
public interface gn7 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final SettingsPageEventSender a(Fragment fragment, ET2Scope eT2Scope) {
            zq3.h(fragment, "fragment");
            zq3.h(eT2Scope, "et2Scope");
            return new SettingsPageEventSender(eT2Scope);
        }
    }
}
