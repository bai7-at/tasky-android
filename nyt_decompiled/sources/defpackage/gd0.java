package defpackage;

import android.app.Application;
import com.nytimes.android.eventtracker.buffer.db.BufferedEventDatabase;

/* loaded from: classes4.dex */
public abstract class gd0 implements ba2 {
    public static BufferedEventDatabase a(Application application) {
        return (BufferedEventDatabase) g16.e(dd0.a.c(application));
    }
}
