package defpackage;

import com.google.android.exoplayer2.t0;

/* loaded from: classes2.dex */
public interface qs4 {
    public static final qs4 a = new a();

    class a implements qs4 {
        a() {
        }

        @Override // defpackage.qs4
        public boolean b(t0 t0Var) {
            String str = t0Var.l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // defpackage.qs4
        public ps4 c(t0 t0Var) {
            String str = t0Var.l;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new km();
                    case "application/x-icy":
                        return new pe3();
                    case "application/id3":
                        return new re3();
                    case "application/x-emsg":
                        return new i42();
                    case "application/x-scte35":
                        return new com.google.android.exoplayer2.metadata.scte35.a();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean b(t0 t0Var);

    ps4 c(t0 t0Var);
}
