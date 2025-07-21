package defpackage;

import androidx.fragment.app.Fragment;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.features.settings.SettingsPageEventSender;

/* loaded from: classes4.dex */
public abstract class hn7 implements ba2 {
    public static SettingsPageEventSender a(Fragment fragment, ET2Scope eT2Scope) {
        return (SettingsPageEventSender) g16.e(gn7.Companion.a(fragment, eT2Scope));
    }
}
