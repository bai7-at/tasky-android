package defpackage;

import androidx.compose.material.ColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;

/* loaded from: classes4.dex */
public final class xg1 implements ho1 {
    @Override // defpackage.ho1
    public ro0 a(Composer composer, int i) {
        composer.z(-40478846);
        if (b.G()) {
            b.S(-40478846, i, -1, "com.nytimes.android.devsettings.di.DefaultDevSettingsMaterialTheme.devSettingsDarkColors (DevSettingsTheme.kt:36)");
        }
        ro0 d = ColorsKt.d(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return d;
    }

    @Override // defpackage.ho1
    public ro0 b(Composer composer, int i) {
        ro0 g;
        composer.z(1616725518);
        if (b.G()) {
            b.S(1616725518, i, -1, "com.nytimes.android.devsettings.di.DefaultDevSettingsMaterialTheme.devSettingsLightColors (DevSettingsTheme.kt:33)");
        }
        g = ColorsKt.g((r43 & 1) != 0 ? wn0.d(4284612846L) : 0L, (r43 & 2) != 0 ? wn0.d(4281794739L) : 0L, (r43 & 4) != 0 ? wn0.d(4278442694L) : 0L, (r43 & 8) != 0 ? wn0.d(4278290310L) : 0L, (r43 & 16) != 0 ? nn0.b.h() : 0L, (r43 & 32) != 0 ? nn0.b.h() : 0L, (r43 & 64) != 0 ? wn0.d(4289724448L) : 0L, (r43 & 128) != 0 ? nn0.b.h() : 0L, (r43 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? nn0.b.a() : 0L, (r43 & 512) != 0 ? nn0.b.a() : 0L, (r43 & 1024) != 0 ? nn0.b.a() : 0L, (r43 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nn0.b.h() : 0L);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return g;
    }

    @Override // defpackage.ho1
    public kp7 c(Composer composer, int i) {
        composer.z(966844912);
        if (b.G()) {
            b.S(966844912, i, -1, "com.nytimes.android.devsettings.di.DefaultDevSettingsMaterialTheme.devSettingsShapes (DevSettingsTheme.kt:45)");
        }
        kp7 b = ag4.a.b(composer, ag4.b);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return b;
    }

    @Override // defpackage.ho1
    public av8 d(Composer composer, int i) {
        composer.z(-1202466432);
        if (b.G()) {
            b.S(-1202466432, i, -1, "com.nytimes.android.devsettings.di.DefaultDevSettingsMaterialTheme.devSettingsDarkTypography (DevSettingsTheme.kt:42)");
        }
        av8 c = ag4.a.c(composer, ag4.b);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return c;
    }

    @Override // defpackage.ho1
    public av8 e(Composer composer, int i) {
        composer.z(-1447463924);
        if (b.G()) {
            b.S(-1447463924, i, -1, "com.nytimes.android.devsettings.di.DefaultDevSettingsMaterialTheme.devSettingsLightTypography (DevSettingsTheme.kt:39)");
        }
        av8 c = ag4.a.c(composer, ag4.b);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return c;
    }
}
