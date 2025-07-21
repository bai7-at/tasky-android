package defpackage;

import android.text.TextUtils;
import co.datadome.sdk.c;
import com.google.android.gms.internal.ads.zzead;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s5d implements f5e {
    private static final Pattern d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String a;
    private final f7e b;
    private final q7e c;

    public s5d(String str, q7e q7eVar, f7e f7eVar) {
        this.a = str;
        this.c = q7eVar;
        this.b = f7eVar;
    }

    @Override // defpackage.f5e
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject;
        v9b v9bVar;
        zzead zzeadVar;
        v9b v9bVar2;
        v9b v9bVar3;
        v9b v9bVar4;
        v9b v9bVar5;
        v9b v9bVar6;
        v9b v9bVar7;
        v9b v9bVar8;
        JSONObject jSONObject2;
        String str;
        r5d r5dVar = (r5d) obj;
        jSONObject = r5dVar.a;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        v9bVar = r5dVar.b;
        String str2 = "";
        if (v9bVar.a() != -2) {
            if (v9bVar.a() == 1) {
                if (v9bVar.f() != null) {
                    str2 = TextUtils.join(", ", v9bVar.f());
                    fgb.d(str2);
                }
                zzeadVar = new zzead(2, "Error building request URL: ".concat(String.valueOf(str2)));
            } else {
                zzeadVar = new zzead(1);
            }
            q7e q7eVar = this.c;
            f7e f7eVar = this.b;
            f7eVar.d(zzeadVar);
            f7eVar.S(false);
            q7eVar.a(f7eVar);
            throw zzeadVar;
        }
        HashMap hashMap = new HashMap();
        v9bVar2 = r5dVar.b;
        if (v9bVar2.h() && !TextUtils.isEmpty(this.a)) {
            if (((Boolean) pla.c().a(mpa.O0)).booleanValue()) {
                String str3 = this.a;
                if (TextUtils.isEmpty(str3)) {
                    str = "";
                } else {
                    Matcher matcher = d.matcher(str3);
                    str = "";
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (group != null) {
                            Locale locale = Locale.ROOT;
                            if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("; ");
                                }
                                str = str.concat(group);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(c.HTTP_HEADER_COOKIE, str);
                }
            } else {
                hashMap.put(c.HTTP_HEADER_COOKIE, this.a);
            }
        }
        v9bVar3 = r5dVar.b;
        if (v9bVar3.i()) {
            jSONObject2 = r5dVar.a;
            t5d.a(hashMap, jSONObject2);
        }
        v9bVar4 = r5dVar.b;
        if (v9bVar4 != null) {
            v9bVar7 = r5dVar.b;
            if (!TextUtils.isEmpty(v9bVar7.d())) {
                v9bVar8 = r5dVar.b;
                str2 = v9bVar8.d();
            }
        }
        q7e q7eVar2 = this.c;
        f7e f7eVar2 = this.b;
        f7eVar2.S(true);
        q7eVar2.a(f7eVar2);
        v9bVar5 = r5dVar.b;
        String e = v9bVar5.e();
        byte[] bytes = str2.getBytes(ege.c);
        v9bVar6 = r5dVar.b;
        return new k5d(e, optInt, hashMap, bytes, "", v9bVar6.i());
    }
}
