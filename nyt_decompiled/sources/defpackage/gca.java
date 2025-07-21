package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class gca extends zaa {
    private final Object m;
    private final cba n;

    public gca(int i, String str, cba cbaVar, bba bbaVar) {
        super(i, str, bbaVar);
        this.m = new Object();
        this.n = cbaVar;
    }

    protected void B(String str) {
        cba cbaVar;
        synchronized (this.m) {
            cbaVar = this.n;
        }
        cbaVar.zza(str);
    }

    @Override // defpackage.zaa
    protected final dba g(qaa qaaVar) {
        String str;
        String str2;
        try {
            byte[] bArr = qaaVar.b;
            Map map = qaaVar.c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(qaaVar.b);
        }
        return dba.b(str, rba.b(qaaVar));
    }
}
