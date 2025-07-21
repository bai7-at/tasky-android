package defpackage;

import android.content.Context;
import com.airbnb.lottie.AsyncUpdates;
import java.io.File;

/* loaded from: classes.dex */
public abstract class yx3 {
    public static boolean a = false;
    private static boolean b = false;
    private static boolean c = true;
    private static boolean d = true;
    private static AsyncUpdates e = AsyncUpdates.AUTOMATIC;
    private static vc4 f;
    private static uc4 g;
    private static volatile u35 h;
    private static volatile q35 i;
    private static ThreadLocal j;

    public static void b(String str) {
        if (b) {
            f().a(str);
        }
    }

    public static float c(String str) {
        if (b) {
            return f().b(str);
        }
        return 0.0f;
    }

    public static AsyncUpdates d() {
        return e;
    }

    public static boolean e() {
        return d;
    }

    private static ad4 f() {
        ad4 ad4Var = (ad4) j.get();
        if (ad4Var != null) {
            return ad4Var;
        }
        ad4 ad4Var2 = new ad4();
        j.set(ad4Var2);
        return ad4Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ File g(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static q35 h(Context context) {
        if (!c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        q35 q35Var = i;
        if (q35Var == null) {
            synchronized (q35.class) {
                try {
                    q35Var = i;
                    if (q35Var == null) {
                        uc4 uc4Var = g;
                        if (uc4Var == null) {
                            uc4Var = new uc4() { // from class: xx3
                                @Override // defpackage.uc4
                                public final File a() {
                                    File g2;
                                    g2 = yx3.g(applicationContext);
                                    return g2;
                                }
                            };
                        }
                        q35Var = new q35(uc4Var);
                        i = q35Var;
                    }
                } finally {
                }
            }
        }
        return q35Var;
    }

    public static u35 i(Context context) {
        u35 u35Var = h;
        if (u35Var == null) {
            synchronized (u35.class) {
                try {
                    u35Var = h;
                    if (u35Var == null) {
                        q35 h2 = h(context);
                        vc4 vc4Var = f;
                        if (vc4Var == null) {
                            vc4Var = new ki1();
                        }
                        u35Var = new u35(h2, vc4Var);
                        h = u35Var;
                    }
                } finally {
                }
            }
        }
        return u35Var;
    }
}
