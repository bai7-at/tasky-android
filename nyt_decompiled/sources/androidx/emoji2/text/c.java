package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.emoji2.text.e;
import defpackage.h16;
import defpackage.sm2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    public static class a {
        private final b a;

        public a(b bVar) {
            this.a = bVar == null ? e() : bVar;
        }

        private e.c a(Context context, sm2 sm2Var) {
            if (sm2Var == null) {
                return null;
            }
            return new i(context, sm2Var);
        }

        private List b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        private sm2 d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new sm2(str, str2, "emojicompat-emoji-font", b(this.a.b(packageManager, str2)));
        }

        private static b e() {
            return new d();
        }

        private boolean f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        private ProviderInfo g(PackageManager packageManager) {
            Iterator it2 = this.a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it2.hasNext()) {
                ProviderInfo a = this.a.a((ResolveInfo) it2.next());
                if (f(a)) {
                    return a;
                }
            }
            return null;
        }

        public e.c c(Context context) {
            return a(context, h(context));
        }

        sm2 h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            h16.h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g = g(packageManager);
            if (g == null) {
                return null;
            }
            try {
                return d(g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    public static class b {
        public abstract ProviderInfo a(ResolveInfo resolveInfo);

        public abstract Signature[] b(PackageManager packageManager, String str);

        public abstract List c(PackageManager packageManager, Intent intent, int i);
    }

    /* renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    public static class C0078c extends b {
        @Override // androidx.emoji2.text.c.b
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.c.b
        public List c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    public static class d extends C0078c {
        @Override // androidx.emoji2.text.c.b
        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static i a(Context context) {
        return (i) new a(null).c(context);
    }
}
