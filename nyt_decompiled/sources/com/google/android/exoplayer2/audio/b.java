package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.gx8;
import defpackage.ku4;
import defpackage.ur;
import defpackage.z19;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b {
    public static final b c = new b(new int[]{2}, 10);
    private static final ImmutableList d = ImmutableList.A(2, 5, 6);
    private static final ImmutableMap e = new ImmutableMap.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();
    private final int[] a;
    private final int b;

    private static final class a {
        private static final ImmutableSet<Integer> a() {
            ImmutableSet.a i = new ImmutableSet.a().i(8, 7);
            int i2 = z19.a;
            if (i2 >= 31) {
                i.i(26, 27);
            }
            if (i2 >= 33) {
                i.a(30);
            }
            return i.l();
        }

        public static final boolean b(Context context) {
            AudioDeviceInfo[] devices = ((AudioManager) ur.e((AudioManager) context.getSystemService(AssetConstants.AUDIO_TYPE))).getDevices(2);
            ImmutableSet<Integer> a = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (a.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.b$b, reason: collision with other inner class name */
    private static final class C0178b {
        private static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        public static ImmutableList<Integer> a() {
            ImmutableList.a p = ImmutableList.p();
            gx8 it2 = b.e.keySet().iterator();
            while (it2.hasNext()) {
                Integer num = (Integer) it2.next();
                int intValue = num.intValue();
                if (z19.a >= 34 || intValue != 30) {
                    if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), a)) {
                        p.a(num);
                    }
                }
            }
            p.a(2);
            return p.k();
        }

        public static int b(int i, int i2) {
            for (int i3 = 10; i3 > 0; i3--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(z19.H(i3)).build(), a)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    public b(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i;
    }

    private static boolean b() {
        if (z19.a >= 17) {
            String str = z19.c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static b c(Context context) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    static b d(Context context, Intent intent) {
        int i = z19.a;
        if (i >= 23 && a.b(context)) {
            return c;
        }
        ImmutableSet.a aVar = new ImmutableSet.a();
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            aVar.j(d);
        }
        if (i >= 29 && (z19.z0(context) || z19.u0(context))) {
            aVar.j(C0178b.a());
            return new b(Ints.l(aVar.l()), 10);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            ImmutableSet l = aVar.l();
            return !l.isEmpty() ? new b(Ints.l(l), 10) : c;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.j(Ints.c(intArrayExtra));
        }
        return new b(Ints.l(aVar.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
    }

    private static int e(int i) {
        int i2 = z19.a;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(z19.b) && i == 1) {
            i = 2;
        }
        return z19.H(i);
    }

    static Uri g() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static int h(int i, int i2) {
        return z19.a >= 29 ? C0178b.b(i, i2) : ((Integer) ur.e((Integer) e.getOrDefault(Integer.valueOf(i), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Arrays.equals(this.a, bVar.a) && this.b == bVar.b;
    }

    public Pair f(t0 t0Var) {
        int f = ku4.f((String) ur.e(t0Var.l), t0Var.i);
        if (!e.containsKey(Integer.valueOf(f))) {
            return null;
        }
        if (f == 18 && !j(18)) {
            f = 6;
        } else if ((f == 8 && !j(8)) || (f == 30 && !j(30))) {
            f = 7;
        }
        if (!j(f)) {
            return null;
        }
        int i = t0Var.M;
        if (i == -1 || f == 18) {
            int i2 = t0Var.N;
            if (i2 == -1) {
                i2 = 48000;
            }
            i = h(f, i2);
        } else if (t0Var.l.equals("audio/vnd.dts.uhd;profile=p2")) {
            if (i > 10) {
                return null;
            }
        } else if (i > this.b) {
            return null;
        }
        int e2 = e(i);
        if (e2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f), Integer.valueOf(e2));
    }

    public int hashCode() {
        return this.b + (Arrays.hashCode(this.a) * 31);
    }

    public boolean i(t0 t0Var) {
        return f(t0Var) != null;
    }

    public boolean j(int i) {
        return Arrays.binarySearch(this.a, i) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", supportedEncodings=" + Arrays.toString(this.a) + "]";
    }
}
