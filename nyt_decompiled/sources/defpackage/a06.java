package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import defpackage.yn1;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public interface a06 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final wn1 a() {
            DevSettingSwitchItem a2;
            a2 = DevSettingSwitchItemKt.a("Allow rotation", (r23 & 2) != 0 ? null : "Allow the app to rotate on every screen", (r23 & 4) != 0 ? null : "App is fixed in portrait", "portrait_lock", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : true, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Allow rotation" : null, (r23 & 512) != 0 ? null : null);
            return new DevSettingGroupExpandable("Portrait Lock", i.e(a2), null, false, yn1.c.b, null, false, false, 236, null);
        }
    }
}
