package defpackage;

import com.google.android.exoplayer2.t0;

/* loaded from: classes2.dex */
public interface wb8 {
    public static final wb8 a = new a();

    class a implements wb8 {
        a() {
        }

        @Override // defpackage.wb8
        public boolean b(t0 t0Var) {
            String str = t0Var.l;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // defpackage.wb8
        public vb8 c(t0 t0Var) {
            String str = t0Var.l;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new vw1(t0Var.n);
                    case "application/pgs":
                        return new vs5();
                    case "application/x-mp4-vtt":
                        return new sw4();
                    case "text/vtt":
                        return new xf9();
                    case "application/x-quicktime-tx3g":
                        return new iu8(t0Var.n);
                    case "text/x-ssa":
                        return new a08(t0Var.n);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new li0(str, t0Var.Y, 16000L);
                    case "text/x-exoplayer-cues":
                        return new r72();
                    case "application/cea-708":
                        return new ni0(t0Var.Y, t0Var.n);
                    case "application/x-subrip":
                        return new sa8();
                    case "application/ttml+xml":
                        return new ut8();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean b(t0 t0Var);

    vb8 c(t0 t0Var);
}
