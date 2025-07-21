package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class l95 {

    public static class a {
        final Bundle a;
        private IconCompat b;
        private final cw6[] c;
        private final cw6[] d;
        private boolean e;
        boolean f;
        private final int g;
        private final boolean h;
        public int i;
        public CharSequence j;
        public PendingIntent k;
        private boolean l;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.c(null, "", i) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        public Bundle c() {
            return this.a;
        }

        public IconCompat d() {
            int i;
            if (this.b == null && (i = this.i) != 0) {
                this.b = IconCompat.c(null, "", i);
            }
            return this.b;
        }

        public cw6[] e() {
            return this.c;
        }

        public int f() {
            return this.g;
        }

        public boolean g() {
            return this.f;
        }

        public CharSequence h() {
            return this.j;
        }

        public boolean i() {
            return this.l;
        }

        public boolean j() {
            return this.h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, cw6[] cw6VarArr, cw6[] cw6VarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.i = iconCompat.e();
            }
            this.j = e.e(charSequence);
            this.k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = cw6VarArr;
            this.d = cw6VarArr2;
            this.e = z;
            this.g = i;
            this.f = z2;
            this.h = z3;
            this.l = z4;
        }
    }

    public static class b extends f {
        private IconCompat e;
        private IconCompat f;
        private boolean g;
        private CharSequence h;
        private boolean i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: l95$b$b, reason: collision with other inner class name */
        private static class C0504b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        @Override // l95.f
        public void b(g95 g95Var) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(g95Var.a()).setBigContentTitle(this.b);
            IconCompat iconCompat = this.e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0504b.a(bigContentTitle, this.e.m(g95Var instanceof o95 ? ((o95) g95Var).e() : null));
                } else if (iconCompat.g() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.e.d());
                }
            }
            if (this.g) {
                if (this.f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f.m(g95Var instanceof o95 ? ((o95) g95Var).e() : null));
                }
            }
            if (this.d) {
                bigContentTitle.setSummaryText(this.c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0504b.c(bigContentTitle, this.i);
                C0504b.b(bigContentTitle, this.h);
            }
        }

        @Override // l95.f
        protected String d() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b i(Bitmap bitmap) {
            this.f = bitmap == null ? null : IconCompat.b(bitmap);
            this.g = true;
            return this;
        }

        public b j(Bitmap bitmap) {
            this.e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }
    }

    public static class c extends f {
        private CharSequence e;

        @Override // l95.f
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // l95.f
        public void b(g95 g95Var) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(g95Var.a()).setBigContentTitle(this.b).bigText(this.e);
            if (this.d) {
                bigText.setSummaryText(this.c);
            }
        }

        @Override // l95.f
        protected String d() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c i(CharSequence charSequence) {
            this.e = e.e(charSequence);
            return this;
        }

        public c j(CharSequence charSequence) {
            this.b = e.e(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static abstract class f {
        protected e a;
        CharSequence b;
        CharSequence c;
        boolean d = false;

        public void a(Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String d = d();
            if (d != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", d);
            }
        }

        public abstract void b(g95 g95Var);

        public Notification c() {
            e eVar = this.a;
            if (eVar != null) {
                return eVar.c();
            }
            return null;
        }

        protected String d() {
            return null;
        }

        public RemoteViews e(g95 g95Var) {
            return null;
        }

        public RemoteViews f(g95 g95Var) {
            return null;
        }

        public RemoteViews g(g95 g95Var) {
            return null;
        }

        public void h(e eVar) {
            if (this.a != eVar) {
                this.a = eVar;
                if (eVar != null) {
                    eVar.A(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        return bitmap;
    }

    public static class e {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        Notification R;
        boolean S;
        Object T;
        public ArrayList U;
        public Context a;
        public ArrayList b;
        public ArrayList c;
        ArrayList d;
        CharSequence e;
        CharSequence f;
        PendingIntent g;
        PendingIntent h;
        RemoteViews i;
        IconCompat j;
        CharSequence k;
        int l;
        int m;
        boolean n;
        boolean o;
        f p;
        CharSequence q;
        CharSequence r;
        CharSequence[] s;
        int t;
        int u;
        boolean v;
        String w;
        boolean x;
        String y;
        boolean z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
                return builder.setLegacyStreamType(i);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }
        }

        public e(Context context, String str) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.m = 0;
            this.U = new ArrayList();
            this.Q = true;
        }

        protected static CharSequence e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void p(int i, boolean z) {
            if (z) {
                Notification notification = this.R;
                notification.flags = i | notification.flags;
            } else {
                Notification notification2 = this.R;
                notification2.flags = (~i) & notification2.flags;
            }
        }

        public e A(f fVar) {
            if (this.p != fVar) {
                this.p = fVar;
                if (fVar != null) {
                    fVar.h(this);
                }
            }
            return this;
        }

        public e B(CharSequence charSequence) {
            this.R.tickerText = e(charSequence);
            return this;
        }

        public e C(long[] jArr) {
            this.R.vibrate = jArr;
            return this;
        }

        public e D(int i) {
            this.F = i;
            return this;
        }

        public e E(long j) {
            this.R.when = j;
            return this;
        }

        public e a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new o95(this).c();
        }

        public Bundle d() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e f(boolean z) {
            p(16, z);
            return this;
        }

        public e g(int i) {
            this.L = i;
            return this;
        }

        public e h(String str) {
            this.K = str;
            return this;
        }

        public e i(int i) {
            this.E = i;
            return this;
        }

        public e j(boolean z) {
            this.A = z;
            this.B = true;
            return this;
        }

        public e k(PendingIntent pendingIntent) {
            this.g = pendingIntent;
            return this;
        }

        public e l(CharSequence charSequence) {
            this.f = e(charSequence);
            return this;
        }

        public e m(CharSequence charSequence) {
            this.e = e(charSequence);
            return this;
        }

        public e n(int i) {
            Notification notification = this.R;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e o(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        public e q(String str) {
            this.w = str;
            return this;
        }

        public e r(Bitmap bitmap) {
            this.j = bitmap == null ? null : IconCompat.b(l95.b(this.a, bitmap));
            return this;
        }

        public e s(int i, int i2, int i3) {
            Notification notification = this.R;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e t(boolean z) {
            this.z = z;
            return this;
        }

        public e u(int i) {
            this.l = i;
            return this;
        }

        public e v(boolean z) {
            p(2, z);
            return this;
        }

        public e w(int i) {
            this.m = i;
            return this;
        }

        public e x(boolean z) {
            this.n = z;
            return this;
        }

        public e y(int i) {
            this.R.icon = i;
            return this;
        }

        public e z(Uri uri) {
            Notification notification = this.R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e = a.e(a.c(a.b(), 4), 5);
            this.R.audioAttributes = a.a(e);
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
