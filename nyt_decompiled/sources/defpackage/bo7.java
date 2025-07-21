package defpackage;

import com.nytimes.android.media.audio.AudioManager;
import com.nytimes.android.media.util.MediaDurationFormatter;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.snackbar.SnackbarUtil;

/* loaded from: classes4.dex */
public abstract class bo7 implements ba2 {
    public static ao7 a(zh4 zh4Var, AudioManager audioManager, hb5 hb5Var, bo4 bo4Var, ax axVar, SnackbarUtil snackbarUtil, MediaDurationFormatter mediaDurationFormatter, NetworkStatus networkStatus) {
        return new ao7(zh4Var, audioManager, hb5Var, bo4Var, axVar, snackbarUtil, mediaDurationFormatter, networkStatus);
    }
}
